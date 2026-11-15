class Solution {
    public int[] pascalTriangleII(int r) {
        ArrayList<Integer> list = new ArrayList<>();
        long curr = 1;
        list.add((int) curr);
        for(int i = 1; i < r; i++){
            curr = (curr * (r - i)) / i;
            list.add((int) curr);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
