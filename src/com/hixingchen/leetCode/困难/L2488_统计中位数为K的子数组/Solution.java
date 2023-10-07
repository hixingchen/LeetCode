package com.hixingchen.leetCode.困难.L2488_统计中位数为K的子数组;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int countSubarrays(int[] nums, int k) {
        int index = 0;
        List<Integer> leftList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k){
                index = i;
                break;
            }
        }
        Map<Integer,Integer> leftMap = new HashMap<>();
        leftMap.put(0,1);
        int temp = 0;
        for (int i = index-1; i >= 0; i--) {
            if (nums[i]>k){
                temp++;
            }else {
                temp--;
            }
            leftMap.put(temp,leftMap.getOrDefault(temp,0)+1);
        }
        int result = 0;
        int right = 0;
        for (int i = index; i < nums.length; i++) {
            if (nums[i]>k){
                right++;
            }
            if (nums[i]<k){
                right--;
            }
            result+=leftMap.getOrDefault(-right,0)+leftMap.getOrDefault(1-right,0);
        }
        return result;
    }
}