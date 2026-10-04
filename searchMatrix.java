class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        if (m == null || m.length == 0 || m[0].length == 0) return false;
        int a = m.length;
        int b = m[0].length;

        int low = 0;
        int high = a - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if(target >= m[mid][0] && target <= m[mid][b - 1]){
                return searchMatrix(m, target, mid);
            }
            else if(target > m[mid][b-1]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
    public static boolean searchMatrix(int[][] m, int t, int row){
        int a = m.length;
        int b = m[0].length;

        int low = 0;
        int high = b - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(m[row][mid] == t){
                return true;
            }
            else if(m[row][mid] < t){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}
