package com.hixingchen.leetCode.困难.L2025_分割数组的最多方案数;

import java.util.Arrays;

public class Solution1 {
    /**
     * 自己写的比较蠢的写法，时间复杂度n的平方，数组大时运行会超时
     */
    public int num = 0;
    public int max = 0;
    public int waysToPartition(int[] nums, int k) {
        int total = Arrays.stream(nums).sum();
        int rightSum = 0;
        int sum = 0;
        if (total%2 == 0){
            rightSum = total/2;
            for (int i = 0; i < nums.length-1; i++) {
                sum += nums[i];
                if (sum == rightSum){
                    num++;
                }
            }
            if (num > max){
                max = num;
            }
        }

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((total-nums[i]+k)%2 ==0){
                rightSum = (total-nums[i]+k)/2;
                sum = 0;
                num = 0;
                temp = nums[i];
                nums[i] = k;
                for (int j = 0; j < nums.length-1; j++) {
                    sum += nums[j];
                    if (sum == rightSum){
                        num++;
                    }
                }
                if (num > max){
                    max = num;
                }
                nums[i] = temp;
            }
        }
        return max;
    }
}
