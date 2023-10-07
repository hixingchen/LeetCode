package com.hixingchen.leetCode.中等.L795_区间子数组个数;

import java.util.ArrayList;
import java.util.List;

/**
 * 自己写的动态规划，效率很低，规律没找好
 */
public class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(new Integer[]{0,0,0});
        }
        if (nums[0]>=left && nums[0] <= right){
            result.get(0)[0] = 1;
            result.get(0)[1] = 1;//连续大于left小于right的个数
            result.get(0)[2] = 1;
        }else if(nums[0]<left){
          result.get(0)[2] = 1;//连续小于right的个数
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>=left && nums[i] <= right){
                result.get(i)[0] = result.get(i-1)[0] +result.get(i-1)[2]+1;
                result.get(i)[1] =result.get(i)[2]= result.get(i-1)[2]+1;
            }else if(nums[i]<left){
                result.get(i)[0] = result.get(i-1)[0]+result.get(i-1)[1];
                result.get(i)[1] = result.get(i-1)[1];
                result.get(i)[2] = result.get(i-1)[2]+1;
            } else{
                result.get(i)[0] = result.get(i-1)[0];
            }
        }
        return result.get(result.size()-1)[0];
    }
}