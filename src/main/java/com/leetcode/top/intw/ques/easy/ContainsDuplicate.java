package com.leetcode.top.intw.ques.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/578/
 *
 */
public class ContainsDuplicate {

	public static void main(String[] args) {
		ContainsDuplicate main = new ContainsDuplicate();
		int[] nums = {1,2,3,1};
		boolean containsDuplicate = main.containsDuplicate(nums);
		System.out.println("main\t" + containsDuplicate);
		
		nums = new int[]{1,2,3,4};
		containsDuplicate = main.containsDuplicate(nums);
		System.out.println("main\t" + containsDuplicate);
		
		nums = new int[]{1,1,1,3,3,4,3,2,4,2};
		containsDuplicate = main.containsDuplicate(nums);
		System.out.println("main\t" + containsDuplicate);
	}

	public boolean containsDuplicate(int[] nums) {
		if(nums == null || nums.length <= 1)
		{
			return false;
		}
		Set<Integer> set = new HashSet<>(nums.length);
	    for (int x: nums) {
	        if (set.contains(x)) return true;
	        set.add(x);
	    }
		return false;
	}
	
	public boolean containsDuplicate_1(int[] nums) {
		if(nums == null || nums.length <= 1)
		{
			return false;
		}
		
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i]))
			{
				return true;
			}
			map.put(nums[i], "");
		}
		
		return false;
	}
}
