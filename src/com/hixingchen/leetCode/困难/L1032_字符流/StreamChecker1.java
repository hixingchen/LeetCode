package com.hixingchen.leetCode.困难.L1032_字符流;

/**
 * 此方法复杂度高不推荐
 */
public class StreamChecker1 {
    int max = 0;
    StringBuilder stringBuilder = new StringBuilder();
    String[] target;
    public StreamChecker1(String[] words) {
        target = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            max = Math.max(max,words[i].length());
            StringBuilder temp = new StringBuilder(words[i]);
            target[i] = temp.reverse().toString();
        }
    }

    public boolean query(char letter) {
        stringBuilder.append(letter);
        if (stringBuilder.length()>max){
            stringBuilder.deleteCharAt(0);
        }
        StringBuilder reverse = stringBuilder.reverse();
        for (int i = 0; i < target.length; i++) {
            if(target[i].length()>reverse.length()){
                continue;
            }
            if (reverse.substring(0,target[i].length()).equals(target[i])){
                stringBuilder.reverse();
                return true;
            }
        }
        stringBuilder.reverse();
        return false;
    }
}