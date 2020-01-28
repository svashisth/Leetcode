package com.leetcode.top.intw.ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 *
 */
public class TopKFrequentElements {

	public static void main(String[] args) {
		TopKFrequentElements main = new TopKFrequentElements();

		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		List<Integer> topKFrequent = main.topKFrequent(nums, k);
		System.out.println("main\t" + topKFrequent);

		int[] nums1 = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5 };
		k = 3;
		topKFrequent = main.topKFrequent(nums1, k);
		System.out.println("main\t" + topKFrequent);

		int[] nums2 = { 1, 9, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 8, 8, 9, 9, 9, 9, 7, 7, 7, 7 };
		k = 2;
		topKFrequent = main.topKFrequent(nums2, k);
		System.out.println("main\t" + topKFrequent);
	}

	public List<Integer> topKFrequent(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return Collections.emptyList();
		}
		if (nums.length == 1 && k == 1) {
			return Arrays.asList(nums[0]);
		}

		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
		{
			pq.offer(entry);
			if (pq.size() > k)
				pq.poll();
		}

		List<Integer> res = new ArrayList<>();
		while (!pq.isEmpty()) 
		{
			res.add(pq.poll().getKey());
		}
		return res;
	}

}
