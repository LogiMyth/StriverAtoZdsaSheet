class leaders {
    public List<Integer> leaders(int[] nums) {

        int n = nums.length - 1;
        ArrayList<Integer> list = new ArrayList<>();

        int max = nums[n];
        list.add(nums[n]);
        for(int i = n-1; i >= 0; i--){
            if(nums[i] > max){
                list.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
