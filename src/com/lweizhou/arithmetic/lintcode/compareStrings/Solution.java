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
      
        int[] cs = new int[256];
        char[] as = A.toCharArray();
        for (char c : as) {
            ++cs[c];
        }
        
        int[] ds = new int[256];
        char[] bs = B.toCharArray();
        for (char c : bs) {
            ++ds[c];
        }
        
        for(char i : bs){
            if(ds[i] > cs[i])
                return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(compareStrings("AB","ABC"));
    }
    
}
