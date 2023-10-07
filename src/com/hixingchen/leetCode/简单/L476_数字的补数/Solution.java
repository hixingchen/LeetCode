package com.hixingchen.leetCode.简单.L476_数字的补数;

class Solution {
    public int findComplement(int num) {
        return num^((int)(Math.pow(2,(int)(Math.log(num)/Math.log(2))+1)-1));
    }
}