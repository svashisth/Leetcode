package com.leetcode.top.intw.ques.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 *
 */
public class CopyListwithRandomPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Node copyRandomList(Node head) {
		if (head == null) {
			return null;
		}

		Map<Node, Node> map = new HashMap<Node, Node>();

		// loop 1. copy all the nodes
		Node node = head;
		while (node != null) {
			map.put(node, new Node(node.val));
			node = node.next;
		}

		// loop 2. assign next and random pointers
		node = head;
		while (node != null) {
			map.get(node).next = map.get(node.next);
			map.get(node).random = map.get(node.random);
			node = node.next;
		}

		return map.get(head);
	}

}

class Node {
	int val;
	Node next;
	Node random;

	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}