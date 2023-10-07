package com.hixingchen.leetCode.中等.L1792_最大平均通过率;

import java.util.PriorityQueue;

public class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> target = new PriorityQueue<>((o1, o2) -> {
            long temp1 = (long) o2[1]*(o2[1]+1)*(o1[1]-o1[0]);
            long temp2 = (long) o1[1]*(o1[1]+1)*(o2[1]-o2[0]);
            return temp2>temp1?1:-1;
        });
        for (int[] c : classes) {
            target.offer(new int[]{c[0], c[1]});
        }
        for (int i = 0; i < extraStudents; i++) {
            int[] arr = target.poll();
            target.offer(new int[]{arr[0] + 1, arr[1] + 1});
        }
        double result = 0;
        for (int i = 0; i < classes.length; i++) {
            int[] arr = target.poll();
            result+=1.0*arr[0]/arr[1];
        }
        return result/classes.length;
    }
}