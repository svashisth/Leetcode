package com.leetcode.top.intw.ques;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/valid-anagram/
 *
 */
public class ValidAnagram {

	public static void main(String[] args) {
		ValidAnagram main = new ValidAnagram();
		boolean anagram = main.isAnagram("rail safety", "fairy tales");
		System.out.println("main\t" + anagram);

		anagram = main.isAnagram("eleven plus two", "twelve plus one");
		System.out.println("main\t" + anagram);

		anagram = main.isAnagram("aacc", "ccac");
		System.out.println("main\t" + anagram);
	}

	public boolean isAnagram(String s, String t) {
		int[] alphabet = new int[127];
		for (int i = 0; i < s.length(); i++)
		{
			alphabet[s.charAt(i)]++;
		}
		for (int i = 0; i < t.length(); i++)
		{
			alphabet[t.charAt(i)]--;
			if(alphabet[t.charAt(i)] < 0)
			{
				return false;
			}
		}
		for (int i : alphabet)
		{
			if (i != 0)
			{
				return false;
			}
		}
		return true;
	}

	public boolean isAnagram_1(String s, String t) {
		if (s == null || t == null) {
			return false;
		}
		s = s.replaceAll(" ", "");
		t = t.replaceAll(" ", "");
		if (s.length() != t.length()) {
			return false;
		}
		char[] charArrayS = s.toCharArray();
		Arrays.sort(charArrayS);
		char[] charArrayT = t.toCharArray();
		Arrays.sort(charArrayT);
		if (!String.valueOf(charArrayS).equals(String.valueOf(charArrayT))) {
			return false;
		}

		return true;
	}
}
