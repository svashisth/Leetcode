package com.leetcode.top.intw.ques.medium;

import com.leetcode.top.intw.ques.TreeNode;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 *
 */

public class ValidateBinarySearchTree {

	public static void main(String[] args) {

	}

	public boolean isValidBST(TreeNode root) {
        return isBST(root, null, null);
    }
    
    private boolean isBST(TreeNode root, Integer min, Integer max) {
        if (root == null)
            return true;
        if (min != null && root.val <= min) {
            return false;
        }
        if (max != null && root.val >= max) {
            return false;
        }
        
        return isBST(root.left, min,root.val) && isBST(root.right, root.val, max);
    }
}
