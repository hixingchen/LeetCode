package com.hixingchen.leetCode.简单题测试;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public boolean isSubstringPresent(String s) {
        boolean[][] target = new boolean[26][26];
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            int x = chars[i-1]-'a';
            int y = chars[i]-'a';
            target[x][y] = true;
            if (target[y][x]){
                return true;
            }
        }
        return false;
    }
}