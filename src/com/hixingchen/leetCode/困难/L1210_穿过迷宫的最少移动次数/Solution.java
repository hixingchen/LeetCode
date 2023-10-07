package com.hixingchen.leetCode.困难.L1210_穿过迷宫的最少移动次数;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * 广度优先搜索
 */
public class Solution {
    public int minimumMoves(int[][] grid) {
        int n = grid.length;
        int[][][] result = new int[2][n][n];
        Queue<int[]> target = new ArrayDeque<>();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(result[i][j],Integer.MAX_VALUE);
            }
        }
        result[0][0][0] = 0;
        target.offer(new int[]{0,0,0});
        while (target.size()>0){
            int[] poll = target.poll();
            int x = poll[2];
            int y = poll[1];
            int type = poll[0];
            //移动分4种情况:右移，下移，右下旋，右上旋，状态分2种情况：水平，竖直
            //水平
            if (type == 0){
                //右移
                if(x+2<n && grid[y][x+2] == 0 && result[0][y][x+1] == Integer.MAX_VALUE){
                    result[0][y][x+1] = result[0][y][x]+1;
                    target.offer(new int[]{0,y,x+1});
                }
                //下移与下旋
                if (y+1<n && ((grid[y+1][x]|grid[y+1][x+1]))==0){
                    if (result[0][y+1][x] == Integer.MAX_VALUE){
                        result[0][y+1][x] = result[0][y][x]+1;
                        target.offer(new int[]{0,y+1,x});
                    }
                    if (result[1][y][x] == Integer.MAX_VALUE){
                        result[1][y][x] = result[0][y][x]+1;
                        target.offer(new int[]{1,y,x});
                    }
                }
            }else{
                //右移与右上旋
                if(x+1<n && (grid[y][x+1]|grid[y+1][x+1])==0){
                    if (result[1][y][x+1] == Integer.MAX_VALUE){
                        result[1][y][x+1] = result[1][y][x]+1;
                        target.offer(new int[]{1,y,x+1});
                    }
                    if (result[0][y][x] == Integer.MAX_VALUE){
                        result[0][y][x] = result[1][y][x]+1;
                        target.offer(new int[]{0,y,x});
                    }
                }
                //下移
                if (y+2<n && grid[y+2][x] == 0 && result[1][y+1][x] == Integer.MAX_VALUE){
                    result[1][y+1][x] = result[1][y][x]+1;
                    target.offer(new int[]{1,y+1,x});
                }
            }
        }
        return result[0][n-1][n-2] == Integer.MAX_VALUE?-1:result[0][n-1][n-2];
    }
}