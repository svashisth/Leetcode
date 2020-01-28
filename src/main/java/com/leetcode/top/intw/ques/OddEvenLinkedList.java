package com.leetcode.top.intw.ques;

/**
 * https://leetcode.com/problems/odd-even-linked-list/
 *
 */
public class OddEvenLinkedList {

	public static void main(String[] args) {
		ListNode lst = createList(new int[] {10,20,30,40,50});
		OddEvenLinkedList main = new OddEvenLinkedList();
		ListNode oddEvenList = main.oddEvenList(lst);
		System.out.println("main\t" + oddEvenList);
		
		ListNode lst1 = createList(new int[] {10,20,30,40,50,60});
		ListNode oddEvenList1 = main.oddEvenList(lst1);
		System.out.println("main\t" + oddEvenList1);
		
		ListNode lst2 = createList(new int[] {2,1,3,5,6,4,7});
		ListNode oddEvenList2 = main.oddEvenList(lst2);
		System.out.println("main\t" + oddEvenList2);
		
		ListNode lst3 = createList(new int[] {1,2,3,4,5});
		ListNode oddEvenList3 = main.oddEvenList(lst3);
		System.out.println("main\t" + oddEvenList3);
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
	
	public ListNode oddEvenList(ListNode head) 
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		ListNode ref = head;
		
		ListNode tref = head.next, rtref = tref;
		do
		{
			head.next = head.next.next;
			if(head.next != null)
			{
				head = head.next;
			}
			tref.next = head.next;
			tref = tref.next;
		}while(head.next != null);
		
		if(head.next == null)
		{
			head.next = rtref;
		}
		
		return ref;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
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