package P347;

import java.util.*;

class Solution {


    public static int[] topKFrequent(int[] nums, int k) {
        if (nums.length ==0){
            return nums;
        }else{
            //sorting the array
            Arrays.sort(nums);

            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            int counter=1;
            int uniqueVal = nums[0];

            for (int i=1; i < nums.length; i++){
                if (nums[i] != uniqueVal){
                    //we now have a different value
//                Adding the old value to the hashmap
                    map.put(uniqueVal,counter);
                    counter=1; //reset counter
                    uniqueVal=nums[i];
                }else{
                    counter++;
                }
            }
//            The last entry
            map.put(uniqueVal,counter);

            System.out.println("Map size: " + map.size());
            for(Map.Entry m : map.entrySet()) {
                System.out.println("value: " + m.getKey() + " occured: " + m.getValue() + " times");
            }

            int returnKthArray[] = new int[k];

            for (int p =0; p<k; p++){
                int max=0;
                int keyVal = 0;
                for(Map.Entry m : map.entrySet()) {
                    if (max<(int)m.getValue()){
                        max = (int) m.getValue();
                        keyVal = (int)m.getKey();
                    }
                }
                returnKthArray[p] = keyVal;
                map.remove(keyVal);
            }

                return returnKthArray;
        }
    }

    public static void main(String[] args) {
        int array[] = {4,1,-1,2,-1,2,3}; // -1 -1 1 2 2 3 4
        int a[] = topKFrequent(array, 2);
        for (int i:a
             ) {
            System.out.println(i);
        }
    }
}
