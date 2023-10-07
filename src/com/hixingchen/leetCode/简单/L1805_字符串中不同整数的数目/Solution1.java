package com.hixingchen.leetCode.简单.L1805_字符串中不同整数的数目;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public int numDifferentIntegers(String word) {
        Set<String> result = new HashSet<>();
        int startIndex = -1;
        int endIndex = -1;
        boolean temp = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= '0' && word.charAt(i) <= '9'){
                endIndex = i;
                if (i == word.length()-1){
                    temp = true;
                }
            }else if(!temp && startIndex < endIndex){
                temp = true;
            }else {
                startIndex = i;
            }
            if (temp){
                while (endIndex - startIndex > 1 && word.charAt(startIndex+1) == '0'){
                    startIndex++;
                }
                result.add(word.substring(startIndex+1,endIndex+1));
                startIndex = i;
                temp = false;
            }
        }
        return result.size();
    }
}