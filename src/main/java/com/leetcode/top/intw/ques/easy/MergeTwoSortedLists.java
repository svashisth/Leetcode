package com.leetcode.top.intw.ques.easy;

import com.leetcode.top.intw.common.ListNode;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
				if(l1.val <= l2.val)
				{
					l.val = l1.val;
					l1 = l1.next;
				}
				else
				{
					l.val = l2.val;
					l2 = l2.next;
				}
				ListNode lN = new ListNode();
				l.next = lN;
				l = l.next;
			}
		}
		
		return l;
	}
	
}
