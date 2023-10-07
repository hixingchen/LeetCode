package com.hixingchen.leetCode.简单.L1742_盒子中小球的最大数量;

import java.util.*;

public class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer,Integer> total = new HashMap<>();
        for (int i = lowLimit; i <= highLimit ; i++) {
            int temp = numCount(i);
            if (total.containsKey(temp)){
                total.put(temp,total.get(temp)+1);
            }else {
                total.put(temp,1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList(total.entrySet());
        Collections.sort(list,(o1,o2)->(o2.getValue()-o1.getValue()));
        return list.get(0).getValue();
    }
    public int numCount(int target){
        int result = 0;
        while (target >= 10){
            result += target % 10;
            target /= 10;
        }
        return result+target;
    }
}