package com.leetcode.top.intw.ques.easy;

import com.leetcode.top.intw.ques.TreeNode;

/**
 * https://leetcode.com/problems/path-sum/
 * 
 * @author sunil
 *
 */
public class PathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private boolean result = false;

	public boolean hasPathSum(TreeNode root, int targetSum) {
		getPathSum(root, root, 0, targetSum);
		return result;
	}
	
	public int getPathSum(TreeNode root, TreeNode parent, int sum, int targetSum)
	{
		if(root == null)
		{
			return 0;
		}
		if(root != parent)
		{
			root.val+=parent.val;
		}
		if(root.left == null && root.right == null)
		{
			if(root.val == targetSum)
			{
				result = true;
			}
		}
		getPathSum(root.left, root, root.val, targetSum);
		getPathSum(root.right, root, root.val, targetSum);
		return sum;
	}
}
