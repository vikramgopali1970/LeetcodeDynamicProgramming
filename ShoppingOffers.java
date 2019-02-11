package LeetcodeDynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class ShoppingOffers {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int cost = 0;
        for(int i=0;i<needs.size();i++){
            cost += needs.get(i)*price.get(i);
        }
        return Math.min(this.shoppingOffersRecursionHelper(price,special, needs,0,true),cost);

    }

    private boolean offerPrice(List<Integer> offer, List<Integer> need){
        for(int i=0;i<need.size();i++){
            if(need.get(i) - offer.get(i) < 0){
                return false;
            }
        }
        return true;
    }

    private List<Integer> remaining(List<Integer> offer, List<Integer> need){
        ArrayList<Integer> remain = new ArrayList<Integer>();

        for(int i=0;i<need.size();i++){
            remain.add(need.get(i) - offer.get(i));
        }
        return remain;
    }

    private int shoppingOffersRecursionHelper(List<Integer>price, List<List<Integer>> special, List<Integer> needs, int cost, boolean f){
        if (!f){
            for(int i=0;i<needs.size();i++){
                cost += needs.get(i)*price.get(i);
            }
            return cost;
        }else{
            int b = Integer.MAX_VALUE;
            int t = Integer.MAX_VALUE;
            boolean flag=true;
            for(int i=0;i<special.size();i++){
                if(this.offerPrice(special.get(i),needs)){
                    int p = special.get(i).get(special.get(i).size()-1);
                    b = Math.min(b,this.shoppingOffersRecursionHelper(price,special,this.remaining(special.get(i),needs),cost+p,true));
                }else{
                    flag = false;
                }
            }
            if(!flag){
                t = this.shoppingOffersRecursionHelper(price,special,needs,cost,false);
            }
            return Math.min(t,b);
        }
    }
}
