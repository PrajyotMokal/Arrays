package com.jsp.Arrays;

public class LargestNumber {
	public static void main(String[] args) {
		int a[]= {1,5,8,9,6,3};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
