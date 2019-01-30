package LeetcodeDynamicProgramming;

public class HouseRobber {

    /**
     * Here we calculate the max possible loot by considering the current house and looting the house from beginning
     * till the house before the adjacent. i.e we need to just make a decision whether we will include the current
     * house in the robbery or not. If included not to include the next house.
     * */
    public int robDP(int[] nums) {
        if(nums.length == 0){
            return 0;
        }else if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        int max = Math.max(dp[0],dp[1]);
        for(int i=2;i<dp.length;i++){
            dp[i] = nums[i];
            for(int j=0;j<i-1;j++){
                dp[i] = Math.max(dp[i],nums[i]+dp[j]);
            }
            if(max < dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
}
