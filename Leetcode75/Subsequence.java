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
    public static void main(String[] args) {
        Subsequence obj=new Subsequence();
        boolean isSub=obj.isSubsequence("abc", "absqec");
        System.out.println(isSub);
    }
}
