package com.leetcode.top.intw.ques.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/word-pattern/
 *
 */
public class WordPattern {

	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog cat cat dog";
		boolean wordPattern = wordPattern(pattern, s);
		System.out.println("wordPattern is : " + wordPattern);
		
		pattern = "abba";
		s = "dog cat cat fish";
		wordPattern = wordPattern(pattern, s);
		System.out.println("wordPattern is : " + wordPattern);
		
		pattern = "aaaa";
		s = "dog cat cat dog";
		wordPattern = wordPattern(pattern, s);
		System.out.println("wordPattern is : " + wordPattern);
		
		pattern = "abba";
		s = "dog dog dog dog";
		wordPattern = wordPattern(pattern, s);
		System.out.println("wordPattern is : " + wordPattern);
		
		pattern = "abbbac";
		s = "dog cat cat cat dog fish";
		wordPattern = wordPattern(pattern, s);
		System.out.println("wordPattern is : " + wordPattern);
		
	}

	public static boolean wordPattern(String pattern, String s) {
		String[] split = s.split(" ");
		Map<Character, String> map = new HashMap<>();
		int pos = 0;
		char[] chAr = pattern.toCharArray();
        if(split.length != chAr.length)
        {
            return false;
        }
		for (char c : pattern.toCharArray()) {
			Character key = c;
			String val = map.getOrDefault(key, "");
			if(!val.isEmpty())
			{
				if(!val.equalsIgnoreCase(split[pos]))
				{
					return false;
				}
			}
			else
			{
				if(map.containsValue(split[pos]))	//the value is already mapped to a key
				{
					return false;
				}
				map.put(key, split[pos]);
			}
			pos++;
		}
		return true;
	}
}
