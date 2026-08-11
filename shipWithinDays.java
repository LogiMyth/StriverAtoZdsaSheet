class Solution {


    public static int DayRequired(int [] weight, int m){

        int count = 1;
        int sum = 0;
        for(int i = 0; i < weight.length; i++){
            if(sum + weight[i] > m){
                sum = weight[i];
                count += 1;
            }
            else {
                sum += weight[i];
            }
        }
        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0; i < weights.length; i++){
            low = Math.max(low, weights[i]);
            high = high + weights[i];
        }

        while(low <= high){

            int mid = (low + high) / 2;

            int dayReq = DayRequired(weights, mid);

            if(dayReq <= days){

                high = mid - 1;
            
            }

            else{

                low = mid + 1;
            
            }

        }

        return low;
    
    }
}
