package com.hixingchen.leetCode.简单.L1640_能否连接形成数组;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer,int[]> target = new HashMap<>();
        for (int i = 0; i < pieces.length; i++) {
            target.put(pieces[i][0],pieces[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int[] temps = target.get(arr[i]);
            if (temps != null){
                for (int j = 1; j < temps.length; j++) {
                    if (arr[i+j] != temps[j]){
                        return false;
                    }
                }
                i = i+temps.length-1;
            }else {
                return false;
            }
        }
        return true;
    }
}