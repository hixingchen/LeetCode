package com.hixingchen.leetCode.简单.L1071_字符串的最大公因子;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }
    public int gcd(int n1,int n2){
        if (n2 == 0){
            return n1;
        }
        int temp = n1;
        n1 = n2;
        n2 = temp%n2;
        return gcd(n1,n2);
    }
}