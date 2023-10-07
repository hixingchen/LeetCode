package com.hixingchen.leetCode.中等.L508_出现次数最多的子树元素和;

import java.util.*;

public class Solution {
    Map<Integer,Integer> target = new HashMap<>();
    int max = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
        paramSum(root);
        List<Integer> result = new ArrayList<>();

        target.forEach((k,v)->{
            if (v>max){
                max = v;
                result.clear();
                result.add(k);
            } else if (v == max) {
                result.add(k);
            }
        });
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
    public int paramSum(TreeNode root){
        if (root == null){
            return 0;
        }
        int val = root.val + paramSum(root.left) + paramSum(root.right);
        target.put(val,target.getOrDefault(val,0)+1);
        return val;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}