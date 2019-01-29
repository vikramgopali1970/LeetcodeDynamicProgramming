package LeetcodeDynamicProgramming;

public class MinCostClimbingStairs {

    /**
     * The basic idea is to start climbing from 0th step and 1st step and check which will return the minimum cost
     * and at each step we try to climb 1 step and 2 step to see which will yield a better minimum result.
     * */
    public int minCostClimbingStairsRecursion(int[] cost) {
        return Math.min(this.minCostClimbingStarisRecursionHelper(cost,0,0),this.minCostClimbingStarisRecursionHelper(cost,1,0));
    }

    private int minCostClimbingStarisRecursionHelper(int[] cost,int ind,int result){
        if(ind > cost.length-1){
            return result+0;
        }else if(ind == cost.length-1){
            return result+cost[ind];
        }else{
            int oneStep = this.minCostClimbingStarisRecursionHelper(cost,ind+1,result+cost[ind]);
            int twoStep = this.minCostClimbingStarisRecursionHelper(cost,ind+2,result+cost[ind]);
            return Math.min(oneStep,twoStep);
        }
    }

    /**
     * Here the optimal substructure is that, if minimum cost of reaching the top is via a stair k, then teh minimum
     * cost to reach top is sum of minimum cost to reach from start to k and minimum cost to reach from step k to top.
     * The recurrence relation boils down to dp[i] = cost[i]+Math.min(dp[i-1],dp[i-2]) where i>2.
     * */
    public int minCostClimbingStairsDP(int[] cost){
        int[] dp = new int[cost.length];
        dp[dp.length-1] = 0;
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2;i<dp.length;i++){
            dp[i] = cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
    }

}
