package com.hixingchen.leetCode.中等.L1806_还原排列的最少操作步数;

/**
 * 取巧做法，只判断了一个值，并不能证明一个值回归其他值必回归
 */
public class Solution {
    public int reinitializePermutation(int n) {
        int result = 0;
        int target = n-2;
        while (true){
            if (target%2 == 0){
                target = target/2;
            }else {
                target = n/2+(target-1)/2;
            }
            result++;
            if (target == n-2){
                return result;
            }
        }
    }
}