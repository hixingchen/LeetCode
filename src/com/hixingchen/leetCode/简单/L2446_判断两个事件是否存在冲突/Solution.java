package com.hixingchen.leetCode.简单.L2446_判断两个事件是否存在冲突;

public class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        return !(event1[1].compareTo(event2[0]) < 0 || event2[1].compareTo(event1[0]) < 0);
    }
}
