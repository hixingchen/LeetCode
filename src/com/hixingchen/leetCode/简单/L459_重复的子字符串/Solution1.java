package com.hixingchen.leetCode.简单.L459_重复的子字符串;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
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