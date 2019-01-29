package LeetcodeDynamicProgramming;

public class ClimbingStairs {

    /**
     * The recursion follows a simple method where we take 1 and 2 steps at each step and count the number of times
     * we reach the top.
     * */
    public int climbStairsRecursive(int n) {
        return this.climbStairsRecursionHelper(n,0);
    }

    private int climbStairsRecursionHelper(int n,int step){
        if(step == n){
            return 1;
        }else if(step > n){
            return 0;
        }else{
            int result = this.climbStairsRecursionHelper(n,step+1);
            result += this.climbStairsRecursionHelper(n,step+2);
            return result;
        }
    }

    /**
     * The optimal substructure of this problem is, total number of ways to reach the top is sum of number of ways to
     * reach the kth stair from the begining and number of ways in which we can reach from kth step to top.
     * The recurrence relation boils down to dp[i] = dp[i-1]+dp[i-2] for i>2 else 1;
     * */
    public int climbStairsDP(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
