package com.hixingchen.leetCode.中等.L1653_使字符串平衡的最少删除次数;

/**
 * 指针
 */
public class Solution {
    public int minimumDeletions(String s) {
        int rightA = 0;
        int leftB = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            rightA += s.charAt(i) == 'a'?1:0;
        }
        result = rightA;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'){
                rightA--;
            }else {
                leftB++;
            }
            result = Math.min(result,rightA+leftB);
        }
        return result;
    }
}