class Solution { 
    public int[] intersectionArray(int[] nums1, int[] nums2) { 
        // 1. Create a temporary array to store matches max size possible
        int[] tempArr = new int[nums1.length]; 
        int a = 0; 
        
        // 2. Track which elements in nums2 have already been matched
        boolean[] visited2 = new boolean[nums2.length];

        // 3. Compare every element of nums1 with every element of nums2
        for (int i = 0; i < nums1.length; i++) { 
            for (int j = 0; j < nums2.length; j++) {
                // If elements match and this nums2 element hasn't been used yet
                if (nums1[i] == nums2[j] && !visited2[j]) { 
                    tempArr[a] = nums1[i]; 
                    a++; 
                    visited2[j] = true; // Mark as used so we don't match it again
                    break; // Move to the next element in nums1
                } 
            } 
        } 
        
        // 4. Create the final array using the exact count 'a' to avoid trailing zeros
        int[] finalArr = new int[a];
        for (int i = 0; i < a; i++) {
            finalArr[i] = tempArr[i];
        }
        
        return finalArr; 
    } 
}
