package LeetcodeDynamicProgramming;

public class MaximumSubarray {

    /**
     * We need to compute the prefix array with the given recurrence relation, dp[i] = Math.max(dp[i-1]+nums[i],nums[i])
     * for i>1. This boils down to whether we want to extend the sub array sum to the next element or start fresh based
     * on the values we get from both scenarios.
     * */
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            if(dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }
}
