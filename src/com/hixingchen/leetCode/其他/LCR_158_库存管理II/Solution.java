package com.hixingchen.leetCode.其他.LCR_158_库存管理II;

public class Solution {
    public int inventoryManagement(int[] stock) {
        int score = 0;
        int res = 0;
        for (int i = 0; i < stock.length; i++) {
            if (score == 0){
                res = stock[i];
            }
            score += stock[i] == res?1:-1;
        }
        return res;
    }
}