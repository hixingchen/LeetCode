package com.hixingchen.leetCode.其他.LCP_72_补给马车;

import java.util.Arrays;

public class Solution {
    public int[] supplyWagon(int[] supplies) {
        int len = supplies.length/2;
        for (int i = supplies.length; i>len; i--) {
            int temp = 1;
            for (int j = 1; j < i; j++) {
                if (supplies[j]+supplies[j-1]<supplies[temp]+supplies[temp-1]){
                    temp = j;
                }
            }
            supplies[temp-1] += supplies[temp];
            System.arraycopy(supplies,temp+1,supplies,temp,i-temp-1);
        }
        return Arrays.copyOf(supplies,len);
    }
}