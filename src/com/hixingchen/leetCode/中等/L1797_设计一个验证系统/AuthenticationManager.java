package com.hixingchen.leetCode.中等.L1797_设计一个验证系统;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationManager {
    private int timeToLive;
    private Map<String,Integer> tokenMap;
    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        tokenMap = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        tokenMap.put(tokenId,currentTime+timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if (tokenMap.getOrDefault(tokenId,0)>currentTime){
            tokenMap.put(tokenId,currentTime+timeToLive);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int res = 0;
        for (int time : tokenMap.values()) {
            if (time > currentTime) {
                res++;
            }
        }
        return res;
    }
}