package com.hixingchen.leetCode.简单题测试;

import java.util.*;

public class Solution {
    public int maxSales(int[] sales) {
        int res = sales[0];
        int temp = 0;
        for (int i = 0; i < sales.length; i++) {
            temp += sales[i];
            if (sales[i]<0){
                res = Math.max(res,sales[i]);
            }
            if (temp<0){
                temp = 0;
            }else {
                res = Math.max(res,temp);
            }
        }
        return res;
    }
}