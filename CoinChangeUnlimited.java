package LeetcodeDynamicProgramming;

public class CoinChangeUnlimited {
    int[][] dp;

    public int change(int amount, int[] coins) {
        if(coins.length == 0 && amount > 0){
            return 0;
        }
        if(amount == 0 || coins.length == 0){
            return 1;
        }
        this.dp = new int[coins.length][amount+1];
        for(int i=0;i<this.dp.length;i++){
            for(int j=0;j<this.dp[i].length;j++){
                this.dp[i][j] = -1;
            }
        }
        this.coinChangeUnlimitedRecursionHelper(coins,coins.length-1,amount);
        return this.dp[coins.length-1][amount];
    }

    private int coinChangeUnlimitedRecursionHelper(int[] coins, int ind, int sum){
        if(ind < 0 && sum != 0){
            return 0;
        }
        if(sum < 0){
            return 0;
        }
        if(sum == 0){
            return 1;
        }
        if(this.dp[ind][sum] != -1){
            return this.dp[ind][sum];
        }
        int res = 0;
        for(int i=0;i<=Math.floor(sum/coins[ind]);i++){
            res += this.coinChangeUnlimitedRecursionHelper(coins,ind-1,sum - i*coins[ind]);
        }
        this.dp[ind][sum] = res;
        return this.dp[ind][sum];
    }
}
