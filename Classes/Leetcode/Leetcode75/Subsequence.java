package Classes.Leetcode.Leetcode75;

public class Subsequence {
    public boolean isSubsequence(String s, String t) {
        String Str="";
       if(s.length()==0){
        return true;
       }
       if(t.length()==0){
        return false;
       }
       int i=0,j=0;
       while(i<t.length() && j<s.length()){
        if(s.charAt(i)==t.charAt(j)){
            i++;
        }
        j++;
       }
       return i==j;
    }
}
