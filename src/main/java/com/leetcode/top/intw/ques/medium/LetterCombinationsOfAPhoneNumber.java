/**
 * 
 */
package com.leetcode.top.intw.ques.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * 
 * @author sunil
 *
 */
public class LetterCombinationsOfAPhoneNumber {

	static Map<String, String> phoneMap = new HashMap<String, String>() {
		{
			put("2", "abc");
			put("3", "def");
			put("4", "ghi");
			put("5", "jkl");
			put("6", "mno");
			put("7", "pqrs");
			put("8", "tuv");
			put("9", "wxyz");
		}
	};

	
	  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = letterCombinations("012");
		System.out.println(list);
		
		list = letterCombinations("23");
		System.out.println(list);
		
		list = letterCombinations("");
		System.out.println(list);
		
		list = letterCombinations("2345");
		System.out.println(list);
	}

	public static List<String> letterCombinations(String digits) {
		if(digits == null || digits.isEmpty())
		{
			return Collections.emptyList();
		}
		
		List<String> output = new ArrayList<String>();
		Stack<String> stack = new Stack<String>();
		for (char c : digits.toCharArray()) {
			if(c == '0' || c == '1')
			{
				continue;
			}
			String string = phoneMap.get(String.valueOf(c));
			processFor(string, stack);
		}
		output.addAll(stack);
        return output;
    }

	private static void processFor(String string, Stack<String> stack) {
		if(stack.isEmpty())
		{
			for (char c : string.toCharArray()) {
				stack.add(String.valueOf(c));
			}
			return;
		}
		List<String> tmpList = new ArrayList<String>();
		while(!stack.isEmpty()) {
			String str = stack.pop();
			for (char ch : string.toCharArray()) 
			{
				tmpList.add(str+ch);
			}
		}
		stack.addAll(tmpList);
	}
}