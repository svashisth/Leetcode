package com.leetcode.top.intw.ques.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/contiguous-array/
 * 
 * @author sunil
 *
 */
public class ContiguousArray {

	public static void main(String[] args) {
		ContiguousArray ca = new ContiguousArray();
		int[] nums = new int[] { 1, 0, 1 };
		int maxLength = ca.findMaxLength(nums);
		System.out.println(maxLength);

		nums = new int[] { 1, 0, 1, 0 };
		maxLength = ca.findMaxLength(nums);
		System.out.println(maxLength);

		nums = new int[] { 1, 0, 1, 1 };
		maxLength = ca.findMaxLength(nums);
		System.out.println(maxLength);

		nums = new int[] { 1, 0, 1, 0, 1, 0, 1, 1, 1, 0 };
		maxLength = ca.findMaxLength(nums);
		System.out.println(maxLength);

		nums = new int[] { 0, 0, 1, 0, 0, 0, 1, 1 };
		maxLength = ca.findMaxLength(nums);
		System.out.println(maxLength);
	}

	public int findMaxLength(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		
		int maxLen = 0, count = 0;

		for (int i = 0; i < nums.length; i++) {
			count += (nums[i] == 1 ? 1 : -1);
			if (map.containsKey(count)) {
				maxLen = Math.max(maxLen, i - map.get(count));
			} else {
				map.put(count, i);
			}
		}

		return maxLen;
	}
}
