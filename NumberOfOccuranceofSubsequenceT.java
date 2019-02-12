package LeetcodeDynamicProgramming;


//accbcacbc abc
public class NumberOfOccuranceofSubsequenceT {
    int result ;
    public int countNumber(String s,String t){
        this.result = 0;
        this.NumberOfOccuranceofSubsequenceTRecursionHelper(s,t,0,0);
        return this.result;
    }

    private void NumberOfOccuranceofSubsequenceTRecursionHelper(String s,String t, int inds, int indt){
        if(indt >= t.length() ){
            this.result++;
            return;
        }
        if(inds >= s.length()){
            return;
        }
        if(s.charAt(inds) == t.charAt(indt)){
            this.NumberOfOccuranceofSubsequenceTRecursionHelper(s,t,inds+1,indt);
            this.NumberOfOccuranceofSubsequenceTRecursionHelper(s,t,inds+1,indt+1);
        }else{
            this.NumberOfOccuranceofSubsequenceTRecursionHelper(s,t,inds+1,indt);
        }
    }
}
