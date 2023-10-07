package com.hixingchen.leetCode.简单.L1710_卡车上的最大单元数;

import java.util.Arrays;

public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int result = 0;
        Arrays.sort(boxTypes, (o1,o2)->o2[1]-o1[1]);
        int i = 0;
        while (true){
            if (truckSize <= 0 || i >= boxTypes.length){
                break;
            }
            if (truckSize - boxTypes[i][0] >= 0){
                result += boxTypes[i][0]*boxTypes[i][1];
            }else {
                result += truckSize*boxTypes[i][1];
            }
            truckSize -= boxTypes[i][0];
            i++;
        }
        return result;
    }
}