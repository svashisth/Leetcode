package com.leetcode.top.intw.ques;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 *
 */
public class DeleteNodeInALinkedList {

	public static void main(String[] args) {

	}

	public void deleteNode(ListNode node) {
        if(node == null)
        {
            return;
        }
        
        ListNode prevNode = node;
        while(node.next != null)
        {
            node.val = node.next.val;
            prevNode = node;
            node = node.next;
        }
        prevNode.next = null;        
    }
}
