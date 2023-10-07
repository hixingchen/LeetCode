package com.hixingchen.leetCode.简单.L2287_重排字符形成目标字符串;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character,Integer> targetMap = new HashMap<>();
        Map<Character,Integer> sMap = new HashMap<>();
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < target.length(); i++) {
            targetMap.put(target.charAt(i),targetMap.getOrDefault(target.charAt(i),0)+1);
        }
        for (Character key:targetMap.keySet()) {
            result = (int)Math.min(result,sMap.getOrDefault(key,0)/targetMap.get(key));
        }
        return result;
    }
}