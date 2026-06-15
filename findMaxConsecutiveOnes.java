class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cout = 0;
        int cons = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                cout++;
            }
            else {
                cons = Math.max(cons,cout);
                cout = 0;
            }
        }
        return Math.max(cons,cout);
    }
}
