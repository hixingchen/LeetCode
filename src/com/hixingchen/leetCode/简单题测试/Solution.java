package com.hixingchen.leetCode.简单题测试;

import java.util.*;

public class Solution {
    public int purchasePlans(int[] nums, int target) {
        int mod = 1000000007;
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i))>=2 && list.get(i)*2<=target){
                res = (res + (list.get(i)*(list.get(i)-1)/2)%mod)%mod;
            }
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)+list.get(j)<=target){
                    res = (res + (map.get(list.get(i))*map.get(list.get(j)))%mod)%mod;
                }
            }
        }
        return res;
    }
}