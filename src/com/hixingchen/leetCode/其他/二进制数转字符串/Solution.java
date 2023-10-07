package com.hixingchen.leetCode.其他.二进制数转字符串;

public class Solution {
    public String printBin(double num) {
        String result = new String("0.");
        for (int i = 0; i < 30; i++) {
            if (num == 0){
                break;
            }
            num*=2;
            if (num>=1){
                num-=1;
                result+="1";
            }else {
                result+="0";
            }
        }
        return num == 0?result:"ERROR";
    }
}