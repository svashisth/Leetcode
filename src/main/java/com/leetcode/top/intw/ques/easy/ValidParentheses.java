/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/99/others/721/
 * 
 * Better to use array (as stack) instead of StringBuilder 
 */
public class ValidParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ValidParentheses main = new ValidParentheses();
		boolean valid = main.isValid("{[]}");
		System.out.println("main\t" + valid);
		
		valid = main.isValid("()[]{}");
		System.out.println("main\t" + valid);
		
		valid = main.isValid("()");
		System.out.println("main\t" + valid);
		
		valid = main.isValid("(]");
		System.out.println("main\t" + valid);
		
		valid = main.isValid("([)]");
		System.out.println("main\t" + valid);
		
		valid = main.isValid("");
		System.out.println("main\t" + valid);
	}

	public boolean isValid(String s) {
		if(s == null || s.isEmpty())
		{
			return true;
		}
		StringBuilder str = new StringBuilder(s.length()/2+1);
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			switch (c)
			{
			case '}':	
				if(str.length() == 0 || '{' != str.charAt(str.length()-1))
				{
					return false;
				}
				else
				{
					str.setLength(str.length()-1);
				}
				break;
			case ']':
				if(str.length() == 0 ||  '[' != str.charAt(str.length()-1))
				{
					return false;
				}
				else
				{
					str.setLength(str.length()-1);
				}
				break;
			case ')':
				if(str.length() == 0 || '(' != str.charAt(str.length()-1))
				{
					return false;
				}
				else
				{
					str.setLength(str.length()-1);
				}
				break;
			default: str.append(c);
			}
		}
		
		if(str.length() == 0)
		{
			return true;
		}
		
		return false;
	}

}
