import java.util.*;

public class KidCandies3 {
      public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int greatestElement=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>greatestElement){
                greatestElement=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=greatestElement){
                Boolean greatest=true;  
                list.add(greatest);
            }
            else{
                Boolean greatest=false;
                list.add(greatest);
            }
        }

        Iterator<Boolean> itr=list.iterator();
        while(itr.hasNext()){
            Boolean iBoolean=itr.next();
            System.out.println("element :"+iBoolean);
        }
        return list;
    }
    public static void main(String[] args) {
        KidCandies3 obj=new KidCandies3();
        int []candies={2,3,5,1,3};
        int extracandies=3;
        ArrayList<Boolean> list=new ArrayList<>();
        Iterator <Boolean> itr= list.iterator();

        while(itr.hasNext()){
            Boolean ele=itr.next();
            list.add(ele);
        }
       obj.kidsWithCandies(candies, extracandies);
    }
}
