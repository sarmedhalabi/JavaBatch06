package com.syntax.class10;

public class Task3 {
	public static void main(String[] args) {
		int[]nums= {200,30,-1,56,787};
		int largest=0;
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i]>largest) {largest=nums[i];}
//			System.out.println(largest);
//		}
//			System.out.println(largest);
		for(int num:nums) {
			if(num>largest) {largest=num;}
			System.out.println(largest);
		}
		System.out.println(largest);
		}
}
		
		