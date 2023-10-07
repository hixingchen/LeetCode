package com.hixingchen.leetCode.中等.L1053_交换一次的先前排列;

public class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        int min = arr[n-1];
        for (int i = n-1; i >= 0; i--) {
            if (arr[i]>min){
                int j = n-1;
                while (arr[j]>=arr[i] || arr[j] == arr[j-1]){
                    j--;
                }
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                break;
            }
            min = arr[i];
        }
        return arr;
    }
}