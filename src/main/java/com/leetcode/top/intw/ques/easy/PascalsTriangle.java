/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/99/others/601/
 */
package com.leetcode.top.intw.ques.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class PascalsTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PascalsTriangle main = new PascalsTriangle();
		List<List<Integer>> generate = main.generate(5);
		System.out.println("main\t" + generate);
	}

	public List<List<Integer>> generate(int numRows) {
		if (numRows == 0) {
			return Collections.emptyList();
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(1);
		result.add(list1);
		if (numRows == 1) {
			return result;
		}
		result.add(list2);
		if (numRows == 2) {
			return result;
		}

		for (int i = 1; i < numRows - 1; i++) {
			result.add(getListFor(i, result));
		}
		System.out.println("generate\t" + list2);

		return result;
	}

	/**
	 * @param i
	 * @param result
	 * @return
	 */
	private List<Integer> getListFor(int num, List<List<Integer>> result) {
		List<Integer> prevList = result.get(result.size() - 1);
		List<Integer> newList = new ArrayList<>();
		newList.add(1);
		for (int i = 0; i < num; i++) {
			newList.add(prevList.get(i) + prevList.get(i + 1));
		}
		newList.add(1);
		System.out.println("getListFor\t" + newList);
		return newList;
	}

}
