package com.hixingchen.leetCode.简单.L2347_最好的扑克手牌;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Set<Character> temp = new HashSet<>();
        Map<Integer,Integer> temp2 = new HashMap<>();
        for (int i = 0; i < suits.length; i++) {
            temp.add(suits[i]);
        }
        for (int i = 0; i < ranks.length; i++) {
            temp2.put(ranks[i],temp2.getOrDefault(ranks[i],0)+1);
        }
        if (temp.size() == 1){
            return "Flush";
        }
        for (Integer v:temp2.values()) {
            if (v>=3){
                return "Three of a Kind";
            }
        }
        if (temp2.size()<=4){
            return "Pair";
        }
        return "High Card";
    }
}