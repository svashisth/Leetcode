package com.leetcode.top.intw.common;

public class ListNode {
	public int val;
	public ListNode next;
	
	public ListNode() {
		super();
	}

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
	
	public static ListNode createList(int[] ar){
		ListNode lst = null, ref = null;
		for (int a : ar) {
			if(lst == null)
			{
				lst = new ListNode(a);
				ref = lst;
			}
			else
			{
				ListNode tmp = new ListNode(a);
				lst.next = tmp;
				lst = lst.next;
			}
		}
		
		return ref;
	}
}