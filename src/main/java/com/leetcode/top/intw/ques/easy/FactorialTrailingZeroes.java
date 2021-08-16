package com.leetcode.top.intw.ques.easy;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		int trailingZeroes = trailingZeroes(5);
		System.out.println(trailingZeroes);
	}

	public static int trailingZeroes(int n) {
		return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
	}
}
