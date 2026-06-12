package striver;

import java.util.HashSet;

public class unionoftwoarray {
    

    class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
            }
        }
        for(int i = 0; i < nums2.length; i++){
            if(!set.contains(nums2[i])){
                set.add(nums2[i]);
            }
        }
        int arr[] = new int[set.size()];
        int idx = 0;
        for(int num : set){
            arr[idx] = num;
            idx++;
        }
        return arr;
    }
}
}
