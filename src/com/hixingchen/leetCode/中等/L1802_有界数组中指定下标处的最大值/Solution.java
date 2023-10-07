package com.hixingchen.leetCode.中等.L1802_有界数组中指定下标处的最大值;

public class Solution {
    int result = 1;
    public int maxValue(int n, int index, int maxSum) {
        int left = 1;
        int right = maxSum;
        while (left < right){
            long temp = 0;
            result = (left+right+1)/2;
            temp = calc(index+1) + calc(n-index) - result;
            if (temp>maxSum){
                right = result - 1;
            }else {
                left = result;
            }
        }
        return right;
    }
    public long calc(int target){
        if (target >= result){
            return (long)result*(result+1)/2 + target - result;
        }else {
            return (long)target*(result*2-target+1)/2;
        }
    }
}