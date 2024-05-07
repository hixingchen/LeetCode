package com.hixingchen.leetCode.其他.LCR_193_二叉搜索树的最近公共祖先;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = root;
        while (true){
            if (res.val>p.val && res.val>q.val){
                res = res.left;
            }else if (res.val<p.val && res.val<q.val){
                res = res.right;
            }else {
                break;
            }
        }
        return res;
    }
}