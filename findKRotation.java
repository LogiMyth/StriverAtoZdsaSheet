class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int low = 0, high = nums.size() - 1;
        int ans = Integer.MAX_VALUE;
        int idx = 0;


        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums.get(low) <= nums.get(mid)){

                if(nums.get(low) < ans){
                    ans = nums.get(low);
                    idx = low;
                }
                else{low = mid + 1;}
            }
            else{
                if(nums.get(mid) < ans){
                    ans = nums.get(mid);
                    idx = mid;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return idx;
    }
}
