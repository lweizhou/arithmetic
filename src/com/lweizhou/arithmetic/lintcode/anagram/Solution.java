package com.lweizhou.arithmetic.lintcode.anagram;

/**
 * 
 * 写出一个函数 anagram(s, t) 判断两个字符串是否可以通过改变字母的顺序变成一样的字符串。
 * @author lweizhou
 *
 */
public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public static boolean anagram(String s, String t) {

        if(s.length() != t.length())
            return false;
        
        int[] a = new int[256];
        for(int i = 0,length = s.length(); i < length; i++)
            a[s.charAt(i)]++;
        
        for(int i = 0,length = t.length(); i < length; i++){
            a[t.charAt(i)]--;
            if(a[t.charAt(i)] < 0)
                return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        
        System.out.println(anagram("happy new year", "n ahwryeypp eb"));
    }
    
}
