package LeetcodeDynamicProgramming;

public class StoneGame {


    public boolean stoneGameRecursion(int[] piles) {
        return this.stoneGameRecursionHelper(piles,0,piles.length-1,0,0,0);
    }

    private boolean stoneGameRecursionHelper(int[] piles, int i,int j, int sum,int points,int turn){
        if(i > j){
            return points > sum - points;
        }else{
            boolean last;
            boolean first;
            if(turn%2 == 0){
                first = this.stoneGameRecursionHelper(piles,i+1,j,sum+piles[i],points+piles[i],(turn+1)%2);
                last = this.stoneGameRecursionHelper(piles,i,j-1,sum+piles[j],points+piles[j], (turn+1)%2);
            }else{
                first = this.stoneGameRecursionHelper(piles,i+1,j,sum+piles[i],points,(turn+1)%2);
                last = this.stoneGameRecursionHelper(piles,i,j-1,sum+piles[j],points, (turn+1)%2);
            }
            return first||last;
        }
    }
}
