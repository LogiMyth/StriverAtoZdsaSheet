class Solution {

    public static boolean isPossible(int[] arr, int painter, int maxAllowedValue){
        int time = 0;
        int count = 1;
        for(int i = 0; i < arr.length; i++){
            if(time + arr[i] <= maxAllowedValue){
                time += arr[i];
            }
            else{
                count++;
                time = arr[i];
            }
        }
        return count > painter ? false : true;
    }
    public int paint(int A, int B, int[] C) {
        int low = Arrays.stream(C).max().getAsInt();
        int high = Arrays.stream(C).sum();
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(isPossible(C, A, mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        long totalTime = (ans * B) % 10000003;
        
        return (int) totalTime;
    }
}
