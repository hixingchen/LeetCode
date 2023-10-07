package com.hixingchen.leetCode.简单.L2283_判断一个数的数字计数是否等于数位的值;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean digitCount(String num) {
        Map<Integer,Integer> target = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            target.put(num.charAt(i)-'0',target.getOrDefault(num.charAt(i)-'0',0)+1);
        }
        for (int i = 0; i < num.length(); i++) {
            if (target.getOrDefault(i,0) != num.charAt(i)-'0'){
                return false;
            }
        }
        return true;
    }
}