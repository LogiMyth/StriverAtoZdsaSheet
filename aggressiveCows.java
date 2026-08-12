class Solution {

    public static boolean isPossible(int[] nums, int m, int c){
        int cows = 1;
        int laststallPos = nums[0];
        for(int i = 0; i < nums.length; i++){
            if((nums[i] - laststallPos) >= m){
                laststallPos = nums[i];
                cows++;
            }
        }
        if(cows == c) {
            return true;
        }
        else{
            return false;
        }
    }


    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 1, high = nums[nums.length - 1];
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(isPossible(nums, mid, k)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
        
    }
}
