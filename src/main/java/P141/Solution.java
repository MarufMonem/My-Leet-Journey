package P141;

import Solution_related_classes.ListNode;

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
public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean isThereAloop = false;
        while(head != null){
            if(head.val==10001){
                isThereAloop = true;
                return isThereAloop;
            }else{
                head.val= 10001;
                head=head.next;
            }
        }
        return isThereAloop;
    }
}
