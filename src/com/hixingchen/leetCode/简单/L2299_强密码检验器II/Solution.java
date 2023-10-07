package com.hixingchen.leetCode.简单.L2299_强密码检验器II;

public class Solution {

    public boolean strongPasswordCheckerII(String password) {
        if (password.length()<8){
            return false;
        }
        if (password.toLowerCase().equals(password)){
            return false;
        }
        if (password.toUpperCase().equals(password)){
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if ("!@#$%^&*()-+".indexOf(password.charAt(i))>-1){
                break;
            }
            if (i==password.length()-1){
                return false;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if ("1234567890".indexOf(password.charAt(i))>-1){
                break;
            }
            if (i == password.length()-1){
                return false;
            }
        }
        for (int i = 0; i < password.length()-1; i++) {
            if (password.charAt(i) == password.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}