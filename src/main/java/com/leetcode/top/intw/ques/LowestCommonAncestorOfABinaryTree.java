package com.leetcode.top.intw.ques;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 *
 */
public class LowestCommonAncestorOfABinaryTree {

	public static void main(String[] args) {
		LowestCommonAncestorOfABinaryTree main = new LowestCommonAncestorOfABinaryTree();
		TreeNode root = createTreeNode(new int[] {3,5,1,6,2,0,8,-1,-2,7,4});
		print(root);
		TreeNode p = new TreeNode(5);
		TreeNode q = new TreeNode(1);
		TreeNode lowestCommonAncestor = main.lowestCommonAncestor(root, p, q);
		System.out.println("\nmain\t" + lowestCommonAncestor);
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null)
		{
			return null;
		}
		if(root==p || root==q)
		{
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left,p,q);
		TreeNode right = lowestCommonAncestor(root.right,p,q);
		
		if(left == null) return right;
		if(right == null) return left;
		
		return root;
	}

	class Pair
	{
		int l1,l2;
	}
	
	private void getLocation(TreeNode root, TreeNode p, TreeNode q, int loc, Pair pair) {
		if(root == null)
		{
			return;
		}
		getLocation(root.left, p, q, 2*loc, pair);
		if(root.val == p.val)
		{
			pair.l1 = loc;
		}
		if(root.val == q.val)
		{
			pair.l2 = loc;
		}
		getLocation(root.right, p, q, 2*loc+1, pair);
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
		TreeNode root = p;
		for (int i = 1; i < is.length; i++) {
			TreeNode temp = new TreeNode(is[i]);
			if (i%2==0) {
				p.left = temp;
				p = p.left;
			} else {
				p.right = temp;
				p = p.right;
			}
		}
		return root;
	}
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

		@Override
		public String toString() {
			return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]";
		}
	}
}
