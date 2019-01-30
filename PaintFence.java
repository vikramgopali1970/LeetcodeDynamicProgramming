package LeetcodeDynamicProgramming;

public class PaintFence {
    public int numWays(int n, int k) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return k;
        }
        if(n==2){
            return k*k;
        }
        int choices = k*k;
        int equal = k;
        int unequal = k*k-k;
        for(int i=2;i<n;i++){
            choices = equal*(k-1) + unequal*k;
            equal = unequal;
            unequal = choices - equal;
        }

        return choices;
    }
}
