package com.lweizhou.arithmetic.leetcode.longestsubstr;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * @author lweizhou
 *
 */
public class Solution {
	
	
	 public static int lengthOfLongestSubstring(String s) {
	
		 int n = s.length(), ans = 0;
	        int[] index = new int[128]; // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            i = Math.max(index[s.charAt(j)], i);
	            ans = Math.max(ans, j - i + 1);
	            index[s.charAt(j)] = j + 1;
	        }
	        return ans;
	 }
	 
	 public static void main(String[] args) {
//		 System.out.println((int)'a');
		   
		 System.out.println(lengthOfLongestSubstring("fwwkewp"));
		 
	}
	 
}
