/**
 * 
 */
package com.leetcode.top.intw.ques.medium;

/**
 * https://leetcode.com/problems/longest-common-subsequence/
 * 
 */
public class LongestCommonSubsequence {

	/**
	 * @param args
	 */
	public static void main1(String[] args) {
		LongestCommonSubsequence main = new LongestCommonSubsequence();
		int longestCommonSubsequence = main.longestCommonSubsequence("abcde", "ace");
		System.out.println("main\t" + longestCommonSubsequence);
		
		longestCommonSubsequence = main.longestCommonSubsequence("abc", "abc");
		System.out.println("main\t" + longestCommonSubsequence);

		longestCommonSubsequence = main.longestCommonSubsequence("ezupkr","ubmrapg");
		System.out.println("main\t" + longestCommonSubsequence);
		
		longestCommonSubsequence = main.longestCommonSubsequence("bsbininm","jmjkbkjkv");
		System.out.println("main\t" + longestCommonSubsequence);
	}

	public int longestCommonSubsequence(String text1, String text2) {
		if(text1 == null || text1.isEmpty() || text2 == null || text2.isEmpty())
		{
			return 0;
		}
		
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		int[][] mem = new int[text1.length()+1][text2.length()+1];
		for (int row = 1; row < mem.length; row++) {	
			for (int col = 1; col < mem[row].length; col++)
			{
				if(charArray1[row-1] == charArray2[col-1])
				{
					mem[row][col] = mem[row-1][col-1] + 1;
				}
				else
				{
					mem[row][col] = Math.max(mem[row-1][col], mem[row][col-1]);
				}
			}
		}

		return mem[text1.length()][text2.length()];
	}
}
