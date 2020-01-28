/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.lintcode.com/problem/sum-of-square-numbers/description
 *
 */
public class SumOfSquareNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SumOfSquareNumbers main = new SumOfSquareNumbers();
		boolean perfectSquare = main.judgeSquareSum(2147483646);
		System.out.println("main\t" + perfectSquare);
		
		perfectSquare = main.judgeSquareSum(0);
		System.out.println("main\t" + perfectSquare);
		
		perfectSquare = main.judgeSquareSum(4);
		System.out.println("main\t" + perfectSquare);
		
		perfectSquare = main.judgeSquareSum(5);
		System.out.println("main\t" + perfectSquare);
		
		perfectSquare = main.judgeSquareSum(10);
		System.out.println("main\t" + perfectSquare);
	}

	public boolean judgeSquareSum(int num)
	{
		if (num < 0) {
            return false;
        }
        int left = 0, right = (int)Math.sqrt(num);
        while (left <= right) {
            int cur = left * left + right * right;
            if (cur < num) {
                left++;
            } else if (cur > num) {
                right--;
            } else {
                return true;
            }
        }
        return false;
	}
	
	public boolean judgeSquareSum_1(int num) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i <= Math.sqrt(num); i++) {
			set.add(i * i);
			if (set.contains(num - i * i)) {
				return true;
			}
		}
		return false;
	}
}
