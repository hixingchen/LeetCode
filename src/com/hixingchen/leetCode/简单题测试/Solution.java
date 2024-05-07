package com.hixingchen.leetCode.简单题测试;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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