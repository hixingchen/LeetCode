package com.hixingchen.leetCode.简单题测试;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while (left<right){
            int temp = numbers[left]+numbers[right];
            if (temp == target){
                return new int[]{left,right};
            }else if (temp<target){
                left++;
            }else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}