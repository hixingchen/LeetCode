package com.hixingchen.leetCode.中等.L45_跳跃游戏II;

import java.util.ArrayDeque;

/**
 * 深度优先搜索
 */
public class Solution {
    public int jump(int[] nums) {
        ArrayDeque<Integer> target = new ArrayDeque<>();
        int[] location = new int[nums.length];
        target.offer(0);
        while (target.size()>0){
            int temp = target.poll();
            for (int i = 0; i < nums[temp]; i++) {
                if (temp+i+1<nums.length && location[temp+i+1] == 0){
                    target.offer(temp+i+1);
                    location[temp+i+1] = location[temp]+1;
                }
            }
        }
        return location[nums.length-1];
    }
}