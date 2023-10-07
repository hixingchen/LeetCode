package com.hixingchen.leetCode.中等.L790_多米诺和托米诺平铺;

public class Solution {
    /**
     * 动态规划
     * @param n
     * @return
     */
    public int numTilings(int n) {
        int[][] dynamic = new int[n][4];
        dynamic[0][3] = 1;
        dynamic[0][0] = 1;
        final int mod = 1000000007;
        for (int i = 1; i < n; i++) {
            dynamic[i][0] = dynamic[i-1][3];
            dynamic[i][1] = (dynamic[i-1][0]+dynamic[i-1][2])%mod;
            dynamic[i][2] = (dynamic[i-1][0]+dynamic[i-1][1])%mod;
            dynamic[i][3] = ((dynamic[i-1][0]+dynamic[i-1][1])%mod+(dynamic[i-1][2]+dynamic[i-1][3])%mod)%mod;
        }
        return dynamic[n-1][3];
    }
}