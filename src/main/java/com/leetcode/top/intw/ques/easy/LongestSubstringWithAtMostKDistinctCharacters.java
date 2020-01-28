/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

import java.util.Arrays;

/**
 * Given a string S, find the length of the longest substring T that contains at most k distinct characters.
 * 
 * For example,
 * Given S = “eceba”, k = 2
 * T is "ece" which its length is 3.
 * 
 */
public class LongestSubstringWithAtMostKDistinctCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LongestSubstringWithAtMostKDistinctCharacters main = new LongestSubstringWithAtMostKDistinctCharacters();
		int findMaxString = main.findMaxString("eceba", 2);
		System.out.println("eceba\t" + findMaxString);
		
		findMaxString = main.findMaxString("aabcccde", 3);
		System.out.println("aabcccde\t" + findMaxString);

		findMaxString = main.findMaxString("nmeernnt", 2);
		System.out.println("nmeernnt\t" + findMaxString);
		
		findMaxString = main.findMaxString("baaaaackdddddd", 3);
		System.out.println("baaaaackdddddd\t" + findMaxString);
		
		findMaxString = main.findMaxString("aaaaaklllll", 3);
		System.out.println("aaaaaklllll\t" + findMaxString);
		
		findMaxString = main.findMaxString("abaac", 2);
		System.out.println("abaac\t" + findMaxString);
		
		findMaxString = main.findMaxString("abcaaaaaa", 2);
		System.out.println("abcaaaaaa\t" + findMaxString);
		
		findMaxString = main.findMaxString("baaaaacdddddd", 3);
		System.out.println("baaaaacddddddt\t" + findMaxString);
	}

	public int findMaxString(String str, int k)
	{
		if(str.length() <= k)
		{
			return str.length();
		}
		//aabcccde
		//nmeernnt
		//baaaaackdddddd
		//aaaaaklllll
		int i = 0, maxLen = 0, distinctNum = 0;
		int[] loc = new int[127];
		char[] charArray = str.toCharArray();
		for (int j = 0; j < charArray.length; j++) {
			if(loc[charArray[j]] == 0)
				distinctNum++;
			loc[charArray[j]]++;
			if(distinctNum > k)
			{
				maxLen = Math.max(maxLen, j-i);
				int l = i; 
				i = i + loc[charArray[i]];
				loc[charArray[l]] = 0;
				distinctNum--;
			}
		}
		
		maxLen = Math.max(charArray.length-i, maxLen);
		return maxLen;
	}
}
