/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

/**
 * @author AD79272
 *
 */
public class HammingDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HammingDistance main = new HammingDistance();
		int hammingDistance = main.hammingDistance(2, 4);
		System.out.println("main\t" + hammingDistance);
		
		System.out.println("main\t" + Integer.bitCount(0 ^ -3));
	}

	public int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}

}
