package P703;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {0};
        KthLargest obj = new KthLargest(2, nums);
        System.out.println(obj.add(-1));
        System.out.println(obj.add(1));
        System.out.println(obj.add(-2));
        System.out.println(obj.add(-4));
        System.out.println(obj.add(3));

//        kthLargest.add(3);   // return 4
//        kthLargest.add(5);   // return 5
//        kthLargest.add(10);  // return 5
//        kthLargest.add(9);   // return 8
//        kthLargest.add(4);   // return 8
    }
}
