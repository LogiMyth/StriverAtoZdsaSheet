class Solution {
    public int countOccurrences(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int first = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        low = 0; 
        high = arr.length - 1;
        int last = -1;
        while (low <= high) { 
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        if (first == -1) return 0;
        return (last - first + 1);
    }
}
