package com.hixingchen.leetCode.中等.L1487_保证文件名唯一;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] getFolderNames(String[] names) {
        Map<String,Integer> target = new HashMap<>();
        int n = names.length;
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            String name = names[i];
            if (!target.containsKey(name)){
                target.put(name,1);
                result[i] = name;
            }else {
                int temp = target.get(name);
                while (target.containsKey(addSuffix(name,temp))){
                    temp++;
                }
                result[i] = addSuffix(name,temp);
                target.put(name,temp+1);
                target.put(addSuffix(name,temp),1);
            }
        }
        return result;
    }
    public String addSuffix(String name, int k) {
        return name + "(" + k + ")";
    }
}