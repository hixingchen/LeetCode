package com.hixingchen.leetCode.简单.L2363_合并相似的物品;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer,Integer> target = new HashMap<>();
        for (int i = 0; i < items1.length; i++) {
            target.put(items1[i][0],items1[i][1]);
        }
        for (int i = 0; i < items2.length; i++) {
            target.put(items2[i][0],target.getOrDefault(items2[i][0],0)+items2[i][1]);
        }
        List<List<Integer>> result = new ArrayList<>();
        target.forEach((k,v)->{
            List<Integer> temp = new ArrayList<>();
            temp.add(k);
            temp.add(v);
            result.add(temp);
        });
        result.sort((o1, o2) -> {
            return o1.get(0)-o2.get(0);
        });
        return result;
    }
}