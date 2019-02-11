package LeetcodeDynamicProgramming;

public class UniquePaths {

    public int uniquePathsRecursion(int m, int n) {
        int[][] dp = new int[n][m];
        return this.uniquePathRecursionHelper(dp,0,0,m,n);
    }

    private int uniquePathRecursionHelper(int dp[][],int i, int j, int m,int n){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i<0 || j<0 || i>= n || j>= m){
            return 0;
        }else{
            int res = this.uniquePathRecursionHelper(dp,i+1,j,m,n);
            res += this.uniquePathRecursionHelper(dp,i,j+1,m,n);
            return res;
        }
    }



    public int uniquePathsDP(int m, int n) {
        int[][] dp = new int[n+1][m+1];
        dp[1][1] = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 && j==1){
                    continue;
                }
                dp[i][j] = dp[i][j]+dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[n][m];
    }
}
