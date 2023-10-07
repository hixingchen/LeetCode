package com.hixingchen.leetCode.中等.L1807_替换字符串中的括号内容;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> target = new HashMap<>();
        for (int i = 0; i < knowledge.size(); i++) {
            target.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        int leftIndex = 0;
        int rightIndex = -1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                leftIndex = i;
                result.append(s.substring(rightIndex+1,leftIndex));
            }
            if (s.charAt(i) == ')'){
                rightIndex = i;
                result.append(target.getOrDefault(s.substring(leftIndex+1,rightIndex),"?"));
            }
            if (i == s.length()-1 && s.charAt(i)!= ')'){
                result.append(s.substring(rightIndex+1));
            }
        }
        return result.toString();
    }
}