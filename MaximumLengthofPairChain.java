package LeetcodeDynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthofPairChain {

    class Pair{
        int a;
        int b;

        public Pair(int a, int b){
            this.a = a;
            this.b = b;
        }

    }

    public int findLongestChain(int[][] pairs) {
        Pair[] data = new Pair[pairs.length];

        for(int i=0;i<pairs.length;i++){
            data[i] = new Pair(pairs[i][0],pairs[i][1]);
        }

        Arrays.sort(data, new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                return Integer.compare(p1.a,p2.a);
            }
        });
        int[] dp = new int[data.length];
        Arrays.fill(dp,1);
        for(int i=1;i<data.length;i++){
            for(int j=0;j<i;j++){
                if(data[i].a > data[j].b){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp[dp.length-1];
    }
}
