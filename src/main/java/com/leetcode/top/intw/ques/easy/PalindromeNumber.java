package com.leetcode.top.intw.ques.easy;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome(123));
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(1221));
		System.out.println(isPalindrome(123321));
		System.out.println(isPalindrome(1001));
	}

	public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0))
        {
            return false;
        }
        if(x >0 && x < 10)
        {
            return true;
        }
        
        int rev = 0, y, num = x;
        while(x > 0)
        {
            y = x % 10;
            rev = rev*10 + y;
            x = x / 10;
            if(rev == x)
            {
            	return true;
            }
        }
        return (rev - num == 0);
    }
}
