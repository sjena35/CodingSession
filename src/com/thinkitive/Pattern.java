package com.thinkitive;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n+i;j++) {
				if(j<n-i-1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}

	}

}
