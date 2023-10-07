package com.hixingchen.leetCode.简单.L1812_判断国际象棋棋盘中一个格子的颜色;

public class Solution {
    public boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0)+coordinates.charAt(1))%2 != 0;
    }
}