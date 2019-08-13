package LeetcodeDynamicProgramming;

public class StoneGameII {

    int[][] dp;

    public void recursivesg2(int[] stones){
        int totalStones = getSum(stones);
        System.out.println(this.recursivesg2Helper(stones, 0,1,totalStones));
    }

    private int getSum(int[] stones) {
        int sum = 0;
        for(int i=0;i<stones.length;i++){
            sum+=stones[i];
        }
        return sum;
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

    private int recursivesg2Helper(int[] stones, int ind, int m, int totalStones){
        if(ind >= stones.length){
            return 0;
        }else{
            int[] ans = new int[2*m];
            int pick = 0;
            for(int i=1;i<=2*m;i++){
                if(ind+(i-1) >= stones.length){
                    break;
                }
                pick+=stones[ind+(i-1)];
                ans[i-1] = this.recursivesg2Helper(stones, ind+(i-1)+1, Math.max(i, m), totalStones-pick);
            }
            int maxStones = minimum(ans);
            return totalStones - maxStones;
        }
    }

    public void memosg2(int[] stones){
        this.dp = new int[stones.length][stones.length];
        int totalStones = 0;
        for(int i=0;i<stones.length;i++){
            totalStones+=stones[i];
        }
        for(int i=0;i<this.dp.length;i++){
            for(int j=0;j<this.dp[i].length;j++){
                this.dp[i][j] = -1;
            }
        }
        System.out.println(memosg2Helper(stones, 0, 1, totalStones));
    }

    private int memosg2Helper(int[] stones, int ind, int m, int totalStones){
        if(ind >= stones.length){
            return 0;
        }else{
            if(this.dp[ind][m] != -1){
                return this.dp[ind][m];
            }
            int[] ans = new int[2*m];
            int pick = 0;
            for(int i=1;i<=2*m;i++){
                if(ind+(i-1) >= stones.length){
                    break;
                }
                pick+=stones[ind+(i-1)];

                ans[i-1] = this.memosg2Helper(stones, ind+(i-1)+1, Math.max(i, m), totalStones-pick);
            }
            int maxStones = minimum(ans);
            this.dp[ind][m] = totalStones - maxStones;
            return this.dp[ind][m];
        }
    }
}
