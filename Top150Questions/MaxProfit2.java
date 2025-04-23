package Top150Questions;

public class MaxProfit2 {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int profit=0;
       for (int i = 1; i < prices.length; i++) {
        if(prices[i]>prices[i-1]){
            profit=profit+prices[i]-prices[i-1];
        }
       }
       System.out.println(profit);
        return profit;
    }
    public static void main(String[] args) {
        MaxProfit2 obj =new MaxProfit2();
        obj.maxProfit(new int[] {7,1,5,3,6,4});
    }
}
