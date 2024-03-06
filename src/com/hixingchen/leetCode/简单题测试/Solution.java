package com.hixingchen.leetCode.简单题测试;

import java.util.*;

public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int res = 0;
        for (int i = 1; i <= len; i++) {
            int temp = 0;
            int sum = 0;
            while (temp<len){
                sum += Math.min(len-(Math.max(1,i-temp)+temp)+1,temp+1);
                temp+=2;
            }
            res += sum*arr[i-1];
        }
        return res;
    }
}