package com.hixingchen.leetCode.中等.L2507_使用质因数之和替换后可以取到的最小值;

public class Solution {
    public int smallestValue(int n) {
        while (true){
            int sum = sum(n);
            if (sum != n){
                n = sum;
            }else {
                break;
            }
        }
        return n;
    }

    private int sum(int n){
        int temp = n;
        int mark = n;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0){
                temp = i;
                n = n/i;
                break;
            }
        }
        if (mark == temp){
            return temp;
        }else {
            return temp + sum(n);
        }
    }
}