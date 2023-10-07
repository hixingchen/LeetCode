package com.hixingchen.leetCode.中等.L1637_两点之间不包含任何点的最宽垂直面积;

import java.util.Arrays;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (p1, p2) -> (p1[0] - p2[0]));
        int ans = 0;
        for(int i = 1; i < points.length; i++){
            ans = Math.max(ans, points[i][0]-points[i-1][0]);
        }
        return ans;
    }
}
