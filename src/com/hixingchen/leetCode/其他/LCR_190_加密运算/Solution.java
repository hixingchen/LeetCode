package com.hixingchen.leetCode.其他.LCR_190_加密运算;

public class Solution {
    public int encryptionCalculate(int dataA, int dataB) {
        while(dataB != 0) { // 当进位为 0 时跳出
            int c = (dataA & dataB) << 1;  // c = 进位
            dataA ^= dataB; // dataA = 非进位和
            dataB = c; // dataB = 进位
        }
        return dataA;
    }
}