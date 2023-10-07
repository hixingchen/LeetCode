package com.hixingchen.leetCode.中等.L1663_具有给定数值的最小字符串;

public class Solution {
    public String getSmallestString(int n, int k) {
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            result[i] = 'a';
        }
        int temp = (k-n)/25;
        int temp2 = (k-n)%25;
        for (int i = 0; i < temp; i++) {
            result[n-i-1] = 'z';
        }
        if (temp2 != 0){
            result[n-temp-1] = (char) (temp2 + result[n-temp-1]);
        }
        return new String(result);
    }
}