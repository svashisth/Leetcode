package com.leetcode.top.intw.ques.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 * 
 * @author sunil
 *
 */
public class MinCostClimbingStairs {

	public static void main(String[] args) {
		int cost[] = { 10, 15, 20 };
		int c = minCostClimbingStairs(cost);
		System.out.println(c);
	}

	public static int minCostClimbingStairs(int[] cost) {
		if (cost == null || cost.length == 0) {
			return 0;
		}

		int dp[] = new int[cost.length + 1];
		dp[0] = cost[0];
		dp[1] = cost[1];
		for (int i = 2; i < cost.length; i++) {
			dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
		}

		return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
	}

	//Top Down DP - Add memoization to recursion
	int[] dp;

	public int minCostClimbingStairs_1(int[] cost) {
		int n = cost.length;
		dp = new int[n];
		return Math.min(minCost(cost, n - 1), minCost(cost, n - 2));
	}

	private int minCost(int[] cost, int n) {
		if (n < 0)
			return 0;
		if (n == 0 || n == 1)
			return cost[n];
		if (dp[n] != 0)
			return dp[n];
		dp[n] = cost[n] + Math.min(minCost(cost, n - 1), minCost(cost, n - 2));
		return dp[n];
	}
}
