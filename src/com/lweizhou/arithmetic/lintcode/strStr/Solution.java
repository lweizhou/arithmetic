package com.lweizhou.arithmetic.lintcode.strStr;

/**
 * 
 * 对于一个给定的 source 字符串和一个 target 字符串，
 * 你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。
 * 如果不存在，则返回 -1。
 * @author lweizhou
 *
 */
public class Solution {

    public static int strStr(String source, String target) {
        // write your code here
        if(source == null || target == null){
            return -1;
        }
        int sl = source.length();
        int tl = target.length();
        if(sl < tl){
            return -1;
        }
        for(int i = 0,l = sl - tl + 1; i < l ; i++){
            int j = 0;
            for(; j < tl; j++){
                if(source.charAt(i + j) != target.charAt(j)){
                    break;
                }
            }
            if(j == target.length())
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(strStr("ABCD", "CD"));
    }
    
}
