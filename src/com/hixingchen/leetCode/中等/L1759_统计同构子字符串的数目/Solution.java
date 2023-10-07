package com.hixingchen.leetCode.中等.L1759_统计同构子字符串的数目;

public class Solution {
    public int countHomogenous(String s) {
        s+="!";
        int mod = 1000000007;
        char temp = s.charAt(0);
        long result = 0;
        long calc = 0;
        for (int i = 1; i < s.length(); i++) {
            calc++;
            if (temp != s.charAt(i)){
                result += calc*(calc+1)/2;
                temp = s.charAt(i);
                calc = 0;
            }
        }
        return (int)(result%mod);
    }
}