package com.hixingchen.leetCode.简单.L1694_重新格式化电话号码;

public class Solution {
    public String reformatNumber(String number) {
        String target = number.replace("-","").replace(" ","");
        StringBuilder result = new StringBuilder();
        int len = target.length();
        int index = 0;
        for (index = 0; index < len; index+=3) {
            if(index + 4 >= len){
                break;
            }
            result.append(target.charAt(index)).append(target.charAt(index+1)).append(target.charAt(index+2)).append("-");
        }
        if (len - index == 4){
            result.append(target.substring(index,index+2)).append("-").append(target.substring(len-2,len));
        }else {
            result.append(target.substring(index,len));
        }
        return result.toString();
    }
}