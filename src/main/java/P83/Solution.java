package P83;
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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            return head;
        }else{
            ListNode prev=head;
            ListNode current= prev.next;

            while(current!=null){
                if(current.val == prev.val){
                    prev.next = current.next;
                    current=current.next;
                }else{
                    prev=current;
                    current=current.next;
                }
            }
            return head;
        }
    }
}
