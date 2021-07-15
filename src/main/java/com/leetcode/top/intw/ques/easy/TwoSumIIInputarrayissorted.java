package com.leetcode.top.intw.ques.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIIInputarrayissorted {

	public static void main(String[] args) {
		int[] nums = new int[] {2,3,7,9};
		int target = 9;
		int[] twoSum = twoSum(nums, target);
		System.out.println(Arrays.toString(twoSum));
		
		nums = new int[] {2,7,11,15};
		target = 9;
		twoSum = twoSum(nums, target);
		System.out.println(Arrays.toString(twoSum));
		
		nums = new int[] {2,3,4};
		target = 6;
		twoSum = twoSum(nums, target);
		System.out.println(Arrays.toString(twoSum));
		
		nums = new int[] {-12,3,7,9,15};
		target = 3;
		twoSum = twoSum(nums, target);
		System.out.println(Arrays.toString(twoSum));
	}

	public static int[] twoSum(int[] nums, int target) {
		if(nums.length == 2)
		{
			return new int[] {1,2};
		}
		int[] res = new int[2];
		int l = 0, r = nums.length-1;
		while(l < r)
		{
			int result = nums[l] + nums[r];
			if(result == target)
			{
				res[0] = l+1;
				res[1] = r+1;
				break;
			}
			if(result < target)
			{
				l++;
			}
			else
			{
				r--;
			}
		}
		
		return res;
	}
	
	public static int[] twoSum_1(int[] numbers, int target) {
		if(numbers.length == 2)
		{
			return new int[] {1,2};
		}
		int[] res = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if(!map.containsKey(numbers[i]))
			{
				map.put(target-numbers[i], i+1);
			}
			else
			{
				res[0] = map.get(numbers[i]);
				res[1] = i+1;
			}
		}
		
		return res;
	}
}
