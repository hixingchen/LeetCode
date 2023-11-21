package com.hixingchen.leetCode.简单题测试;

import java.util.*;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        int size = length/2+1;
        List<Integer> target = new ArrayList<>();
        for (int i = 1; i < size; i++) {
            if (length%i == 0){
                target.add(i);
            }
        }
        for (int i = 0; i < target.size(); i++) {
            String substring = s.substring(0, target.get(i));
            int temp = substring.length();
            for (int j = 1; j < length / target.get(i); j++) {
                if (!substring.equals(s.substring(j*temp,(j+1)*temp))){
                    break;
                }
                if (j == length/target.get(i)-1){
                    return true;
                }
            }
        }
        return false;
    }
}