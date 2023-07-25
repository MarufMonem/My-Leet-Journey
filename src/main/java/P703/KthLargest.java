package P703;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class KthLargest {
    int[] streamArray;
    int kth;
    public KthLargest(int k, int[] nums) {
        if (nums.length ==0){
            streamArray = new int[1];
            streamArray[0]=-10001;
        }else{
            streamArray = nums;
        }
        kth = k;
    }

    public int add(int val) {
        int [] updatedArray = new int[streamArray.length + 1];
        updatedArray[0] = val;
        if (updatedArray.length>1){
            for (int i=1, j=0; i<updatedArray.length; i++, j++){
                updatedArray[i]= streamArray[j];
            }
        }
        System.out.println("Before: " + Arrays.toString(updatedArray));
        streamArray=updatedArray;
        Arrays.sort(updatedArray);
        System.out.println("After: " + Arrays.toString(updatedArray));
        int counter=1;
        int targetVal = 0;
        for (int i=updatedArray.length-1; i>=0; i--){
            if(counter==kth){
                targetVal = updatedArray[i];
                break;
            }
            counter++;
        }
        return  targetVal;
    }
}
