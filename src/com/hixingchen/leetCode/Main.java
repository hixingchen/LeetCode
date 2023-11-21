package com.hixingchen.leetCode;
//import com.hixingchen.leetCode.中等.L16_最接近的三数之和.Solution;
//import com.hixingchen.leetCode.困难.L1163_按字典序排在最后的子串.Solution;
//import com.hixingchen.leetCode.简单.L2427_公因子的数目.Solution;
import com.hixingchen.leetCode.简单题测试.Solution;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = new int[]{2,1,100,3};
        int[] arr2 = new int[]{-5,-2,10,-3,7};
        int theDistanceValue = solution.findTheDistanceValue(arr1, arr2, 6);
        System.out.println(theDistanceValue);
    }
}
