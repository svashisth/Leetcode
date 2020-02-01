package com.leetcode.top.intw.ques.hard;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/count-of-smaller-numbers-after-self/
 *
 */
public class CountofSmallerNumbersAfterSelf {

	public static void main(String[] args) {
		CountofSmallerNumbersAfterSelf main = new CountofSmallerNumbersAfterSelf();
		int[] arr = { 5, 2, 6, 1 };
		List<Integer> countSmaller = main.countSmaller(arr);
		System.out.println("main\t" + countSmaller);
	}

	public List<Integer> countSmaller(int[] nums) {
		if (nums == null || nums.length < 1) {
			return Collections.emptyList();
		}
		List<Integer> lst = new LinkedList<Integer>();
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = nums.length - 1; j > i; j--) {
				if (nums[j] < nums[i]) {
					cnt++;
				}
			}
			lst.add(cnt);
			cnt = 0;
		}
		return lst;
	}
}
