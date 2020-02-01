package com.leetcode.top.intw.ques;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-increasing-subsequence/
 *
 */
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		LongestIncreasingSubsequence main = new LongestIncreasingSubsequence();
		int lengthOfLIS = main.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18});
		System.out.println("main\t" + lengthOfLIS);
		
		lengthOfLIS = main.lengthOfLIS(new int[]{10,90,2,5,3,7,101,18,120,150,19,21,201});
		System.out.println("main\t" + lengthOfLIS);
		
		lengthOfLIS = main.lengthOfLIS(new int[]{2,2});
		System.out.println("main\t" + lengthOfLIS);
		
		lengthOfLIS = main.lengthOfLIS(new int[]{10,22,9,33,21,50,41,60,80});
		System.out.println("main\t" + lengthOfLIS);
	}

	public int lengthOfLIS(int[] nums) {
		if(nums == null || nums.length ==0)
		{
			return 0;
		}
		if(nums.length == 1)
		{
			return 1;
		}
		int max = 0;
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if(nums[i] > nums[j])
				{
					arr[i] = Math.max(arr[i], arr[j] + 1);
					if(arr[i] > max)
					{
						max = arr[i];
					}
				}
			}
			System.out.println("lengthOfLIS\t" + Arrays.toString(arr));
		}
		
		return max+1;
	}
}
