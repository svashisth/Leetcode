package com.leetcode.top.intw.ques.easy;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 0, 1 };
		int len = removeDuplicates(nums);
		System.out.println(len);
		System.out.println(Arrays.toString(nums));

		nums = new int[] { 0, 1, 1 };
		len = removeDuplicates(nums);
		System.out.println(len);
		System.out.println(Arrays.toString(nums));
		
		nums = new int[] { 0,0,1,1,1,2,2,3,3,4 };
		len = removeDuplicates(nums);
		System.out.println(len);
		System.out.println(Arrays.toString(nums));
	}

	private static int removeDuplicates_0(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int len = 1;
		int index = 0, lastNum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (lastNum == Integer.MIN_VALUE) {
				lastNum = nums[i];
			}
			if (lastNum == nums[i]) {
				continue;
			} else {
				nums[index] = lastNum;
				lastNum = nums[i];
				len++;
				index++;
			}
		}
		
		if(nums[index] != lastNum)
		{
			nums[index] = lastNum;
		}
		
		return len;
	}
	
	private static int removeDuplicates(int[] nums) {
		if(nums.length == 0)
		{
			return 0;
		}
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if(nums[j] != nums[i])
			{
				nums[++i] = nums[j];
			}
		}
		
		return i + 1;
	}
}
