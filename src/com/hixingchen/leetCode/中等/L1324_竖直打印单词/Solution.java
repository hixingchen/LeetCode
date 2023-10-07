package com.hixingchen.leetCode.中等.L1324_竖直打印单词;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> printVertically(String s) {
        String[] target = s.split(" ");
        List<String> result = new ArrayList<>();
        int len = 0;
        while(true){
            boolean temp = false;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < target.length; i++) {
//                sb.append(target[i].charAt(len))
                if (target[i].length()>len){
                    temp = true;
                    sb.append(target[i].charAt(len));
                }else {
                    sb.append(" ");
                }
            }
            for (int i = sb.length()-1; i >= 0 ; i--) {
                if (sb.charAt(i) == ' '){
                    sb.deleteCharAt(i);
                }else {
                    break;
                }
            }
            if (sb.length()>0){
                result.add(sb.toString());
            }
            if (!temp){
                break;
            }
            len++;
        }
        return result;
    }
}