package binaryTreeQuestions;



public class LeetCode1863 {
    public static void main(String[] args) {
        int [] nums = {1, 3};
        System.out.println(subsetXORSum(nums));
    }
    public static  int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    public static int helper(int [] nums, int index, int currentXor){
        if(index == nums.length){
            return currentXor;
        }

        int include = helper(nums, index+1, currentXor^nums[index]);
        int exclude = helper(nums, index+1, currentXor);
        return include+exclude;

    }
}
