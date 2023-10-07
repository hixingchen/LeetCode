package com.hixingchen.leetCode.中等.L2336_无限集中的最小数字;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 利用PriorityQueue和Set解法
 */
public class SmallestInfiniteSet3 {
    Set<Integer> set = new HashSet();
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    int n = 1; // n为非离散区间的起始位置
    public SmallestInfiniteSet3() {
    }

    public int popSmallest() {
        if (set.isEmpty()) return n++;
        int res = pq.poll();
        set.remove(res);
        return res;
    }

    public void addBack(int num) {
        if (num < n && set.add(num)) pq.add(num);
    }
}