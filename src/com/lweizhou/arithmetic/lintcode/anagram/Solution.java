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
        // write your code here
        if(s.length() != t.length())
            return false;
        
        int[] a = new int[256];
        
        for (int i = 0; i < 256; i++) {
            a[i] = 0;
        }
        
        char[] ss = s.toCharArray();
        for(int i = 0,length = ss.length; i < length; i++){
            a[(int)ss[i]] = 1;
        }
        
        char[] ts = t.toCharArray();
        for(int i = 0,length = ts.length; i < length; i++){
            if(a[(int)ts[i]] != 1)
                return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        
        System.out.println(anagram("abc", "baa"));
    }
    
}
