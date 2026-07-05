class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        
        int n = nums.length;
        int pivot = -1;
        
        // Step 1: Find the first decreasing element from the right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }
        
        // Step 2: If a valid pivot exists, find its successor and swap
        if (pivot != -1) {
            for (int j = n - 1; j > pivot; j--) {
                if (nums[j] > nums[pivot]) {
                    swap(nums, pivot, j);
                    break;
                }
            }
        }
        // Step 3: Reverse the entire suffix to the right of the pivot
        reverse(nums, pivot + 1, n - 1);
    } 
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
