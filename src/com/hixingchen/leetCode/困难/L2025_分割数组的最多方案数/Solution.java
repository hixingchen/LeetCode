package com.hixingchen.leetCode.困难.L2025_分割数组的最多方案数;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int waysToPartition(int[] nums, int k) {
        /**
         * 参考别人自己修改的方案，复杂度为n，主要用到哈希Map
         */
        long sum = 0L;
        Long rSum = 0L;
        Long lSum = 0L;
        Long average = 0L;
        int result = 0;
        Map<Long,Integer> leftMap = new HashMap<>();
        Map<Long,Integer> rightMap = new HashMap<>();
        for (int i = 0; i < nums.length-1; i++) {
            lSum += nums[i];
            leftMap.put(lSum,leftMap.getOrDefault(lSum,0)+1);
        }
        sum = lSum + nums[nums.length-1];
        result = sum%2 == 0?leftMap.getOrDefault(sum/2,0):0;
        for (int i = nums.length-1; i >= 0; i--) {
            int change = k - nums[i];
            sum += change;
            if (sum % 2 == 0){
                average = sum/2;
                int temp = leftMap.getOrDefault(average,0)+rightMap.getOrDefault(average,0);
                result = Math.max(result,temp);
            }
            sum -= change;
            if (i>0){
                leftMap.put(lSum,leftMap.getOrDefault(lSum,0)-1);
                lSum -= nums[i-1];
                rSum +=nums[i];
                rightMap.put(rSum,rightMap.getOrDefault(rSum,0)+1);
            }
        }
        return result;
    }
}
