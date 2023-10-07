package com.hixingchen.leetCode.简单.L1089_复写零;

/**
 * 双指针，此题思路很重要
 */
public class Solution {
    public void duplicateZeros(int[] arr) {
        int top = 0;
        int len = arr.length;
        int i = -1;
        int j = len - 1;
        while (top < len){
            i++;
            if (arr[i] != 0){
                top++;
            }else {
                top+=2;
            }
        }
        if (top == len+1){
            arr[j] = arr[i];
            j--;
            i--;
        }
        while (j >= 0){
            arr[j] = arr[i];
            j--;
            if (arr[i] == 0){
                arr[j] = arr[i];
                j--;
            }
            i--;
        }
    }
}