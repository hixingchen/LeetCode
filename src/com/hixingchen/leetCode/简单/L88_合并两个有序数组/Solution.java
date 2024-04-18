package com.hixingchen.leetCode.简单.L88_合并两个有序数组;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m+n-1;
        m--;
        n--;
        int cur;
        while (n>=0 || m>=0){
            if (m == -1){
                cur = nums2[n--];
            }else if (n == -1){
                cur = nums1[m--];
            }else if (nums1[m]>nums2[n]){
                cur = nums1[m--];
            }else {
                cur = nums2[n--];
            }
            nums1[len--] = cur;
        }
    }
}