package com.hixingchen.leetCode.简单.L1417_重新格式化字符串;

public class Solution {
    public String reformat(String s) {
        int sumDigit = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                sumDigit++;
            }
        }
        int sumAlpha = s.length()-sumDigit;
        if (Math.abs(sumAlpha-sumDigit)>1){
            return "";
        }
        char[] arr = s.toCharArray();
        boolean flag = sumDigit>sumAlpha;
        for (int i = 0,j=1; i < s.length(); i+=2) {
            if (Character.isDigit(arr[i]) != flag){
                while (Character.isDigit(arr[j]) != flag){
                    j+=2;
                }
                swap(arr,i,j);
            }
        }
        return new String(arr);
    }
    public void swap(char[] arr,int i,int j){
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }
}