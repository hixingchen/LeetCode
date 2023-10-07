package com.hixingchen.leetCode.其他.字母与数字;

import java.util.*;

public class Solution {
    public String[] findLongestSubarray(String[] array) {
        Map<Integer, List<Integer>> target = new HashMap<>();
        int temp = 0;
        List<Integer> integers = new ArrayList<>();
        integers.add(0);
        target.put(0,integers);
        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i].charAt(0))){
                temp--;
            }else {
                temp++;
            }
            List<Integer> orDefault = target.getOrDefault(temp, new ArrayList<>());
            orDefault.add(i+1);
            target.put(temp,orDefault);
        }
        int max = 0;
        int left = 0;
        int right = 0;
        for (List<Integer> value:target.values()) {
            if ((value.get(value.size()-1)-value.get(0))>max){
                left = value.get(0);
                right = value.get(value.size()-1);
                max = right-left;
            }else if ((value.get(value.size()-1)-value.get(0)) == max){
                left = Math.min(left,value.get(0));
                right = Math.min(right,value.get(value.size()-1));
            }
        }
        return Arrays.copyOfRange(array,left,right);
    }
}