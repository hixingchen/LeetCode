package com.hixingchen.leetCode.中等.L1234_替换子串得到平衡字符串;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int balancedString(String s) {
        Map<Character,Integer> target = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            target.put(s.charAt(i),target.getOrDefault(s.charAt(i),0)+1);
        }
        int average = s.length()/4;
        int qNum = target.getOrDefault('Q',0) - average;
        int wNum = target.getOrDefault('W',0) - average;
        int eNum = target.getOrDefault('E',0) - average;
        int rNum = target.getOrDefault('R',0) - average;
        if (qNum == 0 && wNum == 0 && eNum == 0){
            return 0;
        }
        int result = s.length();
        int left = 0;
        int right = 0;
        target.put('Q',0);
        target.put('W',0);
        target.put('E',0);
        target.put('R',0);
        while (right<s.length()+1){
            if (target.get('Q')>=qNum && target.get('W')>=wNum && target.get('E')>=eNum && target.get('R')>=rNum){
                result = Math.min(result,right-left);
                target.put(s.charAt(left),target.get(s.charAt(left))-1);
                left++;
            }else {
                right++;
                if (right<s.length()+1){
                    target.put(s.charAt(right-1),target.get(s.charAt(right-1))+1);
                }
            }
        }
        return result;
    }
}