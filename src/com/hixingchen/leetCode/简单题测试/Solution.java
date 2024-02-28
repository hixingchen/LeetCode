package com.hixingchen.leetCode.简单题测试;

import java.util.*;

public class Solution {
    public boolean isBoomerang(int[][] points) {
        Arrays.sort(points,(a,b)->a[0]-b[0]);
        return !(points[2][0]-points[1][0] == points[1][0]-points[0][0] && points[2][1]-points[1][1] == points[1][1]-points[0][1]) && (points[0][0] != points[1][0]&& points[0][0]!=points[2][0]);
    }
}