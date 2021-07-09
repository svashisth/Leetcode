/**
 * 
 */
package com.leetcode.top.intw.ques.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters main = new LongestSubstringWithoutRepeatingCharacters();
		int lengthOfLongestSubstring = main.lengthOfLongestSubstring("abcabcbb");
		System.out.println("main\t" + lengthOfLongestSubstring);

		lengthOfLongestSubstring = main.lengthOfLongestSubstring("bbbbb");
		System.out.println("main\t" + lengthOfLongestSubstring);

		lengthOfLongestSubstring = main.lengthOfLongestSubstring("pwwkew");
		System.out.println("main\t" + lengthOfLongestSubstring);

		lengthOfLongestSubstring = main.lengthOfLongestSubstring("awakew");
		System.out.println("main\t" + lengthOfLongestSubstring);
		
		lengthOfLongestSubstring = main.lengthOfLongestSubstring("abcazq");
		System.out.println("main\t" + lengthOfLongestSubstring);
		
		lengthOfLongestSubstring = main.lengthOfLongestSubstring("  ");
		System.out.println("main\t" + lengthOfLongestSubstring);
		
		lengthOfLongestSubstring = main.lengthOfLongestSubstring("au");
		System.out.println("main\t" + lengthOfLongestSubstring);
		
		lengthOfLongestSubstring = main.lengthOfLongestSubstring("c");
		System.out.println("main\t" + lengthOfLongestSubstring);
		
		lengthOfLongestSubstring = main.lengthOfLongestSubstring("");
		System.out.println("main\t" + lengthOfLongestSubstring);
	}

	public int lengthOfLongestSubstring(String s) {
		int i = 0, maxLen = 0;
		int[] charMap = new int[256];
		Arrays.fill(charMap, -1);
		char[] str = s.toCharArray();
		for (int j = 0; j < str.length; j++) {
			if (charMap[s.charAt(j)] >= i) {
				i = charMap[s.charAt(j)] + 1;
			}
			charMap[s.charAt(j)] = j;
			maxLen = Math.max(j - i + 1, maxLen);
		}

		return maxLen;
	}
	
	public int lengthOfLongestSubstring_1(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
