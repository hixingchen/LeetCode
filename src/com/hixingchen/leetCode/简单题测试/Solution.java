package com.hixingchen.leetCode.简单题测试;

import java.util.*;

public class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer> target = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            target.put(deck[i],target.getOrDefault(deck[i],0) + 1);
        }
        Iterator<Integer> iterator = target.values().iterator();
        int gcd = iterator.next();
        while (iterator.hasNext()){
            gcd = gcd(gcd,iterator.next());
        }
        return gcd>=2;
    }
    private int gcd(int a ,int b){
        return b==0?a:gcd(b,a %b);
    }
}