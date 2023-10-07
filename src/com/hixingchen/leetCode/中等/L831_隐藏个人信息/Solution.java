package com.hixingchen.leetCode.中等.L831_隐藏个人信息;

public class Solution {
    String[] country = {"", "+*-", "+**-", "+***-"};
    public String maskPII(String s) {
        int index = s.indexOf('@');
        String result = "";
        if(index>0){
            String temp = s.toLowerCase();
            result = temp.charAt(0)+"*****"+temp.substring(index-1);
        }else {
            String temp = s.replaceAll("[^0-9]", "");
            result = country[temp.length()-10]+"***-***-"+temp.substring(temp.length()-4);
        }
        return result;
    }
}