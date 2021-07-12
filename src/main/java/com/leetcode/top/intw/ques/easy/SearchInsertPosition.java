package com.leetcode.top.intw.ques.easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 5;
		int i = searchInsert(nums, target);
		System.out.println(i);

		nums = new int[] { 1, 3, 5, 6 };
		target = 2;
		i = searchInsert(nums, target);
		System.out.println(i);
	}

	public static int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		if (target < nums[0]) {
			return 0;
		} else if (target > nums[nums.length - 1]) {
			return nums.length;
		}

		int low = 0, high = nums.length - 1;
		while (low <= high) {
			int mid = high - (high - low) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}
}
