package com.hixingchen.leetCode.简单.L2383_赢得比赛需要的最少训练时长;

public class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int result = 0;
        for (int i = 0; i < energy.length; i++) {
            initialEnergy -= energy[i];
        }
        result += initialEnergy<=0?result-initialEnergy+1:0;
        for (int i = 0; i < experience.length; i++) {
            if (initialExperience<=experience[i]){
                result+=experience[i]-initialExperience+1;
                initialExperience = experience[i]+1;
            }
            initialExperience += experience[i];
        }
        return result;
    }
}