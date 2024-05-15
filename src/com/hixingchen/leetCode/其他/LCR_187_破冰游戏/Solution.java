package com.hixingchen.leetCode.其他.LCR_187_破冰游戏;

/**
 * 约瑟夫问题递归
 */
public class Solution {
    public int iceBreakingGame(int num, int target) {
        return f(num, target);
    }

    public int f(int num, int target) {
        if (num == 1) {
            return 0;
        }
        int x = f(num - 1, target);
        return (target + x) % num;
    }
}