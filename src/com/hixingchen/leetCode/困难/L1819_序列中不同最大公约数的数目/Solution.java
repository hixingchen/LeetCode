package com.hixingchen.leetCode.困难.L1819_序列中不同最大公约数的数目;

import java.util.Arrays;

public class Solution {
    public int countDifferentSubsequenceGCDs(int[] nums) {
        int maxVal = Arrays.stream(nums).max().getAsInt();
        boolean[] occured = new boolean[maxVal+1];
        for (int num:nums){
            occured[num] = true;
        }
        int ans = 0;
        for (int i = 1; i <= maxVal; i++) {
            int subGod = 0;
            for (int j = i; j <= maxVal; j+=i) {
                if (occured[j]){
                    if (subGod == 0){
                        subGod = j;
                    }else {
                        subGod = gcd(subGod,j);
                    }
                    if (subGod == i){
                        ans++;
                        break;
                    }
                }
            }
        }
        return ans;
    }
    public int gcd(int num1,int num2){
        while (num2 != 0){
            int temp = num1;
            num1 = num2;
            num2 = temp%num2;
        }
        return num1;
    }
}