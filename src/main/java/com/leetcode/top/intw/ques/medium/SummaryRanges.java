package com.leetcode.top.intw.ques.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/summary-ranges/
 *
 */
public class SummaryRanges {

	public static void main(String[] args) {
		int[] nums = {0,1,2,4,5,7};
		List<String> summaryRanges = SummaryRanges.summaryRanges(nums);
		System.out.println(summaryRanges);
		
		nums = new int[]{0,1,2,4,5,7,8};
		summaryRanges = SummaryRanges.summaryRanges(nums);
		System.out.println(summaryRanges);
		
		nums = new int[]{0,2,3,4,6,8,9};
		summaryRanges = SummaryRanges.summaryRanges(nums);
		System.out.println(summaryRanges);
		
		nums = new int[]{-1};
		summaryRanges = SummaryRanges.summaryRanges(nums);
		System.out.println(summaryRanges);
		
		nums = new int[]{0,2};
		summaryRanges = SummaryRanges.summaryRanges(nums);
		System.out.println(summaryRanges);
	}

	public static List<String> summaryRanges(int[] nums) {
		if(nums == null || nums.length == 0)
        {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        int len = nums.length;
        int indx = 0;
        StringBuilder sb = new StringBuilder();
        while (indx < len) {
            sb.append(nums[indx]);
            if (indx < len - 1 && nums[indx] + 1 == nums[indx + 1]) {
                sb.append("->");
                while (indx < len - 1 && nums[indx] + 1 == nums[indx + 1]) {
                    indx++;
                }
                sb.append(nums[indx]);
            }
            result.add(sb.toString());
            indx++;
            sb.setLength(0);
        }
        return result;
    }
	
	public static List<String> summaryRanges_1(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return Collections.emptyList();
        }
		List<String> list = new ArrayList<>();
		if(nums.length == 1)
		{
			list.add(nums[0] + "");
			return list;
		}
		int prev = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] != (nums[i-1]+1))
			{
				if(prev == nums[i-1])
				{
					list.add(prev+"");
				}
				else
				{
					list.add(prev+"->" + nums[i-1]);
				}
				if(i == nums.length-1)
				{
					list.add(nums[i]+"");
				}
				prev = nums[i];
			}
			else
			{
				if(i == nums.length-1)
				{
					list.add(+prev+"->" + nums[i]);
				}
			}
		}
		
		return list;
    }
}
