package P206;

import Solution_related_classes.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }else{
            ListNode current = head;
            ListNode newHead = null;
            while (current != null ){
                ListNode newNode = new ListNode(current.val, newHead);
                newHead = newNode;
                current= current.next;
            }
            return  newHead;
        }
    }

    public static void main(String[] args) {


    }

}
