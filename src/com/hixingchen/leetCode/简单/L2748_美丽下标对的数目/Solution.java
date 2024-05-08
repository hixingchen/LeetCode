package com.hixingchen.leetCode.简单.L2748_美丽下标对的数目;

public class Solution {
    public int countBeautifulPairs(int[] nums) {
        int res = 0;
        int[] target = new int[10];
        for (int num : nums) {
            for (int i = 1; i < 10; i++) {
                if (gcd(num%10,i) == 1){
                    res += target[i];
                }
            }
            while (num>=10) num/=10;
            target[num]++;
        }
        return res;
    }
    private int gcd(int a,int b){
        if (b == 0){
            return a;
        }
        int temp = b;
        b = a%b;
        a = temp;
        return gcd(a,b);
    }
}