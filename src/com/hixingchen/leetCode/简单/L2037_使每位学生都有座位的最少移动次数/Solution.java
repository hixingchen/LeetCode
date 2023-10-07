package com.hixingchen.leetCode.简单.L2037_使每位学生都有座位的最少移动次数;

import java.util.Arrays;

public class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int result = 0;
        for (int i = 0; i < seats.length; i++) {
            result+=Math.abs(students[i]-seats[i]);
        }
        return result;
    }
}