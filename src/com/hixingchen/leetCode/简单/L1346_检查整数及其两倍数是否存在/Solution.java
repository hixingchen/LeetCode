package com.hixingchen.leetCode.简单.L1346_检查整数及其两倍数是否存在;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> target = new HashSet<>();
        for (int i : arr) {
            if (target.contains(i*2) || (i%2 == 0 && target.contains(i/2))){
                return true;
            }
            target.add(i);
        }
        return false;
    }
}