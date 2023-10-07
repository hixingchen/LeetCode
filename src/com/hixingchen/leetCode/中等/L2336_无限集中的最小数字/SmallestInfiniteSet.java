package com.hixingchen.leetCode.中等.L2336_无限集中的最小数字;

import java.util.TreeSet;

/**
 * TreeSet解法
 */
public class SmallestInfiniteSet {
    TreeSet<Integer> insert = new TreeSet<>();
    int n = 1;
    public SmallestInfiniteSet() {
    }

    public int popSmallest() {
        if (insert.isEmpty()) return n++;
        return insert.pollFirst();
    }

    public void addBack(int num) {
        if (num<n) insert.add(num);
    }
}