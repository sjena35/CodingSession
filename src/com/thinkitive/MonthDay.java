package com.thinkitive;

import java.util.ArrayList;
import java.util.Scanner;

public class MonthDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date=7;
		String day="tuesday";//to index 0 will be tuesday
		
		ArrayList<String> al= new ArrayList<>();
		al.add("tuesday");
		al.add("wednesday");
		al.add("thursday");
		al.add("friday");
		al.add("saturday");
		al.add("sunday");
		al.add("monday");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter date");
		int n= sc.nextInt();
		
		int index=n%7;
		
		System.out.println(al.get(index));
		
		

	}

}
