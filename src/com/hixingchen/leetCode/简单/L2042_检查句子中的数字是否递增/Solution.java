package com.hixingchen.leetCode.简单.L2042_检查句子中的数字是否递增;

public class Solution {
    public boolean areNumbersAscending(String s) {
        String[] target = s.split(" ");
        int current = -1;
        for (int i = 0; i < target.length; i++) {
            int temp = 0;
            if (Character.isDigit(target[i].charAt(temp))){
                int tempResult = 0;
                while (target[i].length()>temp){
                    tempResult += target[i].charAt(temp)-'0';
                    if (target[i].length()-1>temp){
                        tempResult *= 10;
                    }
                    temp++;
                }
                if (tempResult>current){
                    current = tempResult;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}