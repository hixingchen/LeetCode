package com.hixingchen.leetCode.中等.L1753_移除石子的最大得分;

import java.util.PriorityQueue;

public class Solution1 {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> target = new PriorityQueue<>((o1, o2) -> o2-o1);
        int result = 0;
        target.offer(a);
        target.offer(b);
        target.offer(c);
        int num1;
        int num2;
        while (true){
            num1 = target.poll();
            num2 = target.poll();
            if (num1 > 0 && num2 > 0){
                result++;
                target.offer(num1 - 1);
                target.offer(num2 - 1);
            }else {
                break;
            }
        }
        return result;
    }
}