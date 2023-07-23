package P2;

public class Solution_v1 {

    // would work for most cases except for really large numbers
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String list1_string = "";
        String list2_string = "";

        while(l1 != null){
            int temp = l1.val;
            list1_string = Integer.toString(temp) + list1_string;
            l1 = l1.next;
        }


        while(l2 != null){
            int temp = l2.val;
            list2_string = Integer.toString(temp) + list2_string;
            l2 = l2.next;
        }


        int l1_intVal = Integer.parseInt(list1_string);
        int l2_intVal = Integer.parseInt(list2_string);




        int sum = l1_intVal + l2_intVal;

        String sumString = Integer.toString(sum);

        char sum_charArray[] = sumString.toCharArray();

        ListNode head = new ListNode(Character.getNumericValue(sum_charArray[sum_charArray.length-1]));
        ListNode current;
        if (sum_charArray.length == 1) {
            return head;
        }else{
            current = head;
            for(int i = sum_charArray.length-2; i>=0; i-- ){
                ListNode temp = new ListNode(Character.getNumericValue(sum_charArray[i]));
                current.next = temp;
                current = current.next;

            }
        }

        current.next = null;

        return head;





    }
}
