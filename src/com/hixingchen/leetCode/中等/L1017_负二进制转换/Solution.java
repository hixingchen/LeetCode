package com.hixingchen.leetCode.中等.L1017_负二进制转换;

public class Solution {
    int[] values = new int[32];
    int[] max = new int[32];
    int[] min = new int[32];
    public String baseNeg2(int n) {
        if (n == 0 || n == 1){
            return n+"";
        }
        values[0] = 1;
        for (int i = 1; i < values.length; i++) {
            values[i] = -1 * values[i-1]<<1;
        }
        countBit();
        int length = 0;
        for (int i = 0; i < values.length; i++) {
            if (n<=max[i] && n>=min[i]){
                length = i+1;
                break;
            }
        }
        String result = "";
        for (int i = length - 1; i >= 0; i--) {
            if (n>=min[i] && n<=max[i] && n != 0){
                result += "1";
                n -= values[i];
            }else {
                result += "0";
            }
        }
        return result;
    }
    private void countBit(){
        max[0] = 1;
        min[0] = 0;
        for (int i = 1; i < values.length; i++) {
            max[i] = min[i] = values[i];
            for (int j = i-1; j >= 0; j--) {
                if ((j&1) == 1){
                    min[i] += values[j];
                }else {
                    max[i] += values[j];
                }
            }
        }
    }
}