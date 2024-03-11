package com.hixingchen.leetCode.简单.L530_二叉搜索树的最小绝对差;

public class Solution {
    int res = Integer.MAX_VALUE;
    int pre = -1;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return res;
    }
    public void dfs(TreeNode root) {
        if (root == null){
            return;
        }
        dfs(root.left);
        if(pre != -1){
            res = Math.min(res,root.val-pre);
        }
        pre = root.val;
        dfs(root.right);
    }
}