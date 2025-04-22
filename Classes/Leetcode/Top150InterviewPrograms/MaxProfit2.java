package Classes.Leetcode.Top150InterviewPrograms;

public class MaxProfit2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int price : prices) {
          if (price < buyPrice) {
            buyPrice = price;
          }
          int profit = price - buyPrice;
          if (profit > maxProfit) {
            maxProfit = profit;
          }
        }
        System.out.println(maxProfit);
        return maxProfit;
      }
    }