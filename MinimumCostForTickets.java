package LeetcodeDynamicProgramming;

import java.util.Arrays;

public class MinimumCostForTickets {
    private int min = Integer.MAX_VALUE;

    public int mincostTicketsRecursion(int[] days, int[] costs) {
        if(days.length == 0){
            return 0;
        }
        int[] ldays = new int[days[days.length-1]+1];
        for(int i=0;i<days.length;i++){
            ldays[days[i]]  = 1;
        }
        return this.mincostTicketRecursionHelper(ldays,costs,0,0);
    }

    private int mincostTicketRecursionHelper(int[] days, int[] costs, int ind, int cost){
        if(ind >= days.length){
            return Math.min(min,cost);
        }
        while(days[ind] == 0){
            ind++;
        }
        int oneDayPass = this.mincostTicketRecursionHelper(days,costs,ind+1,cost+costs[0]);
        int weeklyPass = this.mincostTicketRecursionHelper(days,costs,ind+7,cost+costs[1]);
        int monthlyPass = this.mincostTicketRecursionHelper(days,costs,ind+30,cost+costs[2]);
        return Math.min(Math.min(oneDayPass,weeklyPass),monthlyPass);
    }


    public int mincostTicketDP(int[] days, int[] costs){
        int[] dp = new int[days.length+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = Math.min(Math.min(costs[0],costs[1]),costs[2]);
        for(int i=2;i<dp.length;i++){
            for(int j=1;j<i;j++){
                dp[i] = Math.min(dp[i],dp[i-1]+costs[0]);
                if(days[i-1] < days[j-1] + 7){
                    dp[i] = Math.min(dp[i],dp[j-1]+costs[1]);
                }
                if(days[i-1] < days[j-1] + 30){
                    dp[i] = Math.min(dp[i],dp[j-1]+costs[2]);
                }
            }
        }
        return dp[dp.length-1];
    }

}
