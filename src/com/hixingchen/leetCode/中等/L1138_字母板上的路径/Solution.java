package com.hixingchen.leetCode.中等.L1138_字母板上的路径;

public class Solution {
    public String alphabetBoardPath(String target) {
        int x = 0;
        int y = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < target.length(); i++) {
            int tempY = (target.charAt(i)-'a')/5;
            int tempX = (target.charAt(i)-'a')%5;
            if (target.charAt(i) == 'z'){
                for (int j = 0; j < Math.abs(x - tempX); j++) {
                    result.append(x>tempX?'L':'R');
                }
                for (int j = 0; j < Math.abs(y - tempY); j++) {
                    result.append(y>tempY?'U':'D');
                }
            }else {
                for (int j = 0; j < Math.abs(y - tempY); j++) {
                    result.append(y>tempY?'U':'D');
                }
                for (int j = 0; j < Math.abs(x - tempX); j++) {
                    result.append(x>tempX?'L':'R');
                }
            }
            x=tempX;
            y=tempY;
            result.append('!');
        }
        return result.toString();
    }
}