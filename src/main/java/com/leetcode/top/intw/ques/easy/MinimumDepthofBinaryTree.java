package com.leetcode.top.intw.ques.easy;

import java.util.LinkedList;
import java.util.Queue;

import com.leetcode.top.intw.ques.TreeNode;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * 
 * @author sunil
 *
 */
public class MinimumDepthofBinaryTree {

	public static void main(String[] args) {

	}

	// DFS
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.right != null && root.left != null)
			return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
		if (root.right != null)
			return minDepth(root.right) + 1;
		else
			return minDepth(root.left) + 1;
	}

	/** Solution 2: BFS level order traversal */
	public int minDepth2(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int level = 1;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode curNode = queue.poll();
				if (curNode.left == null && curNode.right == null) {
					return level;
				}
				if (curNode.left != null) {
					queue.offer(curNode.left);
				}
				if (curNode.right != null) {
					queue.offer(curNode.right);
				}
			}
			level++;
		}
		return level;
	}
}
