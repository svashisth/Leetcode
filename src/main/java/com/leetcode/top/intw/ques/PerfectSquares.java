package com.leetcode.top.intw.ques;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/perfect-squares/
 *
 */
public class PerfectSquares {

	public static void main(String[] args) {
		PerfectSquares main = new PerfectSquares();
		int numSquares = main.numSquares(11);
		System.out.println("main\t" + numSquares);
		
		numSquares = main.numSquares(12);
		System.out.println("main\t" + numSquares);
		
		numSquares = main.numSquares(14);
		System.out.println("main\t" + numSquares);
		
		numSquares = main.numSquares(16);
		System.out.println("main\t" + numSquares);
	}

	public int numSquares(int n) {
		int[] dp =new int[n+1];
		Arrays.fill(dp, n);
		dp[0] = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j*j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i-j*j]+1);
			}
		}
		return dp[n];
	}

}
