package com.hixingchen.leetCode.中等.L1233_删除子文件夹;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();
        String temp = "-1";
        for (int i = 0; i < folder.length; i++) {
            if (folder[i].indexOf(temp) != 0){
                result.add(folder[i]);
                temp = folder[i]+"/";
            }
        }
        return result;
    }
}