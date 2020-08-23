package com.day_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Question18 {
	
static int[] get(ArrayList<String> al,String s) {
		
		int[] temp = new int[al.size()];
		int k=0;

		
		for(int i=0;i<al.size();i++) {
			
			String ss=al.get(i);
			String[] s1= ss.split("\\+");
			if(s1[0].equals(s)) {
				temp[k++]=Integer.parseInt(s1[1]);
	
		}
			
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<>();
		al.add("D+22");
		al.add("A+8");
		al.add("DD+12");
		al.add("D+134");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter");
		//char c=sc.next().charAt(0);
		String s= String.valueOf(sc.next().charAt(0));
		int[] arr= get(al, s);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}

	}


}
