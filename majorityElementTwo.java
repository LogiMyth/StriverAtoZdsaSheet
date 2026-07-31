class majorityElementTwo {
    public List<Integer> majorityElementTwo(int[] nums) {

        List<Integer> ls = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {map.put(nums[i], 1);}
        }
        int k = nums.length/3;
        for(int i : map.keySet()){
            if(map.get(i) > k){
                ls.add(i);
            }
        }
        return ls;
    }
}
