package com.hixingchen.leetCode.简单.L119_杨辉三角II;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            res.add((int) ((long)res.get(i-1)*(rowIndex-i+1)/i));
        }
        return res;
    }
}