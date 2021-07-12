package com.leetcode.top.intw.ques.easy;

public class ClimbingStairs {

	public static void main(String[] args) {
		int stairs = climbStairs(2);
		System.out.println(stairs);
		
		stairs = climbStairs(3);
		System.out.println(stairs);

		stairs = climbStairs(4);
		System.out.println(stairs);
	}

	public static int climbStairs(int n) {
		if(n == 1)
		{
			return 1;
		}
		int dp[] = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i <= n; i++)
		{
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
}
