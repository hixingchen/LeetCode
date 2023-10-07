package com.hixingchen.leetCode.简单.L2325_解密消息;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String decodeMessage(String key, String message) {
        int index = 0;
        Map<Character,Character> keys = new HashMap<>();
        keys.put(' ',' ');
        for (int i = 0; i < key.length(); i++) {
            if (!keys.containsKey(key.charAt(i))){
                keys.put(key.charAt(i),(char)('a'+index));
                index++;
            }
        }
        StringBuilder target = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            target.append(keys.get(message.charAt(i)));
        }
        return target.toString();
    }
}