package com.leetcode.top.intw.ques.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 * @author sunil
 *
 */
public class PascalsTriangleII {

	public static void main(String[] args) {
		List<Integer> row = getRow(5);
		System.out.println(row);
	}

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> ret = new LinkedList<Integer>();
	    for (int row = 0; row <= rowIndex; row++) {
	        ret.add(0, 1);
	        for (int i = 1; i < row; i++)
	            ret.set(i, ret.get(i) + ret.get(i + 1));
	    }
	    return ret;
    }
}
