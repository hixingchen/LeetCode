package com.hixingchen.leetCode.简单.L590_N叉树的后序遍历;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        calc(root,res);
        return res;
    }
    public void calc(Node node,List<Integer> result) {
        if (node == null){
            return;
        }
        for (int i = 0; i < node.children.size(); i++) {
            calc(node.children.get(i),result);

        }
        result.add(node.val);
    }
}