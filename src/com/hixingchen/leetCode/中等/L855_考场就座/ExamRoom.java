package com.hixingchen.leetCode.中等.L855_考场就座;

import java.util.TreeSet;

public class ExamRoom {
    TreeSet<Integer> target = new TreeSet();
    int length,betweenSize,temp,left,right;
    public ExamRoom(int n) {
        this.length = n;
    }

    public int seat() {
        if (target.isEmpty()){
            target.add(0);
            return 0;
        }
        betweenSize = 0;
        temp = left = right = target.first();
        target.forEach(e->{
            if ((e-temp)/2>betweenSize){
                betweenSize = (e-temp)/2;
                left = temp;
                right = e;
            }
            temp = e;
        });
        if ((length-1-temp)>(right-left)/2 || target.first()>=(right-left)/2){
            if ((length-1-temp)>target.first()){
                target.add(length-1);
                return length-1;
            }else {
                target.add(0);
                return 0;
            }
        }else {
            target.add((right+left)/2);
            return (right+left)/2;
        }
    }

    public void leave(int p) {
        target.remove(p);
    }
}