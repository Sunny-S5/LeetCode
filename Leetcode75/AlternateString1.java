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

    public static void main(String[] args) {
        AlternateString1 as = new AlternateString1();
        String merged = as.gcdOfStrings("ABCABC", "ABC");
        System.out.println("Merged String: " + merged);  
    }
}
