package com.leetcode.top.intw.ques;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-cost-for-tickets/
 *
 */
public class MinimumCostForTickets {

	public static void main(String[] args) {
		MinimumCostForTickets main = new MinimumCostForTickets();
		int[] days = { 1, 4, 6, 7, 8, 20 };
		int[] costs = { 2, 7, 15 };
		int mincostTickets = main.mincostTickets(days, costs);
		System.out.println("main\t" + mincostTickets);
	}

	public int mincostTickets(int[] days, int[] costs) {
		int dp[] = new int[366];
		Arrays.fill(dp, Integer.MAX_VALUE);

		for (int i = 0; i < days.length; i++) {
			dp[days[i]] = 1;
		}
		
		dp[0] = 0;
		for (int i = 1; i < 366; i++) {
			if (dp[i] == Integer.MAX_VALUE) {
				dp[i] = dp[i - 1];
				continue;
			} 
			else {
				dp[i] = dp[i - 1] + costs[0];
			}
			if (i >= 7) {
				dp[i] = Math.min(dp[i], dp[i - 7] + costs[1]);
			}
			if (i >= 30) {
				dp[i] = Math.min(dp[i], dp[i - 30] + costs[2]);
			}
		}
		return dp[365];
	}

	public int mincostTickets_1(int[] days, int[] costs) {
		int lastDay = days[days.length - 1];
		int[] dp = new int[lastDay + 1];
		boolean[] travelDay = new boolean[lastDay + 1];
		for (int day : days) {
			travelDay[day] = true;
		}

		for (int day = 1; day <= lastDay; day++) {
			if (!travelDay[day]) {
				dp[day] = dp[day - 1];
				continue;
			}

			dp[day] = costs[0] + dp[day - 1];
			dp[day] = Math.min(costs[1] + dp[Math.max(0, day - 7)], dp[day]);
			dp[day] = Math.min(costs[2] + dp[Math.max(0, day - 30)], dp[day]);
		}

		return dp[lastDay];
	}
}
