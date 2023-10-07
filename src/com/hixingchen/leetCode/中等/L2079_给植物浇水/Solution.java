package com.hixingchen.leetCode.中等.L2079_给植物浇水;

public class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int temp = capacity;
        int result = 0;
        for (int i = 0; i < plants.length; i++) {
            if (temp >= plants[i]){
                temp -= plants[i];
            }else {
                temp = capacity - plants[i];
                result += i*2;
            }
        }
        return result+plants.length;
    }
}