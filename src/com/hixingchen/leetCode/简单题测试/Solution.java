package com.hixingchen.leetCode.简单题测试;

import java.util.*;

public class Solution {
    public int longestPalindrome(String s) {
        Boolean flag = false;
        int res = 0;
        Map<Character,Integer> target = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            target.put(s.charAt(i),target.getOrDefault(s.charAt(i),0)+1);
        }
        for (Character character : target.keySet()) {
            if ((target.get(character)&1)==1){
                flag = true;
            }
            res += target.get(character)>>1<<1;
        }
        return flag == true?res+1:res;
    }
}