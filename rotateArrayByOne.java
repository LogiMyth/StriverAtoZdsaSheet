class Solution {
    public void rotateArrayByOne(int[] nums) {
        int lst = nums[0];
        int idx = 0;
        for(int i = 1; i < nums.length; i++){
            nums[idx] = nums[i];
            idx++;
        }
        nums[nums.length-1] = lst;
    }
}
