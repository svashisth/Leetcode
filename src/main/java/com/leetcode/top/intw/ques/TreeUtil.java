package com.leetcode.top.intw.ques;

import java.util.HashMap;
import java.util.Map;

public class TreeUtil {

	public static void inOrderTraversal(TreeNode node) {
		if (node == null)
			return;
		inOrderTraversal(node.left);
		System.out.println(node.val + " ");
		inOrderTraversal(node.right);
	}

	public static TreeNode createTree(int[] arr, TreeNode root, int i) {
// Base case for recursion
		if (i < arr.length) {
			TreeNode temp = new TreeNode(arr[i]);
			root = temp;

// insert left child
			root.left = createTree(arr, root.left, 2 * i + 1);

// insert right child
			root.right = createTree(arr, root.right, 2 * i + 2);
		}
		return root;
	}

}
