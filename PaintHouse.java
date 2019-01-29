package LeetcodeDynamicProgramming;

import java.util.Arrays;

public class PaintHouse {

    /**
     * The approach used here is that we paint the house with the colour that has minimum cost in the
     * pool of all colours except the colour painted to the previous house.
     * */
    public int minCostRecurssive(int[][] costs) {
        return this.minCostRecurr(costs,0,0,0);
    }

    private int minimum(int[] arr){
        int min = arr[0];
        for(int i =1;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    private int minCostRecurr(int[][] costs,int ind, int lp, int result){
        if(ind == costs.length){
            return result;
        }
        int[] res = new int[costs[0].length];
        if(ind == 0){
            for(int i=0;i<costs[0].length;i++){
                res[i] = this.minCostRecurr(costs,ind+1,i,result+costs[ind][i]);
            }
        }else{
            for(int i=0;i<costs[0].length;i++){
                if(i==lp){
                    res[i] = Integer.MAX_VALUE;
                }else{
                    res[i] = this.minCostRecurr(costs,ind+1,i,result+costs[ind][i]);
                }
            }
        }
        return this.minimum(res);
    }

    /**
     * the recurrance relation for this DP is that dp[i][j] += Math.min(dp[i-1][(j+1)%3],dp[i-1][(j+2)%3]). Which boils
     * down to the fact that assuming the current house to be painted with i'th colour what will be the cost. i.e if
     * the current house is being painted red, then the cost is the current red cost + minimum cost of painting the
     * previous house.
     * */
    public int minCostDP(int [][] costs){
        int[][] dp = new int[costs.length][costs[0].length];
        for(int i=0;i<costs.length;i++){
            dp[i] = Arrays.copyOf(costs[i],costs[i].length);
        }

        for(int i=1;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] += Math.min(dp[i-1][(j+1)%costs[0].length],dp[i-1][(j+2)%costs[0].length]);
            }
        }
        return this.minimum(dp[dp.length-1]);
    }
}
