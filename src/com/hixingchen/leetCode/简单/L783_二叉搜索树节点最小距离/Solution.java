package com.hixingchen.leetCode.简单.L783_二叉搜索树节点最小距离;

public class Solution {
    int result;
    int pre;
    public int minDiffInBST(TreeNode root) {
        result = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return result;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre != -1){
            result = Math.min(result, root.val-pre);
        }
        pre = root.val;
        dfs(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}