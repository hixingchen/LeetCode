package com.hixingchen.leetCode.其他.LCR_006_两数之和II;

/**
 * 双指针
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while (left<right){
            int temp = numbers[left]+numbers[right];
            if (temp == target){
                return new int[]{left,right};
            }else if (temp<target){
                left++;
            }else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}