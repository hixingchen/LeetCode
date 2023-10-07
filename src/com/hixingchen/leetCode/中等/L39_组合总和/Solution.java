package com.hixingchen.leetCode.中等.L39_组合总和;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        select(candidates,target,temp,candidates.length);
        return result;
    }

    public void select(int[] candidates, int target, List<Integer> temp,int index){
        if(target < 0 || candidates.length <= 0){
            return;
        }else if (target == 0){
            List<Integer> temp1 = new ArrayList<>();
            Collections.addAll(temp1,new Integer[temp.size()]);
            Collections.copy(temp1,temp);
            result.add(temp1);
            return;
        }
        if (index > 1){
            select(candidates,target,temp,index-1);
        }
        temp.add(candidates[index-1]);
        select(candidates,target-candidates[index-1],temp,index);
        temp.remove(temp.size()-1);
    }
}
