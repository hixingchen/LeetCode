package com.hixingchen.leetCode.其他.LCP_28_采购方案;

import java.util.Arrays;

public class Solution {
    public int purchasePlans(int[] nums, int target) {
        int mod = 1_000_000_007;
        int ans = 0;
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] > target) right--;
            else {
                ans += right - left;
                left++;
            }
            ans %= mod;
        }
        return ans % mod;
    }
}