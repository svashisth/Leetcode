package com.leetcode.top.intw.ques.easy;

import com.leetcode.top.intw.common.ListNode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * 
 * @author sunil
 *
 */
public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {
		ListNode node = ListNode.createList(new int[] {1,1,2});
		System.out.println(node);
		ListNode node2 = deleteDuplicates(node);
		System.out.println(node);
		
		node = ListNode.createList(new int[] {1,2,2});
		System.out.println(node);
		node2 = deleteDuplicates(node);
		System.out.println(node);
		
		node = ListNode.createList(new int[] {1,1,2,3,5,6,6});
		System.out.println(node);
		node2 = deleteDuplicates(node);
		System.out.println(node);
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode ref = head;
		if(head == null || head.next == null)
		{
			return head;
		}
		
		int val = ref.val;
		ListNode prev = ref;
		while(ref != null)
		{
			ref = ref.next;
			if(ref == null)
			{
				break;
			}
			if(ref.val == val)
			{
				prev.next = ref.next;
			}
			else
			{
				prev = ref;
				val = ref.val;
			}
		}
		
		return head;
	}
}
