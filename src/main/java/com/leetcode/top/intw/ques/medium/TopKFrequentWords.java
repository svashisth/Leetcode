/**
 * 
 */
package com.leetcode.top.intw.ques.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/top-k-frequent-words/solution/
 *
 */
public class TopKFrequentWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TopKFrequentWords main = new TopKFrequentWords();
		
		String[] words = new String[] {"i", "love", "leetcode", "i", "love", "coding"};
		List<String> topKFrequent = main.topKFrequent(words, 2);
		System.out.println("topk freq\t" + topKFrequent);
		
		words = new String[] {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		topKFrequent = main.topKFrequent(words, 4);
		System.out.println("topk freq\t" + topKFrequent);
	}

	public List<String> topKFrequent(String[] words, int k) {
		if(words == null || words.length == 0)
		{
			return Collections.emptyList();
		}
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		for (String string : words) {
			map.put(string, map.getOrDefault(string, 0) + 1);
		} 
		
		ArrayList<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
		
		List<String> result = new ArrayList<>();
		for (Entry<String, Integer> entry : list.subList(0, k)) {
			result.add(entry.getKey());
		}
		
		return result;
	}
}
