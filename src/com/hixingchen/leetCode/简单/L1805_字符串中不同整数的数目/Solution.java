package com.hixingchen.leetCode.简单.L1805_字符串中不同整数的数目;

import java.util.HashSet;
import java.util.Set;

/**
 * 双指针
 */
public class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> result = new HashSet<>();
        int startIndex = -1;
        int endIndex = -1;
        boolean temp = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= '0' && word.charAt(i) <= '9'){
                if (!temp){
                    temp = true;
                }
                endIndex = i;
                if (i == word.length()-1){
                    while (endIndex - startIndex > 1 && word.charAt(startIndex+1) == '0'){
                        startIndex++;
                    }
                    result.add(word.substring(startIndex+1,endIndex+1));
                }
            }else{
                if (temp){
                    while (endIndex - startIndex > 1 && word.charAt(startIndex+1) == '0'){
                        startIndex++;
                    }
                    result.add(word.substring(startIndex+1,endIndex+1));
                    temp = false;
                }
                startIndex = i;
            }
        }
        return result.size();
    }
}