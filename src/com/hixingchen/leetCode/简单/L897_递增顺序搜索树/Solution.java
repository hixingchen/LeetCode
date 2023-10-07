package com.hixingchen.leetCode.简单.L897_递增顺序搜索树;

public class Solution {
    public TreeNode temp = new TreeNode();
    public TreeNode increasingBST(TreeNode root) {
        TreeNode result = temp;
        dfs(root);
        return result.right;
    }
    public void dfs(TreeNode root){
        if (root == null){
            return;
        }
        dfs(root.left);
        temp.right = new TreeNode(root.val);
        temp = temp.right;
        dfs(root.right);
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