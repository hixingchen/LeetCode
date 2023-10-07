package com.hixingchen.leetCode.简单.L2423_删除字符使频率相同;

import java.util.*;

public class Solution {
    public boolean equalFrequency(String word) {
        Map<Character,Integer> target = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            target.put(word.charAt(i),target.getOrDefault(word.charAt(i),0)+1);
        }
        if (target.size() == 1){
            return true;
        }else if (target.size() == 2){
            Object[] temp = target.values().toArray();
            if ((Integer) temp[0] == 1 || (Integer)temp[1] == 1){
                return true;
            }
            if (Math.abs((Integer)temp[0]-(Integer)temp[1]) == 1){
                return true;
            }
            return false;
        }else {
            Object[] temp = target.values().toArray();
            int sum = 0;
            int max = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < temp.length; i++) {
                max = Math.max(max,(Integer) temp[i]);
                min = Math.min(min,(Integer)temp[i]);
                sum += (Integer)temp[i];
            }
            if (max == 1){
                return true;
            }
            if (min == 1){
                if (sum-1 == max*(temp.length-1)){
                    return true;
                }
            }
            return ((sum-1) == (max - 1) * temp.length)&&(min == max-1);
        }
    }
}