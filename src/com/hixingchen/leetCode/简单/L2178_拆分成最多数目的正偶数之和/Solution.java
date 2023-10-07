package com.hixingchen.leetCode.简单.L2178_拆分成最多数目的正偶数之和;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> result = new ArrayList<>();
        if ((finalSum & 1) != 1){
            Long num = 2L;
            while (finalSum >= num){
                result.add(num);
                finalSum -= num;
                num +=2;
            }
            result.set(result.size()-1,result.get(result.size()-1) + finalSum);
        }
        return result;
    }
}