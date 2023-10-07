package com.hixingchen.leetCode.简单.L2427_公因子的数目;

public class Solution {
    public int commonFactors(int a, int b) {
        int x = gcd(a,b);
        int result = 0;
        for (int i = 1; i*i <= x; i++) {
            if (x%i == 0){
                result += 2;
                if (i*i == x){
                    result--;
                }
            }
        }
        return result;
    }
    public int gcd(int a,int b){
        int temp = b;
        if (a%b == 0){
            return b;
        }
        b = a%b;
        a = temp;
        return gcd(a,b);
    }
}