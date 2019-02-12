package LeetcodeDynamicProgramming;

import java.util.Arrays;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length+1][grid[0].length+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        dp[1][1] = grid[0][0];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(i==1 && j==1){
                    continue;
                }
                dp[i][j] = grid[i-1][j-1]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[grid.length][grid[0].length];
    }
}
