package com.leetcode.top.intw.ques.medium;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		StringBuilder br = new StringBuilder(""+this.val);
		ListNode tmpNext = this.next;
		while(next != null)
		{
			br.append("-> [val=" + next.val + "]");
			next = next.next;
		}
		this.next = tmpNext;
		return br.toString();
	}
	
}
