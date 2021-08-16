package com.leetcode.top.intw.ques.easy;

import com.leetcode.top.intw.common.ListNode;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		int[] ar1 = {1,2,4};
		ListNode l1 = ListNode.createList(ar1);
		System.out.println(l1);
		
		int[] ar2 = {1,3,4};
		ListNode l2 = ListNode.createList(ar2);
		System.out.println(l2);
		
		ListNode node = mergeTwoLists(l1, l2);
		System.out.println(node);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null)
		{
			return null;
		}
		
		if(l1 == null)
		{
			return l2;
		}
		if(l2 == null)
		{
			return l1;
		}
		
		ListNode l = new ListNode();
		ListNode head = l;
		while (l1 != null || l2 != null)
		{
			if(l1 == null)
			{
				if(l2 != null)
				{
					l.next = l2;
					break;
				}
				else
				{
					break;
				}
			}
			else if(l2 ==null)
			{
				if(l1 != null)
				{
					l.next = l1;
					break;
				}
			}
			else
			{
				ListNode lN = new ListNode();
				l.next = lN;
				if(l1.val <= l2.val)
				{
					lN.val = l1.val;
					l1 = l1.next;
				}
				else
				{
					lN.val = l2.val;
					l2 = l2.next;
				}
				l = l.next;
			}
		}
		if(head.val == 0)
		{
			head = head.next;
		}
		return head;
	}
	
}
