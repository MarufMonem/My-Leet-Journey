package P142;

import Solution_related_classes.ListNode;

public class solution_v1 {

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */

    public void fixList(ListNode head, int limit){
        int counter =0;
        while(counter<=limit){
            head.val = head.val-1000000;
            counter++;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode copiedHead = head;
        int counter =0;
        if (copiedHead==null || copiedHead.next==null ){
            return null;
        }
        boolean isThereAloop = false;
        while(copiedHead.next != null){
            if(copiedHead.val>100000){
                isThereAloop = true;
                fixList(head, counter);
                return copiedHead;
            }else{
                copiedHead.val= copiedHead.val + 1000000;
                copiedHead = copiedHead.next;
                counter++;
            }
        }
        return null;
    }
}
