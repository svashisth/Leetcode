package com.leetcode.top.intw.ques;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		MoveZeroes main = new MoveZeroes();
		int[] nums = new int[] {0,1,0,3,12};
		System.out.println("main\t" + Arrays.toString(nums));
		main.moveZeroes(nums);
		System.out.println("main\t" + Arrays.toString(nums));
		
		nums = new int[] {0,1,0,3,0,0,12};
		System.out.println("main\t" + Arrays.toString(nums));
		main.moveZeroes(nums);
		System.out.println("main\t" + Arrays.toString(nums));
	}

	public void moveZeroes(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0)
			{
				nums[index++] = nums[i];
			}
		}
		for(int i = index; i< nums.length; i++)
		{
			nums[i] = 0;
		}
	}
}
