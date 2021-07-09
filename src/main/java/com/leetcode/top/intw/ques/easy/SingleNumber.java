package com.leetcode.top.intw.ques.easy;

import java.util.Stack;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/549/
 *
 */
public class SingleNumber {

	public static void main(String[] args) {
		SingleNumber main = new SingleNumber();
		int[] nums = {1,1,2,2,3};
		int singleNumber = main.singleNumber(nums);
		System.out.println("main\t" + singleNumber);
		
		nums = new int[]{4,1,1,2,2,3,3};
		singleNumber = main.singleNumber(nums);
		System.out.println("main\t" + singleNumber);
		
		nums = new int[]{4,1,2,3,1,3,2};
		singleNumber = main.singleNumber(nums);
		System.out.println("main\t" + singleNumber);
	}

	public int singleNumber(int[] nums) {
		if(nums == null || nums.length == 0)
		{
			return -1;
		}
		
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < nums.length; i++) {			
			if(stack.contains(nums[i]))
			{
				stack.remove(stack.indexOf(nums[i]));
				continue;
			}
			
			stack.add(nums[i]);
		}
		
		return stack.pop();
	}
}
