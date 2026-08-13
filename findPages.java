class Solution {

    public static boolean isValid(int[] arr, int mid , int m){
        int st = 1;
        int pages = 0;

        for(int i = 0; i < arr.length; i++){
            if(pages + arr[i] <= mid){
                pages += arr[i];
            }
            else{
                st++;
                pages = arr[i];
            }
        }

        return st > m ? false : true;
    }


    public int findPages(int[] nums, int m) {
        if (m > nums.length){
            return -1;
        }
        int low = 0;
        int high = Arrays.stream(nums).sum();
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) /2;

            if(isValid(nums, mid, m)){
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
