class Solution {
    public int NthRoot(int N, int M) {
        int low = 1; 
        int high = M;

        while(low <= high){
            int mid = low + (high - low) / 2;
            long ans = (long) Math.pow(mid, N);

            if(ans == M) { 
                return mid; 
            }
            if(ans < M){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
