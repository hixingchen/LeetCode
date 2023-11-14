package com.hixingchen.leetCode.简单题测试;

import java.util.*;

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