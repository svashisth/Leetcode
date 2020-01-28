package com.leetcode.top.intw.ques.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/submissions/detail/291785611/
 *
 */
public class PlusOne {

	public static void main(String[] args) {
		PlusOne main = new PlusOne();
		
		int[] digits = {1,2,3,4};
		int[] plusOne = main.plusOne(digits);
		System.out.println("main\t" + Arrays.toString(plusOne));
		
		digits = new int[] {1,2,3,4,8};
		plusOne = main.plusOne(digits);
		System.out.println("main\t" + Arrays.toString(plusOne));
		
		digits = new int[] {7,7,4,4,8,0};
		plusOne = main.plusOne(digits);
		System.out.println("main\t" + Arrays.toString(plusOne));
		
		digits = new int[] {1,2,3,4,9};
		plusOne = main.plusOne(digits);
		System.out.println("main\t" + Arrays.toString(plusOne));
		
		digits = new int[] {1,2,9,9,9};
		plusOne = main.plusOne(digits);
		System.out.println("main\t" + Arrays.toString(plusOne));
		
		digits = new int[] {1,9,9,9,9};
		plusOne = main.plusOne(digits);
		System.out.println("main\t" + Arrays.toString(plusOne));
		
		digits = new int[] {0,9,9,9,9,9};
		plusOne = main.plusOne(digits);
		System.out.println("main\t" + Arrays.toString(plusOne));
		
		digits = new int[] {9,9,9,9,9,9};
		plusOne = main.plusOne(digits);
		System.out.println("main\t" + Arrays.toString(plusOne));
		
		digits = new int[] {9};
		plusOne = main.plusOne(digits);
		System.out.println("main\t" + Arrays.toString(plusOne));
	}

	public int[] plusOne(int[] digits) {
		if(digits == null || digits.length < 1)
		{
			return digits;
		}
		
		if(digits[digits.length-1] < 9)
		{
			digits[digits.length-1]++;
			return digits;
		}
		
		boolean hasCarryOver = false;
		for (int i = digits.length-1; i >= 0; i--) {
			if(digits[i] == 9)
			{
				digits[i] = 0;
				hasCarryOver = true; 
			}
			else
			{
				if(hasCarryOver)
				{
					digits[i]++;
					hasCarryOver = false;
				}
				break;
			}
		}
		
		if(hasCarryOver)
		{
			int[] newDigits = new int[digits.length+1];
			newDigits[0] = 1;
			for (int i = 1; i < newDigits.length; i++) {
				newDigits[i] = digits[i-1];
			}
			return newDigits;
		}
		return digits;
	}

}
