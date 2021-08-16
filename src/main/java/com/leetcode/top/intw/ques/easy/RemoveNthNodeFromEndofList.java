/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.top.intw.common.ListNode;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/603/
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/560/
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/771/
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/772/
 * 
 */
public class RemoveNthNodeFromEndofList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoveNthNodeFromEndofList main = new RemoveNthNodeFromEndofList();
//		testNodeRemoval(main);
		
//		testListReverse(main);
		
		testIsPalindrome(main);
	}

	/**
	 * @param main
	 */
	private static void testIsPalindrome(RemoveNthNodeFromEndofList main) {
		ListNode root = createList(new int[] {1,2,3,4,5,6});
		System.out.println("Before\t" + root);
		boolean result = main.isPalindrome(root);
		System.out.println("After\t" + result);
		
		root = createList(new int[] {1,2,3,2,1});
		System.out.println("Before\t" + root);
		result = main.isPalindrome(root);
		System.out.println("After\t" + result);
		
		root = createList(new int[] {1,12,3,12,1});
		System.out.println("Before\t" + root);
		result = main.isPalindrome(root);
		System.out.println("After\t" + result);
		
		root = createList(new int[] {1,2,3,3,2,1});
		System.out.println("Before\t" + root);
		result = main.isPalindrome(root);
		System.out.println("After\t" + result);
		
		root = createList(new int[] {5});
		System.out.println("Before\t" + root);
		result = main.isPalindrome(root);
		System.out.println("After\t" + result);
		
		root = createList(new int[] {1,2});
		System.out.println("Before\t" + root);
		result = main.isPalindrome(root);
		System.out.println("After\t" + result);
		
		root = createList(new int[] {-129,-129});
		System.out.println("Before\t" + root);
		result = main.isPalindrome(root);
		System.out.println("After\t" + result);
		
		root = createList(new int[] {0,0});
		System.out.println("Before\t" + root);
		result = main.isPalindrome(root);
		System.out.println("After\t" + result);
	}

	/**
	 * @param main
	 */
	private static void testListReverse(RemoveNthNodeFromEndofList main) {
		ListNode root = createList(new int[] {1,2,13,4,5,6});
		System.out.println("Before\t" + root);
		ListNode node = main.reverseList(root);
		System.out.println("After\t" + node);
		
		root = createList(new int[] {1,2,3,8,5,6});
		System.out.println("Before\t" + root);
		node = main.reverseList(root);
		System.out.println("After\t" + node);
		
		root = createList(new int[] {1,12,3,4,5});
		System.out.println("Before\t" + root);
		node = main.reverseList(root);
		System.out.println("After\t" + node);
		
		root = createList(new int[] {11,2,3,4,5});
		System.out.println("Before\t" + root);
		node = main.reverseList(root);
		System.out.println("After\t" + node);
		
		root = createList(new int[] {5});
		System.out.println("Before\t" + root);
		node = main.reverseList(root);
		System.out.println("After\t" + node);
	}

	private static void testNodeRemoval(RemoveNthNodeFromEndofList main) {
		ListNode root = createList(new int[] {1,2,13,4,5,6});
		System.out.println("Before\t" + root);
		ListNode node = main.removeNthFromEnd(root, 4);
		System.out.println("After\t" + node);
		
		root = createList(new int[] {1,2,3,8,5,6});
		System.out.println("Before\t" + root);
		node = main.removeNthFromEnd(root, 3);
		System.out.println("After\t" + node);
		
		root = createList(new int[] {1,12,3,4,5});
		System.out.println("Before\t" + root);
		node = main.removeNthFromEnd(root, 4);
		System.out.println("After\t" + node);
		
		root = createList(new int[] {11,2,3,4,5});
		System.out.println("Before\t" + root);
		node = main.removeNthFromEnd(root, 5);
		System.out.println("After\t" + node);
	}

	/**
	 * @param is
	 * @return
	 */
	private static ListNode createList(int[] is) {
		ListNode first = new ListNode(is[0]);
		ListNode root = first; 
		for (int i = 1; i < is.length; i++) {
			int j = is[i];
			ListNode tmp = new ListNode(j);
			first.next = tmp;
			first = first.next;
		}
		
		return root;
	}

	/**
	 * 772
	 * @param head
	 * @return
	 */
	public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        {
        	return true;
        }
        List<Integer> list = new ArrayList<>();
        while(head != null)
        {
        	list.add(head.val);
        	head = head.next;
        }
        
        int indx = 0;
        int lastIndex = list.size()-1;
        do{
    		if(list.get(indx++).intValue() != list.get(lastIndex--).intValue())
    		{
    			return false;
    		}
    	}while(indx <= lastIndex);
        
        return true;
    }

	/**
	 * 771
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null)
		{
			return l2;
		}
		if(l2 == null)
		{
			return l1;
		}
		
        while(l1.next != null || l2.next != null)
        {
        	if(l1.val < l2.val)
        	{
        		
        	}
        }
        
        return null;
    }

	/**
	 * 560
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)
		{
			return head;
		}
		ListNode root = head;
		ListNode first = new ListNode(head.val);
		head = head.next;
        while(head != null)
        {
        	root = head.next;
        	head.next = first;
        	first = head;
        	head = root;
        }
        return first;
    }

	/**
	 * 603
	 * @param head
	 * @param n
	 * @return
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode root = head;
		ListNode first = head;
		while(n-- > 0) {
			head = head.next;
		}
		
		if(head == null)
		{
			root = root.next;
			return root;
		}
		
		while(head.next != null)
		{
			first = first.next;
			head = head.next;
			if(head == null)
			{
				break;
			}
		}
		
		first.next = first.next.next;
		
		return root;
	}
	
}
