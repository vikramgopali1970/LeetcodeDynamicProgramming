package LeetcodeDynamicProgramming;

public class HouseRobber {

    /**
     * Here we calculate the max possible loot by considering the current house and looting the house from beginning
     * till the house before the adjacent. i.e we need to just make a decision whether we will include the current
     * house in the robbery or not. If included not to include the next house.
     * */
    public int robDP(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i=2;i<dp.length;i++){
                dp[i] = Math.max(dp[i-1],nums[i-2]+dp[i-2]);
        }
        return dp[dp.length-1];
    }
}
