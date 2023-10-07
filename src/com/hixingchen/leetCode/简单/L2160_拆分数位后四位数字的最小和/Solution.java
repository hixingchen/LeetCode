package com.hixingchen.leetCode.简单.L2160_拆分数位后四位数字的最小和;

import java.util.Arrays;

public class Solution {
    public int minimumSum(int num) {
        int[] target = new int[4];
        for (int i = 0; i < target.length; i++) {
            target[i] = num%10;
            num /= 10;
        }
        Arrays.sort(target);
        return 10*(target[0]+target[1])+target[2]+target[3];
    }
}