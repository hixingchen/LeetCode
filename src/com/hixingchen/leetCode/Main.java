package com.hixingchen.leetCode;
//import com.hixingchen.leetCode.中等.L16_最接近的三数之和.Solution.java;
//import com.hixingchen.leetCode.困难.L1163_按字典序排在最后的子串.Solution.java;
//import com.hixingchen.leetCode.简单.L2427_公因子的数目.Solution.java;
import com.hixingchen.leetCode.简单题测试.ListNode;
import com.hixingchen.leetCode.简单题测试.Solution;
import com.hixingchen.leetCode.简单题测试.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode target = new ListNode(1);
        target.next = new ListNode(2);
        target.next.next = new ListNode(2);
        target.next.next.next = new ListNode(1);
        solution.isPalindrome(target);
    }
}
