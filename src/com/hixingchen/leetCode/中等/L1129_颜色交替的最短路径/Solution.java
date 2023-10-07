package com.hixingchen.leetCode.中等.L1129_颜色交替的最短路径;

import java.util.*;

/**
 * 广度优先搜索
 */
public class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        int[] result = new int[n];
        List<Integer>[][] next = new List[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                next[i][j] = new ArrayList<>();
            }
        }
        for(int[] edge:redEdges){
            next[0][edge[0]].add(edge[1]);
        }
        for (int[] edge : blueEdges) {
            next[1][edge[0]].add(edge[1]);
        }
        int[][] dist = new int[2][n];// 两种类型的颜色最短路径的长度
        for (int i = 0; i < 2; i++) {
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        Queue<int[]> queue = new ArrayDeque<>();
        dist[0][0] = 0;
        dist[1][0] = 0;
        queue.offer(new int[]{0,0});
        queue.offer(new int[]{0,1});
        while (!queue.isEmpty()){
            int[] pair = queue.poll();
            int x = pair[0],t = pair[1];
            for (int y : next[1-t][x]){
                if (dist[1-t][y] == Integer.MAX_VALUE){
                    dist[1-t][y] = dist[t][x]+1;
                    queue.offer(new int[]{y,1-t});
                }
            }
        }
        for (int i = 0; i < n; i++) {
            result[i] = Math.min(dist[0][i],dist[1][i]);
            if (result[i] == Integer.MAX_VALUE){
                result[i] = -1;
            }
        }
        return result;
    }
}