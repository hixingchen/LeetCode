package com.hixingchen.leetCode.中等.L791_自定义字符串排序;

import java.util.*;

public class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> rule = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            rule.put(order.charAt(i),i);
        }
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i));
        }
        Collections.sort(result, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return (rule.get(o1)==null?0:rule.get(o1)) - (rule.get(o2) == null?0:rule.get(o2));
            }
        });
        String resultString = "";
        for (int i = 0; i < result.size(); i++) {
            resultString+=result.get(i);
        }
        return resultString;
    }
}
