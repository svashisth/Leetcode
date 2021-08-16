/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

import com.leetcode.top.intw.ques.TreeNode;

/**
 * @author AD79272
 *
 */
public class MaximumDepthofBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaximumDepthofBinaryTree main = new MaximumDepthofBinaryTree();
		TreeNode p = createTreeNode(new int[] { 1, 2, 1, 4, 5, 6 });
		
		int max = main.maxDepth(p);
		System.out.println("main\t" + max);

		TreeNode q = createTreeNode(new int[] { 11, 2, 7, 9, 3, 5 });
		max = main.maxDepth(q);
		System.out.println("main\t" + max);
		
		q = createTreeNode(new int[] { 1, 2, 1, 1 });
		max = main.maxDepth(q);
		System.out.println("main\t" + max);
		
		q = createTreeNode(new int[] { 1 ,2 });
		max = main.maxDepth(q);
		System.out.println("main\t" + max);
	}

	private static void print(TreeNode p) {
		if (p == null) {
			return;
		}
		print(p.left);
		System.out.print(" " + p.val);
		print(p.right);
	}

	private static TreeNode createTreeNode(int[] is) {
		TreeNode p = new TreeNode(is[0]);
		TreeNode q = p;
		boolean result = false;
		for (int i = 1; i < is.length; i++) {
			TreeNode temp = new TreeNode(is[i]);
			if (result) {
				p.right = temp;
				result = false;
				p = p.right;
			} else {
				p.left = temp;
				result = true;
				p = p.left;
			}
		}
		return q;
	}

	public int maxDepth(TreeNode root) {
		return findMaxDepth(root);
	}

	/**
	 * @param root
	 * @param i
	 * @param j
	 * @return
	 */
	private int findMaxDepth(TreeNode root) {
		if(root == null)
		{
			return 0;
		}
		int left = findMaxDepth(root.left) + 1;
		int right = findMaxDepth(root.right) + 1;
		return left > right ? left: right;
	}
}
