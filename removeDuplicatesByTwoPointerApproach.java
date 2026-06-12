package striver;

import java.util.HashSet;

public class removeDuplicatesByTwoPointerApproach { 
    public int removeDuplicates(int[] nums) {
    int idx = 0;
    for(int num : nums){
        if(nums[idx] != num){
        idx++;
        nums[idx] = num;
        }
    }

    return idx + 1;
    }
}
