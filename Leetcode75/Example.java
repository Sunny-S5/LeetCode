public class Example {
    
    public static boolean isPal(String str){
        if(str.length()==0){
            return false;
        }
        String seperator="[,\\.\\s]";
        String newStr=str.trim().toLowerCase().replaceAll(seperator,"");
        // System.out.println(" newStr is : "+newStr);
        String Pal="";
        for(int i=newStr.length()-1;i>=0;i--){
          Pal+=newStr.charAt(i);
        }
        return Pal.equals(newStr);
    }

    public static void main(String[] args) {
        System.out.println(" newStr is : "+isPal("A man, a plan, a canal, Panama"));
    }

}
