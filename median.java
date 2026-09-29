class Solution {
    public double median(int[] arr1, int[] arr2) {
        if(arr2.length < arr1.length){
            return median(arr2, arr1);
        }
        int m = arr1.length;
        int n = arr2.length;

        int low = 0;
        int high = m;

        while(low <= high){
            int i = (low + high) >> 1;
            int j = (m + n + 1) / 2 - i;

            int L1 = (i == 0) ? Integer.MIN_VALUE : arr1[i - 1];
            int R1 = (i == m) ? Integer.MAX_VALUE : arr1[i];
            
            int L2 = (j == 0) ? Integer.MIN_VALUE : arr2[j - 1];
            int R2 = (j == n) ? Integer.MAX_VALUE : arr2[j];

            if(L1 <= R2 && R1 >= L2){
                if((m + n) % 2 == 0){
                    return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
                }
                else{
                    return (double) Math.max(L1, L2);
                }
            }
            else if(L1 > R2){
                high = i - 1;
            }
            else{
                low = i + 1;
            }
        }
        return 0.0;
    }
}
