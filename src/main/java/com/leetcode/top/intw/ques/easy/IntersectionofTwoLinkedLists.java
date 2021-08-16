package com.leetcode.top.intw.ques.easy;

import java.util.HashSet;
import java.util.Set;

import com.leetcode.top.intw.common.ListNode;

public class IntersectionofTwoLinkedLists {

	public static void main(String[] args) {

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> set = new HashSet<ListNode>();
		while(headA != null)
		{
			set.add(headA);
			headA = headA.next;
		}
		while(headB != null)
		{
			if(set.contains(headB))
			{
				return headB;
			}
			headB = headB.next;
		}
		return null;
	}
}
