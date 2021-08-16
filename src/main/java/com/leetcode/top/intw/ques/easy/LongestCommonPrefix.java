package com.leetcode.top.intw.ques.easy;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 * 
 * @author sunil
 *
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		String commonPrefix = longestCommonPrefix(strs);
		System.out.println(commonPrefix);
		
		strs = new String[]{"flower","flow","floght"};
		commonPrefix = longestCommonPrefix(strs);
		System.out.println(commonPrefix);
		
		strs = new String[]{"flow1","flow1","flow2"};
		commonPrefix = longestCommonPrefix(strs);
		System.out.println(commonPrefix);
		
		strs = new String[]{"dog","racecar","car"};
		commonPrefix = longestCommonPrefix(strs);
		System.out.println(commonPrefix);
	}

	public static String longestCommonPrefix(String[] strs) {
		String BLANK = "";
		if(strs == null || strs.length == 0)
		{
			return BLANK;
		}
		
		int len = strs[0].length();
		for(int i = len; i > 0; i--)
		{
			for (String string : strs) {
				String substring = strs[0].substring(0, len);
				if(substring.length() > string.length())
				{
					len = string.length();	//common prefix should not be more than length of minimum string
					break;
				}
				if(!string.startsWith(substring))
				{
					len--;
					break;
				}
			}
			if(len <= 0)
			{
				break;
			}
		}
		
		return strs[0].substring(0, len);
	}
}
