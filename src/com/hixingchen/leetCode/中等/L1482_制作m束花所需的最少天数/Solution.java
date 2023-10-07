package com.hixingchen.leetCode.中等.L1482_制作m束花所需的最少天数;

/**
 * 二分查找
 */
public class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m>bloomDay.length/k){
            return -1;
        }
        int maxDay = 0;
        int minDay = Integer.MAX_VALUE;
        int length = bloomDay.length;
        for (int i = 0; i < length; i++) {
            maxDay = Math.max(maxDay,bloomDay[i]);
            minDay = Math.min(minDay,bloomDay[i]);
        }
        while (minDay < maxDay){
            int days = (maxDay-minDay)/2 + minDay;
            if (canMake(bloomDay,days,m,k)){
                maxDay = days;
            }else {
                minDay = days+1;
            }
        }
        return minDay;
    }
    private boolean canMake(int[] bloomDay,int days,int m,int k){
        int nums = 0;
        int flowers = 0;
        int length = bloomDay.length;
        for (int i = 0; i < length && nums < m; i++) {
            if (bloomDay[i] <= days){
                flowers++;
                if (flowers == k){
                    nums++;
                    flowers = 0;
                }
            }else {
                flowers = 0;
            }
        }
        return nums>=m;
    }
}