package com.leetcode.top.intw.ques.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		RomanToInteger rToI = new RomanToInteger();
		int num = rToI.romanToInt("III");
		System.out.println(num);
		
		num = rToI.romanToInt("IV");
		System.out.println(num);
		
		num = rToI.romanToInt("LVIII");
		System.out.println(num);
		
		num = rToI.romanToInt("MCMXCIV");
		System.out.println(num);
		
		num = rToI.romanToInt("MMMDLXXXVI");
		System.out.println(num);
	}

	public Map<Character, Integer> map = new HashMap<Character, Integer>();
	{
		map.put('M', 1000);
		map.put('D', 500);
		map.put('C', 100);
		map.put('L', 50);
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);		
	}
	
	public int romanToInt(String s) {
		if(s == null || s.isEmpty())
		{
			return 0;
		}
		
		int num = 0;
		char prevNum = s.charAt(0);
		for(char c : s.toCharArray())
		{
			num += map.get(c);
			if(c == 'V' || c == 'X')
			{
				if(prevNum == 'I')
				{
					num = num - 2*1;
				}
			}
			else if(c == 'L' || c == 'C')
			{
				if(prevNum == 'X')
				{
					num = num - 2*10;
				}
			}
			else if(c == 'D' || c == 'M')
			{
				if(prevNum == 'C')
				{
					num = num - 2*100;
				}
			}
			prevNum = c;
		}
		
		return num;
	}
}
