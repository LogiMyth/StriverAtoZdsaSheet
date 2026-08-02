class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int [] arr = {-1, -1};
        int low = 0, high = nums.length;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] <= x){
                arr[0] = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        low = 0;
        high = nums.length;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= x){
                arr[1] = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return arr;
    }
}
