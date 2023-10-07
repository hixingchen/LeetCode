package com.hixingchen.leetCode.中等.L1145_二叉树着色游戏;

public class Solution {
    private int lsz,rsz;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        count(root,x);
        return Math.max(Math.max(lsz,rsz),n-1-rsz-lsz)*2>n;
    }
    private Integer count(TreeNode node,Integer x){
        if (node == null){
            return 0;
        }
        int ls = count(node.left,x);
        int rs = count(node.right,x);
        if (x == node.val){
            lsz = ls;
            rsz = rs;
        }
        return ls+rs+1;
    }
}