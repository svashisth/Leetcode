package com.leetcode.top.intw.ques.easy;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 */
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		BestTimeToBuyAndSellStock main = new BestTimeToBuyAndSellStock();
		int[] ar = { 7, 1, 5, 3, 6, 4 };
		int maxProfit = main.maxProfit(ar);
		System.out.println("main\t" + maxProfit);
		
		int[] ar1 = { 1,2,3,4,5 };
		maxProfit = main.maxProfit(ar1);
		System.out.println("main\t" + maxProfit);
		
		int[] ar2 = { 1,5,3,8,9 };
		maxProfit = main.maxProfit(ar2);
		System.out.println("main\t" + maxProfit);
		
		int[] ar3 = { 2,4,1 };
		maxProfit = main.maxProfit(ar3);
		System.out.println("main\t" + maxProfit);
		
		int[] ar4 = { 2,4,1,9 };
		maxProfit = main.maxProfit(ar4);
		System.out.println("main\t" + maxProfit);
	}
	
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
            {
                min = prices[i];
            }
            else if (prices[i] - min > max)
            {
                max = prices[i] - min;
            }
        }
        return max;
	}
	
	public int maxProfit_2(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int max = 0;
		int prevMin = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if(prices[i] < prevMin)
			{
				prevMin = prices[i];
			}
			else if(prices[i] - prevMin > max)
			{
				max = prices[i]-prevMin;
			}
		}
		
		return max;
	}
	
	public int maxProfit_1(int[] prices) {
        if (prices == null || prices.length == 0) {
			return 0;
		}
		int max = 0;
		
		for (int i = 0; i < prices.length; i++) {
			for (int j = i+1; j < prices.length; j++) {
				if(prices[j] > prices[i])
				{
					max = Math.max(max,prices[j]-prices[i]);
				}
			}
		}
		
		return max;
    }
}
