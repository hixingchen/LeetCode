package com.hixingchen.leetCode.简单.L1275_找出井字棋的获胜者;

public class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int sum = 0;
        for(int i=0;i<patterns.length;i++){
            if(word.indexOf(patterns[i])!= -1){
                sum++;
            }
        }
        return sum;
    }
}