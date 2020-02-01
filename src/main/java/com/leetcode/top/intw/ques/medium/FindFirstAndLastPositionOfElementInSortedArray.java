/**
 * 
 */
package com.leetcode.top.intw.ques.medium;

import java.util.Arrays;

/**
 *
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindFirstAndLastPositionOfElementInSortedArray main = new FindFirstAndLastPositionOfElementInSortedArray();
		
		int[] nums = {5,7,7,8,8,10}; 
		int target = 8;
		int[] searchRange = main.searchRange(nums, target);
		System.out.println("main\t" +  Arrays.toString(searchRange));
		
		nums = new int[]{5,7,7,8,8,10}; 
		target = 6;
		searchRange = main.searchRange(nums, target);
		System.out.println("main\t" +  Arrays.toString(searchRange));
		
		nums = new int[]{1,2,3}; 
		target = 2;
		searchRange = main.searchRange(nums, target);
		System.out.println("main\t" +  Arrays.toString(searchRange));
		
		nums = new int[]{1,1,2}; 
		target = 1;
		searchRange = main.searchRange(nums, target);
		System.out.println("main\t" +  Arrays.toString(searchRange));
		
		nums = new int[]{1,1,2,3,3,4,5,6}; 
		target = 2;
		searchRange = main.searchRange(nums, target);
		System.out.println("main\t" +  Arrays.toString(searchRange));
	}

	public int[] searchRange(int[] nums, int target) {
		int[] result = new int[] {-1, -1};
		if(nums == null || nums.length == 0)
		{
			return result;
		}
		
		result[0] = searchFirst(nums, target);
		result[1] = searchLast(nums, target);
		
		return result;
	}

	private int searchFirst(int[] nums, int target) {
		int idx = -1;
		int start = 0, end = nums.length-1;
		
		while(start <= end)
		{
			int mid = end + (start - end) / 2;
			if(nums[mid] == target)
			{
				idx = mid;
			}
			if(nums[mid] >= target)
			{
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
		}
		
		return idx;
	}
	
	/**
	 * @param nums
	 * @param target
	 */
	private int searchLast(int[] nums, int target) {
		int idx = -1;
		int start = 0, end = nums.length-1;
		
		while(start <= end)
		{
			int mid = end + (start - end) / 2;
			if(nums[mid] == target)
			{
				idx = mid;
			}
			if(nums[mid] <= target)
			{
				start = mid + 1;
			}
			else
			{
				end = mid - 1;
			}
		}
		
		return idx;
	}
	
}
