package com.leetcode.top.intw.ques.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-element/
 * 
 * @author sunil
 *
 */
public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val = 2;
		int element = removeElement(nums, val);
		System.out.println(element + " # " + Arrays.toString(nums));
		
		nums = new int[]{0,1,2,2,3,0,4,2};
		val = 2;
		element = removeElement(nums, val);
		System.out.println(element + " # " + Arrays.toString(nums));
	}

	public static int removeElement(int[] nums, int val) {
		if(nums == null || nums.length == 0)
		{
			return 0;
		}
		
		int indx = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != val)
			{
				nums[indx++] = nums[i];
			}
		}
		
		return indx;
	}
}
