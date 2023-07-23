/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode l1_head = l1;
        ListNode l2_head = l2;
        ListNode headNew=null;
        ListNode tail=null;
        ListNode current = null;
        int carry=0;

        while(l1_head != null || l2_head != null){
            int sum = 0;
            int nodeVal = 0;
            if(l1_head != null && l2_head != null){
                //None of them are null yet
                sum = l1_head.val + l2_head.val + carry;
                l1_head = l1_head.next;
                l2_head = l2_head.next;
            }else if (l1_head ==null) {
                //l1 has ended so add carry to l2
                sum = l2_head.val + carry;
                l2_head = l2_head.next;
            }else if(l2_head ==null){
                //l2 has ended so add carry to l1
                sum = l1_head.val + carry;
                l1_head = l1_head.next;
            }
            //Carrys job is done
            carry=0;

            if (sum>10) {
                carry = 1;
                nodeVal = sum-10;
            }else if(sum == 10){
                carry=1;
                nodeVal= 0;
            }else{
                nodeVal=sum;
                carry = 0;
            }
            //First node?
            if (headNew==null) {
                headNew = new ListNode(nodeVal);
                current = headNew;
            }else{
                tail = new ListNode(nodeVal, null);
                current.next = tail;
                current=tail;
            }
        }
        // No list content left to add but we still have a carry
        if(carry == 1){
            tail = new ListNode(carry, null);
            current.next = tail;
            current=tail;
        }

        return headNew;

    }
}