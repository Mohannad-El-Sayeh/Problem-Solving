// Link for the problem : https://leetcode.com/problems/two-sum

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=0; j < nums.length-1; j++){
                if(i == j){
                    continue;
                }
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
