package com.hixingchen.leetCode.简单.L2506_统计相似字符串对的数目;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int similarPairs(String[] words) {
        int result = 0;
        Map<Integer,Integer> target = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int mark = 0;
            for (int j = 0; j < words[i].length(); j++) {
                mark |= 1<<(words[i].charAt(j) - 'a');
            }
            result += target.getOrDefault(mark,0);
            target.put(mark,target.getOrDefault(mark,0)+1);
        }
        return result;
    }
}