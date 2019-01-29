package LeetcodeDynamicProgramming;

public class BestTimeToBuyAndSellStock {


    /**
     * The idea here is to assume that the first day price is the buying price and from the next day keep
     * checking the price, if it is less than buying price, we update the buying price and if it is more,
     * then it is a potential selling price and we calculate the profit by checking the max of previos profit
     * and this profit.
     */
    public int maxProfitRecursion(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        return this.maxProfitRecursionHelper(prices,1,prices[0],0);
    }

    private int maxProfitRecursionHelper(int[] prices,int ind,int buy,int profit){
        // System.out.println(profit);
        if(ind == prices.length){
            return profit;
        }else{
            if(prices[ind] <= buy){
                profit = this.maxProfitRecursionHelper(prices,ind+1,prices[ind],profit);
            }else{
                profit =this.maxProfitRecursionHelper(prices,ind+1,buy,Math.max(profit,prices[ind]-buy));
            }
        }
        return profit;
    }

    /**
     * The recurrence relation is that if(prices < buy) potential buy price, and if(prices > buy) it is a potential
     * sell price and we calculate the profit and update it if it is better than the previous profit.
     * */
    public int maxProfitDP(int[] prices){
        int profit = 0;
        int buy = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i] <= buy){
                buy = prices[i];
            }else{
                profit = Math.max(profit,prices[i]-buy);
            }
        }
        return profit;
    }
}
