package P373;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int []array = new int[nums2.length * nums1.length];
        List<List<Integer>> allMultiples = new ArrayList<List<Integer>>();
        int counter=0;
        for (int u:nums1) {
            for (int v:nums2) {
                List<Integer> uv= new ArrayList<Integer>();
                uv.add(u);
                uv.add(v);
                int total = u *v;
                array[counter]=total;
                counter++;
                allMultiples.add(uv);
            }

        }

        List<List<Integer>> returnList = new ArrayList<List<Integer>>();;
        counter=0;

        int i, j, temp;
        List<Integer> templl = null;
        boolean swapped;
        for (i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = array[j];
                    templl = allMultiples.get(j);
                    array[j] = array[j + 1];
                    allMultiples.set(j,allMultiples.get(j+1));
                    array[j + 1] = temp;
                    allMultiples.set(j+1,templl);
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }


        for (int q=0; q<k && q< allMultiples.size(); q++){
            returnList.add(allMultiples.get(q));
        }


        return  returnList;
    }

    public static void main(String[] args) {
        int nums1[]={1,1,2};
        int nums2[]={1,2,3};
        List<List<Integer>> ll1 = kSmallestPairs(nums1, nums2, 3);
        System.out.println(ll1.toString());

    }
}
