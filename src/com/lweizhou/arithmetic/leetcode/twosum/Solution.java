package com.lweizhou.arithmetic.leetcode.twosum;

import java.util.Arrays;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * @author lweizhou
 *
 */
public class Solution {

	public static int[] twoSum(int[] nums, int target) {
		
	    int length = nums.length;
		for(int i = 0; i < length; i++ ){
			for(int j = i + 1;j < length; j++){
				if(nums[i] + nums[j] == target){
					return new int[]{i,j};
				}
			}
		}
	   return null;
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = new int[]{2,7,11,15};
		
		System.out.println(Arrays.toString(twoSum(nums,18)));
	}
	
}
