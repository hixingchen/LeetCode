package com.hixingchen.leetCode.简单.L2215_找出两数组的不同;

import java.util.*;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        List<Integer> sameList = new ArrayList<>();
        for (Integer integer : set1) {
            if (set2.contains(integer)){
                sameList.add(integer);
            }
        }
        for (int i = 0; i < sameList.size(); i++) {
            set1.remove(sameList.get(i));
            set2.remove(sameList.get(i));
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            result.add(new ArrayList<>());
        }
        for (Integer integer : set1) {
            result.get(0).add(integer);
        }
        for (Integer integer : set2) {
            result.get(1).add(integer);
        }
        return result;
    }
}