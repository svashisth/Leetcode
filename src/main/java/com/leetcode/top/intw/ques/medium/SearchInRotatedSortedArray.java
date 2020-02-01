/**
 * 
 */
package com.leetcode.top.intw.ques.medium;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class SearchInRotatedSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SearchInRotatedSortedArray main = new SearchInRotatedSortedArray();
		
		int[] nums = {4,5,6,7,0,1,2};
		int target = 4;
		int search = main.search(nums, target);
		System.out.println("main\t" + search);

		nums = new int[]{4,5,6,7,0,1,2};
		target = 3;
		search = main.search(nums, target);
		System.out.println("main\t" + search);
		
		nums = new int[]{4,5,6,7,0,1,2,3};
		target = 3;
		search = main.search(nums, target);
		System.out.println("main\t" + search);
		
		nums = new int[]{0};
		target = 0;
		search = main.search(nums, target);
		System.out.println("main\t" + search);
		
		nums = new int[]{0,0,0,0,0,1,0,0,0,0};
		target = 1;
		search = main.search(nums, target);
		System.out.println("main\t" + search);
		
		nums = new int[]{1,3,5};
		target = 3;
		search = main.search(nums, target);
		System.out.println("main\t" + search);
	}

	/**
	 * Based on the idea that half of the array would always be sorted
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search(int[] nums, int target) {
		if(nums == null || nums.length == 0)
		{
			return -1;
		}
		
		int start = 0, end = nums.length - 1;
		
		while(start <= end)
		{
			int mid = end - ((end-start) >> 1);
			if(nums[mid] == target)
			{
				return mid;
			}
			
			if(nums[start] <= nums[mid])
			{
				if(target >= nums[start] && target < nums[mid])
				{
					end = mid - 1;
				}
				else
				{
					start = mid + 1;
				}
			}
			
			if(nums[mid] <= nums[end])
			{
				if(target > nums[mid] && target <= nums[end])
				{
					start = mid + 1;
				}
				else
				{
					end = mid - 1;
				}
			}
		}
		
		return -1;
	}
	/**
	 * 
	 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
	 * 
	 * Though 0 ms, search_1 is still O(n/2) = O(n)
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search_1(int[] nums, int target) {
		if(nums == null || nums.length == 0)
		{
			return -1;
		}
		
		int first = 0, last = nums.length - 1;
		while(first <= last) {
			if(nums[first++] == target)
			{
				return first - 1;
			}
			else if (nums[last--] == target)
			{
				return last + 1;
			}            
		}
		
		return -1;
	}

}
