package P703;

import java.util.PriorityQueue;

public class usingHeap {
    int kth;
    PriorityQueue<Integer> minheap;
    public usingHeap(int k, int[] nums) {
        kth= k;
        minheap = new PriorityQueue<Integer>(k);
        for(int val: nums){
            add(val);
        }

    }



    public int add(int val) {

        if (minheap.size()<kth){
            minheap.offer(val);
        }
        else if(val>minheap.peek()){
            minheap.poll();
            minheap.offer(val);
        }

        return minheap.peek();

    }
}
