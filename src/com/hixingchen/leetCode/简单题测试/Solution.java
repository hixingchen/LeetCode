package com.hixingchen.leetCode.简单题测试;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        Arrays.sort(coordinates,(a,b)->a[0]-b[0]);
        int xSub = coordinates[1][0] - coordinates[0][0];
        int ySub = coordinates[1][1] - coordinates[0][1];
        for (int i = 2; i < coordinates.length; i++) {
            if ((coordinates[i][0]-coordinates[i-1][0])*ySub != xSub*(coordinates[i][1]-coordinates[i-1][1])){
                return false;
            }
        }
        return true;
    }
}