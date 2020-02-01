package com.leetcode.top.intw.ques.medium;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
 *
 */
public class BestTimeToBuyAndSellStockWithTransactionFee {

	public static void main(String[] args) {
		BestTimeToBuyAndSellStockWithTransactionFee main = new BestTimeToBuyAndSellStockWithTransactionFee();
		int maxProfit = main.maxProfit(new int[] { 1, 3, 2, 8, 4, 9 }, 2);
		System.out.println("main\t" + maxProfit);
	}
	
	public int maxProfit(int[] prices, int fee) {
		if (prices.length == 0) {
			return 0;
		}

		int cash = 0, 			//the maximum profit we could have if we did not have a share of stock
			hold = cash - prices[0];	//the maximum profit we could have if we owned a share of stock.
		for (int i = 1; i < prices.length; i++) 
		{
			cash = Math.max(cash, hold + prices[i] - fee);
			hold = Math.max(hold, cash - prices[i]);

			System.out.println("cash=" + cash +"\thold=" + hold);
		}
		return cash;
	}
}
