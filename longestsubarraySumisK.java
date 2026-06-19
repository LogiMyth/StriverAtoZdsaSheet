import java.util.*;

class Solution {
    public int longestsubarraySumisK(int[] nums, int k) {
        int count =0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            ArrayList <Integer> temp = new ArrayList<>();
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                temp.add(nums[j]);
                if(sum == k){
                    count = temp.size();
                }
            }
        }
        return count;
    }
}