package Classes.Leetcode.Leetcode75;

public class AlternateString1 {
    public String gcdOfStrings(String str1, String str2) {
        String str="";
        for(int i=0;i<str1.length();i++){
            if(str2.charAt(i)==str1.charAt(i)){
             str+=str2.charAt(i);
            }
        }
        return str;
    }
}
