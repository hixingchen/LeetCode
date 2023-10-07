package com.hixingchen.leetCode.中等.L1824_最少侧跳次数;

import java.util.Arrays;

/**
 * 动态规划
 */
public class Solution {
    public int minSideJumps(int[] obstacles) {
        int[] target = new int[3];
        Arrays.fill(target,1);
        target[1] = 0;
        for (int i = 1; i < obstacles.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < 3; j++) {
                if (j == obstacles[i]-1){
                    target[j] = Integer.MAX_VALUE;
                }else {
                    min = Math.min(min,target[j]);
                }
            }
            for (int j = 0; j < 3; j++) {
                if (j == obstacles[i]-1){
                    continue;
                }
                target[j] = Math.min(target[j],min+1);
            }
        }
        return Math.min(Math.min(target[0],target[1]),target[2]);
    }
}