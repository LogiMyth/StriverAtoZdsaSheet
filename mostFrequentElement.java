import java.util.HashMap;

class mostFrequentElement {
    public int mostFrequentElement(int[] nums) {
        // Step 1: Ek HashMap banaya frequencies store karne ke liye
        HashMap<Integer, Integer> counts = new HashMap<>();
        
        // Loop chalakar har element ki occurrence count ki (getOrDefault use karke)
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sabse zyada aane wale element ko dundhna
        int maxElement = nums[0]; // Maan lete hain pehla element hi answer hai
        int maxFrequency = 0;

        for (int num : counts.keySet()) {
            int currentFrequency = counts.get(num);

            // Condition 1: Agar naye element ki frequency zyada hai
            // Condition 2: Agar frequency barabar hai, toh chota (smallest) element chuno
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                maxElement = num;
            } else if (currentFrequency == maxFrequency) {
                if (num < maxElement) {
                    maxElement = num;
                }
            }
        }

        // Final answer return kiya
        return maxElement;
    }
}


