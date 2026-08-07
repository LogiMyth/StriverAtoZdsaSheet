class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Arrays.stream(piles).max().getAsInt();;

        int ans = 0;

        while (low <= high){
            int r = low + (high - low) /2;
            long hours = 0;
            for(int a : piles){
                int d = a / r;
                hours = hours + d;
                int rem = a % r;
                if(rem < r && rem > 0){
                    hours = hours + 1;
                }
            }
            if(hours <= h){
                ans = r;
                high = r - 1;
            }
            else{
                low = r + 1;
            }
        }
        return ans;
    }
}
