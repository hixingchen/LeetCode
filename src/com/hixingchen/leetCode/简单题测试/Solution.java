package com.hixingchen.leetCode.简单题测试;

import java.util.*;

public class Solution {
    TreeNode target;
    public boolean findTarget(TreeNode root, int k) {
        target = root;
        return find2(root,k);
    }
    private boolean find(TreeNode root,int k){
        if (root == null) return false;
        return k == root.val||find(root.left,k)||find(root.right,k);
    }
    public boolean find2(TreeNode root, int k) {
        if (root == null) return false;
        return find2(root.right,k)||find(target,k-root.val)||find2(root.left,k);
    }
}