class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        int zero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }
            else{
                nums[idx] = nums[i];
                idx++;
            }
        }
        for(int i = 0; i < zero; i++){
            nums[idx] = 0;
            idx++;
        }
    }
}
