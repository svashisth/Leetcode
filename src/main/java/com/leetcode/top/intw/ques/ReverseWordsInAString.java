package com.leetcode.top.intw.ques;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string/
 *
 */
public class ReverseWordsInAString {

	public static void main(String[] args) {
		ReverseWordsInAString main = new ReverseWordsInAString();
		String reverseWords = main.reverseWords("the sky is blue");
		System.out.println("main\t" + reverseWords);
		
		reverseWords = main.reverseWords("  hello world!  ");
		System.out.println("main\t" + reverseWords);
		
		reverseWords = main.reverseWords("hello   world! ");
		System.out.println("main\t" + reverseWords);
		
		reverseWords = main.reverseWords("1 2 3\t4");
		System.out.println("main\t" + reverseWords);
	}

	public String reverseWords(String s) {
		if(s == null || s.isEmpty())
		{
			return s;
		}
		if(!s.contains(" "))
		{
			return s;
		}
		s = s.trim();
		
		String[] split = s.split(" ");
		
		StringBuilder str = new StringBuilder("");
		for(int i = split.length-1; i >= 0;i --)
		{
			if(!split[i].isEmpty())
			{
				str = str.append(split[i].trim()).append(" ");
			}
		}
		
		return str.toString().trim();
	}
}
