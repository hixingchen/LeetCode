package com.hixingchen.leetCode.其他.LCP_28_采购方案;

import java.util.Arrays;

public class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i<nums1.length && j<nums2.length){
            if (nums1[i]<nums2[j]){
                i++;
            }else if (nums1[i]>nums2[j]){
                j++;
            }else {
                return nums1[i];
            }
        }
        return Math.min(nums1[0]*10+nums2[0],nums2[0]*10+nums1[0]);
    }
}