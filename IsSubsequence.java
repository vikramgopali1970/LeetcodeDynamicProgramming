package LeetcodeDynamicProgramming;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int j = 0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(j) == t.charAt(i)){
                if(++j==s.length()){
                    return true;
                }
            }
        }
        return (j==s.length());
    }


}
