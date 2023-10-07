package com.hixingchen.leetCode.简单.L1688_比赛中的配对次数;

public class Solution {
    public int numberOfMatches(int n) {
        int result = 0;
        while (true){
            if (n == 1){
                return result;
            }
            if ((n & 1) != 0){
                n = (n-1)/2 + 1;
                result += (n-1);
            }else {
                n = n/2;
                result +=n;
            }
        }
    }
}