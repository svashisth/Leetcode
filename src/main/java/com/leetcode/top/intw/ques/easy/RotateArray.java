package com.leetcode.top.intw.ques.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/646/
 *
 */
public class RotateArray {

	public static void main(String[] args) {
		RotateArray main = new RotateArray();
		int[] nums = {1,2,3,4,5,6,7};
		main.rotate(nums, 3);
		System.out.println("main\t" + Arrays.toString(nums));
		
		nums = new int[]{1,2,3,4,5,6,7};
		main.rotate(nums, 2);
		System.out.println("main\t" + Arrays.toString(nums));
		
		nums = new int[]{-1,-100,3,99};
		main.rotate(nums, 2);
		System.out.println("main\t" + Arrays.toString(nums));
		
		nums = new int[]{1,2};
		main.rotate(nums, 3);
		System.out.println("main\t" + Arrays.toString(nums));
		
		nums = new int[]{1,2,3,4,5,6,7};
		main.rotate(nums, 27);
		System.out.println("main\t" + Arrays.toString(nums));
	}

	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		if(k == 0) return;
		reverseArray(nums, 0, nums.length-1);
		reverseArray(nums, 0, k-1);
		reverseArray(nums, k, nums.length-1);
	}
	
	private void reverseArray(int[] nums, int fromIdx, int toIdx) {
		if(fromIdx == toIdx || fromIdx > toIdx)	return;
		int temp;
		do
		{
			temp = nums[fromIdx];
			nums[fromIdx++] = nums[toIdx];
			nums[toIdx--] = temp;
		}while(fromIdx != toIdx && fromIdx < toIdx);
	}

	public void rotate_1(int[] nums, int k) {
		if(k==0)
		{
			return;
		}
		if(k >= nums.length)
		{
			if(k % nums.length == 0)
			{
				return;
			}
			
			k = k % nums.length;
		}
		
		int[] numsDup = new int[nums.length];
		
		int j = k;
		for (int i = 0; i < nums.length; i++) {
			if(j >= nums.length)
			{
				j = 0;
			}
			numsDup[j++] = nums[i];
		}
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = numsDup[i];
		}
		
	}
}
