package com.hixingchen.leetCode.中等.L91_解码方法;

public class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0'){
            return 0;
        }
        int len = s.length();
        int[] result = new int[len+1];
        result[0] = 1;
        result[1] = 1;
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) == '0'){
                if (s.charAt(i-1) == '0' || s.charAt(i-1) >= '3'){
                    return 0;
                }else {
                    result[i+1] = result[i-1];
                }
            }else {
                String substring = s.substring(i - 1, i + 1);
                Integer integer = Integer.valueOf(substring);
                if (integer<10){
                    result[i+1] = result[i];
                }else if (integer>10 && integer<=26){
                    result[i+1] = result[i]+result[i-1];
                }else {
                    result[i+1] = result[i];
                }
            }
        }
        return result[len];
    }
}