package LeetcodeDynamicProgramming;

public class ArithmeticSlices {
    public int numberOfArithmeticSlicesRecursion(int[] A) {
        int res = 0;
        for(int i=1;i<=A.length-2;i++){
            res += this.numberOfArithmeticSlicesRecursionHelper(A,i,0,A[i]-A[i-1],0);
        }
        return res;
    }

    private int numberOfArithmeticSlicesRecursionHelper(int[] arr, int ind, int count,int prevDiff,int res){
        if(ind >= arr.length){
            return (count>=2)?res+1:res;
        }else{
            if(prevDiff != arr[ind] - arr[ind-1]){
                return (count>=2)?res+1:res;
            }else{
                if(count >= 2){
                    res += this.numberOfArithmeticSlicesRecursionHelper(arr,ind+1,count+1,prevDiff,res);
                    return res+1;
                }else{
                    res += this.numberOfArithmeticSlicesRecursionHelper(arr,ind+1,count+1,prevDiff,res);
                    return res;
                }
            }
        }
    }

    public int numberOfArithmeticSlicesDP(int[] arr){
        int[] dp = new int[arr.length];
        int numBiggerThan = 1;
        for(int i=2;i<dp.length;i++){
            if(arr[i] - arr[i-1] == arr[i-1] - arr[i-2]){
                dp[i] = dp[i-1]+numBiggerThan++;
            }else{
                numBiggerThan  =1;
                dp[i] = dp[i-1];
            }
        }
        return dp[dp.length-1];
    }

}
