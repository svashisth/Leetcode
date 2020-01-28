/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/97/dynamic-programming/566/
 */
public class MaximumSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaximumSubarray main = new MaximumSubarray();
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int maxSubArray = main.maxSubArray(nums);
		System.out.println("main\t" + maxSubArray);
		
		int[] nums1 = {-2,1,-3, 1,1,1,1 ,-1,2,1,-5,4};
		maxSubArray = main.maxSubArray(nums1);
		System.out.println("main\t" + maxSubArray);
		
		int[] nums2 = {1,1,1,1,99};
		maxSubArray = main.maxSubArray(nums2);
		System.out.println("main\t" + maxSubArray);
	}

	public int maxSubArray(int[] nums) {
		int maxSum = nums[0], maxSumTillHere = nums[0];
		for (int i = 1; i < nums.length; i++) {
			maxSumTillHere = Math.max(maxSumTillHere+nums[i], nums[i]);
			maxSum = Math.max(maxSumTillHere, maxSum);
		}
		
		return maxSum;
	}
}
