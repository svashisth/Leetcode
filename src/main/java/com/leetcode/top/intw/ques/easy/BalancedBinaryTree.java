package com.leetcode.top.intw.ques.easy;

import com.leetcode.top.intw.ques.TreeNode;

import sun.reflect.generics.tree.Tree;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 * 
 * @author sunil
 *
 */
public class BalancedBinaryTree {


	public static void main(String[] args) {

	}

	private static final boolean RESULT = true;
	public boolean isBalanced(TreeNode root) {
		isBalancedTree(root, RESULT);
		return RESULT;
	}
	
	public int isBalancedTree(TreeNode root, boolean result)
	{
		if(root == null) return 0;
		int left = isBalancedTree(root.left, result) + 1;
		int right = isBalancedTree(root.right, result) + 1;
		System.out.println(left + " : " + right);
		if(Math.abs(left-right) > 1)
			result = false;
		return Math.max(left, right);
	}
}
