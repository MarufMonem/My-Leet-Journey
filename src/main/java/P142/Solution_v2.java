package P142;

import Solution_related_classes.ListNode;

public class Solution_v2 {
        public ListNode detectCycle(ListNode head) {
            if(head == null){
                //no node provided
                return null;
            }
            ListNode slowPointer=head;
            ListNode fastPointer=head;
            while(fastPointer.next !=null){
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
                if(fastPointer == null){
                    //we have reached the end of the list
                    return null;
                }else{
                    //slow and fast pointers meet
                    if(slowPointer == fastPointer){
                        slowPointer = head;
                        //we have a loop
                        while(slowPointer!=fastPointer){
                            slowPointer= slowPointer.next;
                            fastPointer = fastPointer.next;
                        }
                        return slowPointer;
                    }
                }
            }
            return null;
        }
}


