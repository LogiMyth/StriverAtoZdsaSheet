class Solution {
    public int missingNumber(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
            }
        } 
        int n = set.size();
        for(int i = 0; i < n; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return n;
    }
}
