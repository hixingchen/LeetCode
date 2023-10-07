package com.hixingchen.leetCode.简单.L2011_执行操作后的变量值;

public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            result = operations[i].charAt(1) == '+' ? result+1 : result-1;
        }
        return result;
    }
}