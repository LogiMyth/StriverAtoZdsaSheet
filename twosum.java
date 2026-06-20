import java.util.*;
public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    // int arr[] = new int[1];
                    return new int [] {i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int num[] = {2,5,4,6,7,1};
        int target = 3;
        System.out.print(Arrays.toString(twoSum(num, target)));
    }
}
