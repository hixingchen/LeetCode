package com.hixingchen.leetCode.简单.L2331_计算布尔二叉树的值;

public class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root.val<2){
            return root.val == 1;
        }else if (root.val == 2){
            return evaluateTree(root.left) || evaluateTree(root.right);
        }else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }
}