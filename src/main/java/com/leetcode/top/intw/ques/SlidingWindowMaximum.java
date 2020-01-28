package com.leetcode.top.intw.ques;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sliding-window-maximum
 *
 */
public class SlidingWindowMaximum {

	public static void main(String[] args) {
		SlidingWindowMaximum main = new SlidingWindowMaximum();
		int[] maxSlidingWindow = main.maxSlidingWindow(new int[] {}, 1);
		System.out.println("main\t" + Arrays.toString(maxSlidingWindow));
		
		maxSlidingWindow = main.maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 1);
		System.out.println("main\t" + Arrays.toString(maxSlidingWindow));
		
		maxSlidingWindow = main.maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3);
		System.out.println("main\t" + Arrays.toString(maxSlidingWindow));
		
		maxSlidingWindow = main.maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 4);
		System.out.println("main\t" + Arrays.toString(maxSlidingWindow));
		
		maxSlidingWindow = main.maxSlidingWindow(new int[] {11,3,-1,-3,5,3,6,7}, 3);
		System.out.println("main\t" + Arrays.toString(maxSlidingWindow));
		
		maxSlidingWindow = main.maxSlidingWindow(new int[] {11,3,-1,-3,5,3,6,7}, 4);
		System.out.println("main\t" + Arrays.toString(maxSlidingWindow));
	}

	public int[] maxSlidingWindow(int[] nums, int k) {
		if(k == 1)
		{
			return nums;
		}
		if(nums == null || nums.length < 2)
		{
			return nums;
		}
		
		int[] ret = new int[nums.length-k+1];
		if(k==nums.length)
		{
			ret[0] = nums[findMaxIndex(nums)];
		}
		else
		{
			int prevIndex = 0;
			for (int i = 0; i < nums.length-k+1; i++) 
			{
				if(prevIndex == 0)
				{
					prevIndex = findMaxIndex(Arrays.copyOfRange(nums, i, i+k));
					ret[i] = nums[i+prevIndex];
				}
				else
				{
					if(nums[i+k-1] > nums[prevIndex+i-1])
					{
						prevIndex = k-1;
						ret[i] = nums[i+k-1]; 
					}
					else
					{
						ret[i] = nums[prevIndex+i-1];
						prevIndex = prevIndex-1;
					}
				}
			}
		}
		
		return ret;
	}

	private int findMaxIndex(int[] nums) {
		int max = Integer.MIN_VALUE;
		int maxIdx = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > max)
			{
				maxIdx = i;
				max = nums[i];
			}
		}
		return maxIdx;
	}
}
