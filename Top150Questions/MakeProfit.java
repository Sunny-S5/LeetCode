package Top150Questions;

public class MakeProfit {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        for(int price:prices){
           if(price<buyPrice){
            buyPrice=price;
           }
           int profit=price-buyPrice;
           if(profit>maxProfit){
            maxProfit=profit;
           }
        }
        System.out.println(maxProfit);
        return maxProfit;
    }
    public static void main(String[] args) {
        MakeProfit obj =new MakeProfit();
        obj.maxProfit(new int[] {7,1,5,3,6,4});
    }
}
