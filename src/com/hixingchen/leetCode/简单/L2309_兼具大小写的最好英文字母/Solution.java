package com.hixingchen.leetCode.简单.L2309_兼具大小写的最好英文字母;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String greatestLetter(String s) {
        Set<Character> target = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            target.add(s.charAt(i));
        }
        for (int i = 25; i >= 0; i--) {
            if (target.contains((char)('a'+i))&&target.contains((char)('A'+i))){
                return String.valueOf((char)('A'+i));
            }
        }
        return "";
    }
}