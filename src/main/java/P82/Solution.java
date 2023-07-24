import Solution_related_classes.ListNode;

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

            ListNode sampleNode = new ListNode(-101, head);
            ListNode uniqueNode = sampleNode;
            ListNode current;
            ListNode checker =null;

            while(uniqueNode.next != null){
                current = uniqueNode.next;
                int counter = 0;

                if(current != null){
                    if (current.val != uniqueNode.val) {
                        checker = current.next;
                        innerLoop:
                        while(true){
                            if(checker == null){
                                break innerLoop;
                            }else if(checker.val == current.val){
                                checker = checker.next;
                                counter++;
                            }else if (checker.val != current.val) {
                                break innerLoop;
                            }
                        }


                    }else{
                        uniqueNode = sampleNode;
                    }


                }

                if(counter==0){
                    uniqueNode=current;
                }else{
                    if(uniqueNode.next == head){
                        head = uniqueNode.next;
                    }
                    uniqueNode.next = checker;

                }

            }

            return sampleNode.next;

        }
    }
}