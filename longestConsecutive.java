
class longestConsecutive {
    public int longestConsecutives(int[] nums) {
        if(nums.length == 0){
          return 0;
        }
        int longest = 1;
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            num.add(nums[i]);
        }
        for(int it : num){
            if(!num.contains(it-1)){
                int cnt = 1;
                int x = it;
            
            while(num.contains(x+1)){
                x = x + 1;
                cnt = cnt + 1;
            }
            longest = Math.max(longest, cnt);}
        }
        return longest;
    }
}
