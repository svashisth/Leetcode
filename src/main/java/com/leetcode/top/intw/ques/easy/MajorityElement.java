package com.leetcode.top.intw.ques.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/majority-element/
 * 
 * @author sunil
 *
 */
public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = new int[] {3,2,3};
		int majorityElement = majorityElement(nums);
		System.out.println(majorityElement);
		
		nums = new int[] {2,2,1,1,1,2,2};
		majorityElement = majorityElement(nums);
		System.out.println(majorityElement);
	}

	public static int majorityElement(int[] nums) {
		if(nums.length == 1)
		{
			return nums[0];
		}
		
		int max = Integer.MIN_VALUE;
		int maxVal = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int val = map.getOrDefault(nums[i], 0)+1;
			map.put(nums[i], val);
			if(val > max)
			{
				maxVal = nums[i];
			}
			if(val > nums.length/2)
			{
				break;
			}
		}
		return maxVal;
	}
}
