package com.leetcode.top.intw.ques;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 *
 */
public class BestTimeToBuyAndSellStockII {

	public static void main(String[] args) {
		BestTimeToBuyAndSellStockII main = new BestTimeToBuyAndSellStockII();
		int[] ar = { 7, 1, 5, 3, 6, 4 };
		int maxProfit = main.maxProfit(ar);
		System.out.println("main\t" + maxProfit);
		
		int[] ar1 = { 1,2,3,4,5 };
		maxProfit = main.maxProfit(ar1);
		System.out.println("main\t" + maxProfit);
		
		int[] ar2 = { 1,5,3,8,9 };
		maxProfit = main.maxProfit(ar2);
		System.out.println("main\t" + maxProfit);
	}

	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int total = 0;
	    for (int i=1; i< prices.length-1; i++) {
	        if (prices[i]>prices[i-1])
	        {
	        	total += prices[i]-prices[i-1];
	        }
	    }
	    
	    return total;
	}
	
	/**
	 * Incorrect
	 * 
	 * @param prices
	 * @return
	 */
	public int maxProfit_1(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}

		int cash = 0;
		int hold = cash - prices[0];

		for (int i = 1; i < prices.length; i++) {
			hold = Math.max(hold, cash - prices[i]);
			cash = Math.max(cash, hold + prices[i]);
		}

		return cash;
	}

}
