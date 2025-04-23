package Classes.Leetcode.Leetcode75;

public class GcdString2 {
    public int gcdint(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public String gcdstr(String str1,String str2){
        String gcdstr="";
        if (!str1.equals(str2) && !str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }
        int gcdlength=gcdint(str1.length(),str2.length());
        gcdstr=str1.substring(0,gcdlength);
        System.out.println("gcd string is :"+gcdstr);
        return gcdstr;
    }
}
