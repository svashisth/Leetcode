package com.leetcode.top.intw.ques.easy;

public class ReverseInteger {

	public static void main(String[] args) {
		int x = -120;
		System.out.println(reverse(x));
		
		x = 321;
		System.out.println(reverse(x));

		x = -1214546456;
		System.out.println(reverse(x));

	}

	public static int reverse(int x) {
		if(x == 0 || (x > 0 && x < 10))
		{
			return x;
		}
		
		int neg = x < 0 ? -1 : 1;
		x = x * neg;
		String string = String.valueOf(x);
		String reversed = new StringBuilder(string).reverse().toString();
		int valueOf = 0;
		try
		{
			valueOf = Integer.valueOf(reversed);
		}
		catch(Exception ex)
		{
		}
		valueOf = valueOf * neg;
		return valueOf;
	}
}
