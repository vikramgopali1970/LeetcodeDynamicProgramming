package LeetcodeDynamicProgramming;

public class CoinChangeUnlimited {

    int result;

    public int coinChangeUnlimitedRecursion(int sum, int[] coins){
        this.result = 0;
        this.coinChangeUnlimitedRecursionHelper(coins,coins.length-1,sum);
        return this.result;
    }

    private void coinChangeUnlimitedRecursionHelper(int[] coins, int ind, int sum){
        if(ind < 0 && sum != 0){
            return;
        }
        if(sum < 0){
            return;
        }
        if(sum == 0){
            this.result++;
            return;
        }
        for(int i=0;i<=Math.floor(sum/coins[ind]);i++){
            this.coinChangeUnlimitedRecursionHelper(coins,ind-1,sum - i*coins[ind]);
        }
    }
}
