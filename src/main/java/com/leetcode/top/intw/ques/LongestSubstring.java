package com.leetcode.top.intw.ques;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
 *
 */
public class LongestSubstring {

	public static void main(String[] args) {

	}

	public int longestSubstring(String s, int k) {
		int res = 0;
		char[] charArray = s.toCharArray();
		int[] reps = getRepetitionArray(s, charArray);
		
		
		return 0;
	}

	private int[] getRepetitionArray(String str, char[] charArray) {
		int[] ar = new int[charArray.length];
		ar[0] = 0;
		int i = 0;
		for (char c : charArray) {
			if(str.contains(""+c))
			{
				ar[i] = ar[i-1] + 1; 
			}
		}
		return null;
	}
}
