package com.leetcode.top.intw.ques;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/coin-change/
 *
 */
public class CoinChange {

	public static void main(String[] args) {
		CoinChange main = new CoinChange();
		int[] coins = new int[] { 1, 2, 5 };
		int amount = 11;
		int coinChange = main.coinChange(coins, amount);
		System.out.println("main\t" + coinChange);

		coins = new int[] { 1, 2, 5, 10 };
		amount = 13;
		coinChange = main.coinChange(coins, amount);
		System.out.println("main\t" + coinChange);

		coins = new int[] { 2 };
		amount = 3;
		coinChange = main.coinChange(coins, amount);
		System.out.println("main\t" + coinChange);

		coins = new int[] { 1 };
		amount = 2;
		coinChange = main.coinChange(coins, amount);
		System.out.println("main\t" + coinChange);

		coins = new int[] { 474, 83, 404, 3 };
		amount = 264;
		coinChange = main.coinChange(coins, amount);
		System.out.println("main\t" + coinChange);
	}

	/**
	 * bottom up
	 * 
	 * @param coins
	 * @param amount
	 * @return
	 */
	public int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
		int[] data = new int[amount + 1];
		Arrays.fill(data, amount + 1);

		data[0] = 0;
		for (int i = 1; i < data.length; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (i < coins[j]) {
					break;
				} else {
					data[i] = Math.min(data[i], data[i - coins[j]] + 1);
				}
			}
		}

		System.out.println("coinChange\t" + Arrays.toString(data));
		return data[amount] > amount ? -1 : data[amount];
	}
}
