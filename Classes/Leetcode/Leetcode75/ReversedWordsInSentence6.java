package Classes.Leetcode.Leetcode75;

public class ReversedWordsInSentence6 {
    String reversedstring(String str){
        // String reversedstr;
        // String[] stringarray=new String[];
        String[] stringArray=str.trim().split("\\s+");
        String[] newarray=new String[stringArray.length];
        for(int i=0;i<stringArray.length;i++){
            newarray[i]=stringArray[stringArray.length-1-i];
        }
        // reversedstr=String.join(" ", newarray);
        return new String(String.join(" ",newarray));
    }
}
