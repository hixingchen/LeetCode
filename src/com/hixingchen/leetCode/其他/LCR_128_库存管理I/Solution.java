package com.hixingchen.leetCode.其他.LCR_128_库存管理I;

public class Solution {
    public int stockManagement(int[] stock) {
        int left = 0;
        int right = stock.length - 1;
        while (left < right){
            int mid = (left+right)/2;
            if (stock[mid]>stock[right]){
                left = mid+1;
            }else if (stock[mid]<stock[right]){
                right = mid;
            }else {
                right--;
            }
        }
        return stock[left];
    }
}