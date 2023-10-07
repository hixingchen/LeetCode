package com.hixingchen.leetCode.简单.L1971_寻找图中是否存在路径;

public class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int[] target = new int[n];
        for (int i = 0; i < target.length; i++) {
            target[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            int temp = edges[i][0];
            int temp2 = edges[i][1];
            if (target[temp] == temp){
                target[temp] = temp2;
                while (target[temp2] != temp2){
                    temp2 = target[temp2];
                    target[temp] = temp2;
                }
            }else {
                int temp3 = target[temp2];
                while (target[temp3] != temp3){
                    temp3 = target[temp3];
                }
                int temp4 = target[temp];
                while (target[temp4] != temp4){
                    temp4 = target[temp4];
                }
                target[temp3] = temp4;
            }
        }
        while(target[source] != source){
            source = target[source];
        }
        while(target[destination] != destination){
            destination = target[destination];
        }
        return destination == source;
    }
}