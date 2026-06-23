import java.util.HashMap;

class majorityElements {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }
        for(int k : map.keySet()){
            if(map.get(k) > n/2){
                return k;
            }
        }
        return 0;
    }
}