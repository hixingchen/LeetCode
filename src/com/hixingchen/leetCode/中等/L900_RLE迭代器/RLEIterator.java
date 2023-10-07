package com.hixingchen.leetCode.中等.L900_RLE迭代器;

public class RLEIterator {
    int[] target;
    int currentIndex;
    int nums;
    public RLEIterator(int[] encoding) {
        target = encoding;
        currentIndex = 0;
        nums = 0;
    }

    public int next(int n) {
        while (currentIndex<target.length){
            if (n>target[currentIndex]-nums){
                n-=target[currentIndex]-nums;
                nums = 0;
                currentIndex+=2;
            }else {
                nums += n;
                return target[currentIndex+1];
            }
        }
        return -1;
    }
}