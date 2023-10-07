package com.hixingchen.leetCode.其他.部分排序;

public class Solution {
    public int[] subSort(int[] array) {
        if (array == null || array.length == 0){
            return new int[]{-1,-1};
        }
        int left = -1,right = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (array[i] < max){
                right = i;
            }else {
                max = array[i];
            }
            if (array[len - 1 - i] > min){
                left = len - 1 - i;
            }else {
                min = array[len - 1 - i];
            }
        }
        return new int[]{left,right};
    }
}