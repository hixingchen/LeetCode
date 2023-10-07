package com.hixingchen.leetCode.中等.L1604_警告一小时内使用相同员工卡大于等于三次的人;

import java.util.*;

public class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<Integer>> target = new HashMap<>();
        List<String> result = new ArrayList<>();
        int n = keyName.length;
        for (int i = 0; i < n; i++) {
            List<Integer> temp = target.getOrDefault(keyName[i],new ArrayList<>());
            temp.add(Integer.valueOf(keyTime[i].substring(0,2))*60+Integer.valueOf(keyTime[i].substring(3)));
            target.put(keyName[i],temp);
        }
        target.forEach((k,v)->{
            List<Integer> temp = target.get(k);
            Collections.sort(temp);
            for (int i = 0; i < temp.size()-2; i++) {
                if ((temp.get(i+2)-temp.get(i))<=60){
                    result.add(k);
                    break;
                }
            }
        });
        Collections.sort(result);
        return result;
    }
}
