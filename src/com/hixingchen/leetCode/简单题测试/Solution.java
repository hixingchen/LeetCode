package com.hixingchen.leetCode.简单题测试;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public int storeWater(int[] bucket, int[] vat) {
        int len = bucket.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (bucket[i] == 0 && vat[i] != 0){
                cnt++;
                bucket[i]++;
            }
            if (vat[i]>0){
                pq.offer(new int[]{(vat[i]+bucket[i]-1)/bucket[i],i});
            }
        }
        if (pq.isEmpty()){
            return 0;
        }
        int res = Integer.MAX_VALUE;
        while (cnt<res){
            int[] arr = pq.poll();
            int v = arr[0];
            int i = arr[1];
            res = Math.min(res,cnt+v);
            if (v<=2){
                break;
            }
            cnt++;
            bucket[i]++;
            pq.offer(new int[]{(vat[i]+bucket[i]-1)/bucket[i],i});
        }
        return res;
    }
}