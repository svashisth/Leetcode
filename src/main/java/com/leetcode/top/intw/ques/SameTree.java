package com.leetcode.top.intw.ques;

/**
 * https://leetcode.com/problems/same-tree/
 *
 */
public class SameTree {

	public static void main(String[] args) {
		TreeNode p = createTreeNode(new int[] { 1, 2, 1 });
		TreeNode q = createTreeNode(new int[] { 1, 2, 1 });
		print(p);
		System.out.println("\t");
		print(q);
		System.out.println();
		SameTree main = new SameTree();
		boolean sameTree = main.isSameTree(p, q);
		System.out.println("main\t" + sameTree);

		q = createTreeNode(new int[] { 1, 2, 1, 1 });
		print(q);
		sameTree = main.isSameTree(p, q);
		System.out.println("main\t" + sameTree);
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

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if ((p == null && q != null) || (p != null && q == null)) {
			return false;
		}

		boolean result = isSameTree(p.left, q.left);
		if (!result) {
			return false;
		}
		result = isSameTree(p.right, q.right);
		if (!result) {
			return false;
		}
		if (p.val == q.val) {
			return true;
		}

		return false;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

}