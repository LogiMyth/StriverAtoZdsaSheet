class Solution {
    public double minimiseMaxDistance(int[] arr, int k) {
        double low = 0;
        double high = 0;

        for(int i = 0; i < arr.length - 1; i++){
            high = Math.max(high, (double) (arr[i + 1] - arr[i]));
        }

        while(high-low > 1e-6){
            double mid = low + (high - low) / 2.0;

            if(noOfgasStationsRequired(arr, mid) > k){
                low = mid;
            }
            else{
                high = mid;
            }
        } 
        return high;
    }

    public static int noOfgasStationsRequired(int[] arr, double dist){
        int required = 0;

        for(int i = 0; i < arr.length - 1; i++){
            required +=  (int) ((arr[i + 1] - arr[i]) / dist);
        }
        return required;
    } 
}
