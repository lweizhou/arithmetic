package com.lweizhou.arithmetic.lintcode.compareStrings;

/**
 * 比较两个字符串A和B，确定A中是否包含B中所有的字符。
 * 字符串A和B中的字符都是 大写字母
 * eg:
 * 给出 A = "ABCD" B = "ACD"，返回 true 
 * 给出 A = "ABCD" B = "AABC"， 返回 false
 * @author lweizhou
 *
 */
public class Solution {

    
    public static boolean compareStrings(String A, String B) {

        if(A.length() < B.length())
            return false;
        
        if(A.length() > 0 && B.length() == 0)
            return true;
      
        int[] counts = new int[26];
        for (int i = 0; i < A.length(); i++) {
            counts[A.charAt(i) - 'A'] ++;
        }
        for (int i = 0; i < B.length(); i++) {
            counts[B.charAt(i) - 'A'] --;
            if (counts[B.charAt(i) - 'A'] < 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(compareStrings("ABCD","ABC"));
    }
    
}
