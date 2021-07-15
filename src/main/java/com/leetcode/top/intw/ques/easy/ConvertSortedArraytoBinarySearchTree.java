package com.leetcode.top.intw.ques.easy;

import com.leetcode.top.intw.ques.TreeNode;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 *
 */
public class ConvertSortedArraytoBinarySearchTree {

	public static void main(String[] args) {

	}

	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums == null || nums.length == 0)
		{
			return null;
		}
		
		return helper(nums, 0, nums.length-1);
	}

	private TreeNode helper(int[] nums, int left, int right) {
		if(left > right) return null;
		int mid = left - (left-right)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = helper(nums, left, mid - 1);
		node.right = helper(nums, mid + 1, right);
		return node;
	}
}
