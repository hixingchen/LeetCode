package com.hixingchen.leetCode.简单.L1385_两个数组间的距离值;

import java.util.Arrays;

public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int result = 0;
        for (int i = 0; i < arr1.length; i++) {
            Boolean ok = false;
            int temp = binarySearch(arr2, arr1[i]);
            ok |= Math.abs(arr1[i] - arr2[temp]) <= d;
            if (temp > 0){
                ok |= arr1[i] - arr2[temp - 1] <= d;
            }
            if (temp < arr2.length-1){
                ok |= arr2[temp + 1] -arr1[i] <= d;
            }
            result += !ok?1:0;
        }
        return result;
    }
    public int binarySearch(int[] arr,int d){
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low < high){
            mid = (low+high)/2;
            if (arr[mid] == d){
                return mid;
            }else if (arr[mid] > d){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }
}