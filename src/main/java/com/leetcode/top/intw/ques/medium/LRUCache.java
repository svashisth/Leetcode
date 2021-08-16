package com.leetcode.top.intw.ques.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LRUCache {

	public static void main(String[] args) {
		LRUCache lRUCache = new LRUCache(2);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		int i = lRUCache.get(1);    // return 1
		System.out.println(i);
		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		i = lRUCache.get(2);    // returns -1 (not found)
		System.out.println(i);
		lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		i = lRUCache.get(1);    // return -1 (not found)
		System.out.println(i);
		i = lRUCache.get(3);    // return 3
		System.out.println(i);
		i = lRUCache.get(4);    // return 4
		System.out.println(i);

		System.out.println("-----------------");
		lRUCache = new LRUCache(2);
		lRUCache.put(2, 1); // cache is {1=1}
		lRUCache.put(1, 1); // cache is {1=1, 2=2}
		lRUCache.put(2, 3);
		lRUCache.put(4, 1);
		i = lRUCache.get(1);    // return 1
		System.out.println(i);
		i = lRUCache.get(2);    // returns -1 (not found)
		System.out.println(i);

	}

	private Queue<Node> q;
	private Map<Integer, Node> map;
	private int cap = 0;
	public LRUCache(int capacity)
	{
		q = new LinkedList<Node>();
		cap = capacity;
		map = new HashMap<Integer, Node>(capacity);
	}

	public int get(int key) {
		Node node = map.get(key);
		int val = -1;
		if(node != null)
		{
			q.remove(node);
			q.add(node);
			val = node.getValue();
		}
		return val;
	}

	public void put(int key, int value) {
		Node node = new Node(key, value);
		if(!map.containsKey(key) && q.size() >= cap)
		{
			Node poll = q.poll();
			map.remove(poll.key, poll);
		}
		if(!q.isEmpty())
		{
			if(map.containsKey(key))
			{
				q.remove(map.get(key));
			}
			else
			{
				q.remove(node);
			}
		}
		map.put(key, node);
		q.add(node);
	}

	class Node {
		int key;
		int value;

		public Node(int key, int value) {
			super();
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public int getValue() {
			return value;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + key;
			result = prime * result + value;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (key != other.key)
				return false;
			if (value != other.value)
				return false;
			return true;
		}

		private LRUCache getEnclosingInstance() {
			return LRUCache.this;
		}

		@Override
		public String toString() {
			return "Node [key=" + key + ", value=" + value + "]";
		}
	}
}
