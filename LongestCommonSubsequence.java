package LeetcodeDynamicProgramming;

public class LongestCommonSubsequence {

    public void recursiveLCS(String s1, String s2){
        System.out.println(this.recursiveLCSHelper(s1,s2,s1.length()-1,s2.length()-1));
    }

    private int recursiveLCSHelper(String s1, String s2, int ind1, int ind2){
        if(ind1 < 0 || ind2 < 0){
            return 0;
        }else{
            char c1 = s1.charAt(ind1);
            char c2 = s2.charAt(ind2);
            if(c1 == c2){
                return 1+ this.recursiveLCSHelper(s1,s2,ind1-1,ind2-1);
            }else{
                return Math.max(this.recursiveLCSHelper(s1,s2,ind1-1,ind2), this.recursiveLCSHelper(s1,s2,ind1,ind2-1));
            }
        }
    }

    public void dpLCS(String s1, String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<=s1.length();i++){
            for(int j=0;j<=s2.length();j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else if (s1.charAt(i-1) != s2.charAt(j-1)){
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[s1.length()][s2.length()]);
    }
}
