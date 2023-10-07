package com.hixingchen.leetCode.中等.L1750_删除字符串两端相同字符后的最短长度;

/**
 * 初始版本，效率低
 */
public class Solution {
    public int minimumLength(String s) {
        Character temp;
        while (true){
            if (s.length() == 1){
                break;
            }
            temp = s.charAt(0);
            int leftIndex = 0;
            int rightIndex = s.length();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == temp){
                    leftIndex++;
                }else {
                    break;
                }
            }
            for (int i = s.length()-1; i >= 0; i--) {
                if (s.charAt(i) == temp){
                    rightIndex--;
                }else {
                    break;
                }
            }
            if (rightIndex == s.length()){
                break;
            }
            if (rightIndex<=leftIndex){
                return 0;
            }
            s = s.substring(leftIndex,rightIndex);
        }
        return s.length();
    }
}