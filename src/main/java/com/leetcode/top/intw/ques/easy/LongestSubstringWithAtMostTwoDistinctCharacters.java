/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

/**
 * Given a string S, find the length of the longest substring T that contains at most two
 * distinct characters.
 * 
 * For example,
 * Given S = “eceba”, 
 * T is "ece" which its length is 3.
 * 
 */
public class LongestSubstringWithAtMostTwoDistinctCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LongestSubstringWithAtMostTwoDistinctCharacters main = new LongestSubstringWithAtMostTwoDistinctCharacters();
		int findMaxString = main.findMaxString("eceba");
		System.out.println("eceba\t" + findMaxString);
		
		findMaxString = main.findMaxString("aabcccde");
		System.out.println("aabcccde\t" + findMaxString);

		findMaxString = main.findMaxString("nmeernnt");
		System.out.println("nmeernnt\t" + findMaxString);
		
		findMaxString = main.findMaxString("baaaaackdddddd");
		System.out.println("baaaaackddddddt\t" + findMaxString);
		
		findMaxString = main.findMaxString("aaaaaklllll");
		System.out.println("aaaaaklllll\t" + findMaxString);
		
		findMaxString = main.findMaxString("abaac");
		System.out.println("abaac\t" + findMaxString);
		
		findMaxString = main.findMaxString("abcaaaaaa");
		System.out.println("abaac\t" + findMaxString);
	}

	public int findMaxString(String str)
	{
		//aabcccde
		//nmeernnt
		//baaaaackdddddd
		//aaaaaklllll
		int i = 0, maxLen = 0;
		char[] loc = new char[2];
		char[] charArray = str.toCharArray();
		loc[0] = charArray[0];
		for (int j = 0; j < charArray.length; j++) {
//			System.out.print(charArray[j] + "\t" + charArray[i]);
//			System.out.println("\t\t" +Arrays.toString(loc));
			if(charArray[j] != charArray[i])
			{
				if(charArray[j] != loc[0] && charArray[j] != loc[1])
				{
					maxLen = Math.max(j-i, maxLen);
					i = j-1;
					loc[0] = charArray[i];
					loc[1] = charArray[j]; 
				}
			}
		}
		
		maxLen = Math.max(charArray.length-i, maxLen);
		return maxLen;
	}
}
