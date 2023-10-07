package com.hixingchen.leetCode.中等.L764_最大加号标志;

public class Solution {
    /**
     * 个人解法：速度慢，复杂度n3
     */
    public int topLength = 0;
    public int downLength = 0;
    public int leftLength = 0;
    public int rightLength = 0;
    public int result = 0;

    public int orderOfLargestPlusSign(int n, int[][] mines) {

        int[][] target = new int[n][n];
        for (int i = 0; i < mines.length; i++) {
            target[mines[i][0]][mines[i][1]] = 1;
        }
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target.length; j++) {
                int count = count(target, i, j);
                result = Math.max(result, count);
            }
        }
        return result;
    }

    private int count(int[][] target, int i, int j) {
        topLength = 0;
        rightLength = 0;
        downLength = 0;
        leftLength = 0;
        int min = 0;
        for (int k = i; k >= 0; k--) {
            if (target[k][j] == 0) {
                leftLength++;
                if (k != 0) {
                    continue;
                }
            }
            min = leftLength;
            break;
        }
        for (int k = i; k < target.length; k++) {
            if (target[k][j] == 0) {
                rightLength++;
                if (k != target.length - 1) {
                    continue;
                }
            }
            min = Math.min(min, rightLength);
            break;
        }
        for (int k = j; k >= 0; k--) {
            if (target[i][k] == 0) {
                topLength++;
                if (k != 0) {
                    continue;
                }
            }
            min = Math.min(min, topLength);
            break;
        }
        for (int k = j; k < target.length; k++) {
            if (target[i][k] == 0) {
                downLength++;
                if (k != target.length - 1) {
                    continue;
                }
            }
            min = Math.min(min, downLength);
            break;
        }
        return min;
    }
}
