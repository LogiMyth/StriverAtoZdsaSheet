class Solution { 
    public boolean searchInARotatedSortedArrayII(int[] nums, int target) { 
        int low = 0, high = nums.length - 1; 
        
        while (low <= high) { 
            int mid = low + (high - low) / 2; 
            
            if (nums[mid] == target) { 
                return true; 
            } 
            
            // Edge case: Handle duplicate values at low, mid, and high
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }
            
            // Left half is sorted
            if (nums[low] <= nums[mid]) { 
                if (nums[low] <= target && target < nums[mid]) { 
                    high = mid - 1; 
                } else { 
                    low = mid + 1;
                } 
            } 
            // Right half is sorted
            else { 
                if (target > nums[mid] && target <= nums[high]) { 
                    low = mid + 1; 
                } else { 
                    high = mid - 1; 
                } 
            } 
        } 
        return false; 
    } 
}
