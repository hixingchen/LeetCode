package com.hixingchen.leetCode.简单.L101_对称二叉树;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return compareNode(root.right,root.left);
    }

    private Boolean compareNode(TreeNode right,TreeNode left){
        if (right == null && left == null){
            return true;
        }
        if (right != null && left != null){
            return right.val == left.val && compareNode(right.right,left.left) && compareNode(right.left,left.right);
        }
        return false;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
