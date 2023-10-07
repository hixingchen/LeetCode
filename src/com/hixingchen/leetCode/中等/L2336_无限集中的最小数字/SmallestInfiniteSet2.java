package com.hixingchen.leetCode.中等.L2336_无限集中的最小数字;

import java.util.TreeSet;

/**
 * 精简写法
 */
public class SmallestInfiniteSet2 extends TreeSet<Integer>{
    int cur = 1;
    public SmallestInfiniteSet2() {
    }

    public int popSmallest() {
        return isEmpty()?cur++:pollFirst();
    }

    public void addBack(int num) {
        if (num <= cur) {
            add(num);
        }
    }
}