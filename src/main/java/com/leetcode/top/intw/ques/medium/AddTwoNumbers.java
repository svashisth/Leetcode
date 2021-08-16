/**
 
 */
package com.leetcode.top.intw.ques.medium;

/**
 * https://leetcode.com/problems/add-two-numbers/
 *
 * @author sunil
 *
 */
public class AddTwoNumbers {

	/**
	 @param args
	 */
	public static void main(String[] args) {

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null, ref = null;
        int sum;
        while(l1 != null || l2!=null)
        {
            ListNode node = new ListNode();
            sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            node.val = sum % 10;
            carry = sum / 10;
            if(head == null)
            {
                ref = head = node;
            }
            else
            {
                head.next = node;
                head = head.next;
            }
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(carry > 0)
        {
            ListNode node = new ListNode(carry);
            head.next = node;
        }
        
        return ref;
    }
	
	class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
}


