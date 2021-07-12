package com.leetcode.top.intw.ques.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.leetcode.top.intw.ques.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 * 
 * @author sunil
 *
 */
public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {

	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		traverse(root, list);
		return list;
	}

	private void traverse(TreeNode root, List<Integer> list) {
		if(root == null) return;
		traverse(root.left, list);
		list.add(root.val);
		traverse(root.right, list);
	}
}
