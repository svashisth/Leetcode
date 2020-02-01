/**
 * 
 */
package com.leetcode.top.intw.ques.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-intervals/
 */
public class MergeIntervals {

	public static void main(String[] args) {
		MergeIntervals main = new MergeIntervals();
		int[][] intervals = new int[][] {{1,2},{3,7},{5,9},{3,6}};
		int[][] result = main.merge(intervals);
		System.out.println("result\t" + Arrays.deepToString(result));
		
		intervals = new int[][] {{1,4}, {4,5}};
		result = main.merge(intervals);
		System.out.println("result\t" + Arrays.deepToString(result));
		
		intervals = new int[][] {{1,3}, {9,11}, {7,9}, {4,10}};
		result = main.merge(intervals);
		System.out.println("result\t" + Arrays.deepToString(result));
	}

	public int[][] merge(int[][] intervals) {
		if(intervals == null || intervals.length <= 1)
		{
			return intervals;
		}
		
		Arrays.parallelSort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

		//merge and return
		return intervals;
	}
}
