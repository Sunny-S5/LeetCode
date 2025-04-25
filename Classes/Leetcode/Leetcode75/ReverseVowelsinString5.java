package Classes.Leetcode.Leetcode75;

public class ReverseVowelsinString5 {
    public String reversedVowelsString(String str){
        String reversed=str;
        char[] charr=str.toCharArray();
        int i=0,j=charr.length-1;
        String vowels="AEIOUaeiou";
        while(i<j){
            boolean isVowelPresentati=vowels.contains(String.valueOf(charr[i]));
            if(!isVowelPresentati){
                i++;
                continue; 
            }
            boolean isVowelPresentatj=vowels.contains(String.valueOf(charr[j]));
            if(!isVowelPresentatj){
                  j--;
                continue;
            }
            char temp=charr[i];
            charr[i]=charr[j];
            charr[j]=temp;
            i++;
            j--;
        }
        return new String(charr);
    }
}
