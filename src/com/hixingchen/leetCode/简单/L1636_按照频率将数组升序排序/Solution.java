package com.hixingchen.leetCode.简单.L1636_按照频率将数组升序排序;

import java.util.*;

public class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> target = new HashMap<>();
        List<Integer> numList = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            target.put(nums[i],target.getOrDefault(nums[i],0)+1);
            numList.add(nums[i]);
        }
        Collections.sort(numList,(o1, o2) -> {
            return target.get(o1) != target.get(o2)?target.get(o1)-target.get(o2):o2-o1;
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numList.get(i);
        }
        return nums;
    }
}