package com.jsp.Arrays;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= new int[5];
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter an int value");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
				
	}
}
