package com.hixingchen.leetCode.中等.L1616_分割两个字符串得到回文串;

public class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return checkConcatenation(a,b)||checkConcatenation(b,a);
    }

    private boolean checkConcatenation(String a, String b) {
        int left = 0,right = a.length()-1;
        while (left<right && a.charAt(left) == b.charAt(right)){
            left++;
            right--;
        }
        if (right<left){
            return true;
        }
        return checkSelfPalindrome(a,left,right)||checkSelfPalindrome(b,left,right);
    }

    private boolean checkSelfPalindrome(String a, int left, int right) {
        while (right>left && a.charAt(left) == a.charAt(right)){
            left++;
            right--;
        }
        return left>=right;
    }
}