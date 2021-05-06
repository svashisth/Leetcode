package com.leetcode.top.intw.ques.medium;

import com.leetcode.top.intw.ques.TreeNode;
import com.leetcode.top.intw.ques.TreeUtil;

/**
 * https://leetcode.com/problems/binary-tree-pruning/
 *
 */
public class BinaryTreePruning {

	public static void main(String[] args) {
		int[] arr = { 1, -1, 0, 0, 1 };
		TreeNode root = new TreeNode(arr[0]);
		TreeNode tree = TreeUtil.createTree(arr, root, 0);
		TreeUtil.inOrderTraversal(tree);
	}

	public TreeNode pruneTree(TreeNode root) {
		if (root == null)
		{
			return null;
		}
		root.left = pruneTree(root.left);
		root.right = pruneTree(root.right);

		if (root.val == 0 && root.left == null && root.right == null)
		{
			root = null;
		}
		return root;
	}

}
