package striver;

import java.util.HashSet;

public class removeduplicatesByHashing {
    
    public int removeDuplicates(int[] nums) {
    HashSet <Integer> set = new HashSet<>();
    int idx = 0;
    for(int num : nums){
        if(!set.contains(num)){
        set.add(num);
        nums[idx] = num;
        idx++;
        }
    }

    return idx;
    }
}
