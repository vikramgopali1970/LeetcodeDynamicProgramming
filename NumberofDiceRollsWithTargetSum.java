package LeetcodeDynamicProgramming;

public class NumberofDiceRollsWithTargetSum {

    int[][] dp;

    public int numRollsToTarget(int d, int f, int target) {
        this.dp = new int[d+1][target+1];
        for(int i=0;i<this.dp.length;i++){
            for(int j=0;j<this.dp[i].length;j++){
                this.dp[i][j] = -1;
            }
        }

        this.recursiveHelper(d,f,target);
        return this.dp[d][target];

    }

    private int recursiveHelper(int d, int f, int target){

        if(d == 0){
            if(target == 0){
                return 1;
            }
            return 0;
        }else if(target < 0){
            return 0;
        }else{
            if(this.dp[d][target] > -1){
                return this.dp[d][target];
            }
            int res=0;
            for(int i=1;i<=f;i++){
                res += this.recursiveHelper(d-1, f, target-i)%1000000007;
                res = res%1000000007;
            }
            this.dp[d][target] = res;
            return res;
        }
    }
}
