package com.hixingchen.leetCode.中等.L1286_字母组合迭代器;

public class CombinationIterator {
    int[] res;
    String target;
    Boolean hasNext = true;
    public CombinationIterator(String characters, int combinationLength) {
        target = characters;
        res = new int[combinationLength];
        for (int i = 0; i < combinationLength; i++) {
            res[i] = i;
        }
    }

    public String next() {
        if (res[0]>target.length()-res.length){
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            result.append(target.charAt(res[i]));
        }
        res[res.length-1]++;
        //模拟进制
        for (int i = res.length - 1; i >= 1; i--) {
            if (res[i]>target.length() - res.length + i){
                res[i-1]++;
            }
        }
        //将超过的部分为上一位的值加一，就是当前位的最小值
        for (int i = 1; i < res.length; i++) {
            if (res[i]>target.length() - res.length + i){
                res[i] = res[i-1]+1;
            }
        }
        //如果第一位超过自己的进制，说明没有下一个值了
        if (res[0]>target.length()-res.length){
            hasNext = false;
        }
        return result.toString();
    }

    public boolean hasNext() {
        return hasNext;
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */