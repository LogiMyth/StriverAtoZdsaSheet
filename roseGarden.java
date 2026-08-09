
class Solution {

    public static boolean isPossible(int[] nums, int day, int k, int m){
        int count = 0;
        int buket = 0;

        for(int a : nums){
            if(a <= day){
                count++;
                if(count == k){
                    buket++;
                    count = 0;
                }
            }
            else{
                count = 0;
            }

        }
        return buket >= m;
    }
    public int roseGarden(int n, int[] nums, int k, int m) {
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        for(int a : nums){
            minDay = Math.min(minDay, a);
            maxDay = Math.max(maxDay, a);
        }
        int low = minDay, high = maxDay, result = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(isPossible(nums, mid, k , m)){
                result = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return result;
    }
}


