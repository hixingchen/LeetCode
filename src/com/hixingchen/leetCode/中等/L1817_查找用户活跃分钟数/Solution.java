package com.hixingchen.leetCode.中等.L1817_查找用户活跃分钟数;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer,Set<Integer>> target = new HashMap<>();
        int[] result = new int[k];
        for (int i = 0; i < logs.length; i++) {
            if (target.containsKey(logs[i][0])){
                target.get(logs[i][0]).add(logs[i][1]);
            }else {
                Set<Integer> temp = new HashSet<>();
                temp.add(logs[i][1]);
                target.put(logs[i][0],temp);
            }
        }
        for (Integer key:target.keySet()) {
            if (target.get(key).size()<=k){
                result[target.get(key).size()-1]++;
            }
        }
        return result;
    }
}
