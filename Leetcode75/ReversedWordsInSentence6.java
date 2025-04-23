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
    public static void main(String[] args) {
        ReversedWordsInSentence6 obj=new ReversedWordsInSentence6();
        // System.out.println("output is :"+"hello world");
        String str;
        str=obj.reversedstring("  java script is very fantastic language ");
        System.out.println("output is :"+str);
    }
}
