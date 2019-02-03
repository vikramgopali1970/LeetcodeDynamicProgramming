package LeetcodeDynamicProgramming;

import java.util.Arrays;

public class MinimumFallingPathSum {
    public int minFallingPathSumRecursion(int[][] A) {
        int[] result = new int[A[0].length];
        for(int i=0;i<A[0].length;i++){
            result[i] = this.minFallingPathSumRecursionHelper(A,0,0,i);
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<result.length;i++){
            if(min > result[i]){
                min = result[i];
            }
        }
        return min;
    }

    private int minFallingPathSumRecursionHelper(int[][]path,int ind, int sum,int col){
        if(ind >= path.length){
            return sum;
        }
        if(col < 0 || col >= path[0].length){
            return Integer.MAX_VALUE;
        }
        int min1 = this.minFallingPathSumRecursionHelper(path,ind+1,sum+path[ind][col],col+1);
        int min2 = this.minFallingPathSumRecursionHelper(path,ind+1,sum+path[ind][col],col);
        int min3 = this.minFallingPathSumRecursionHelper(path,ind+1,sum+path[ind][col],col-1);
        return Math.min(Math.min(min1,min2),min3);
    }

    public int minFallingPathSumDP(int[][] path){
        int minSum = Integer.MAX_VALUE;
        int[][] dp = new int[path.length][path[0].length];
        dp[0] = Arrays.copyOf(path[0],path[0].length);
        for(int i=1;i<path.length;i++){
            for(int j=0;j<path[0].length;j++){
                if(j==0){
                    dp[i][j] = path[i][j] + Math.min(dp[i-1][j],dp[i-1][j+1]);
                }else if(j==path[0].length-1){
                    dp[i][j] = path[i][j] + Math.min(dp[i-1][j],dp[i-1][j-1]);
                }else{
                    dp[i][j] = path[i][j] + Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i-1][j+1]));
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            if(minSum > dp[dp.length-1][i]){
                minSum = dp[dp.length-1][i];
            }
        }
        return minSum;
    }
}
