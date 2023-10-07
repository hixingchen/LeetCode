package com.hixingchen.leetCode.中等.L1653_使字符串平衡的最少删除次数;

/**
 * 动态规划
 */
public class Solution1 {
    public int minimumDeletions(String s) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a'){
                a++;
            }else {
                b = Math.max(a,b)+1;
            }
        }
        return s.length()-Math.max(a,b);
    }
}