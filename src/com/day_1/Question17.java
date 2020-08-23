package com.day_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<>();
		al.add("D+22");
		al.add("A+8");
		al.add("DD+12");
		al.add("D+134");
		
		HashMap<String, Integer> hm= new HashMap<>();
		
		for(int i=0;i<al.size();i++) {
			
			String temp[]=al.get(i).split("\\+");
			String s=temp[0];
			int sum=Integer.parseInt(temp[1]);
			
			for(int j=i+1;j<al.size();j++) {
				String temp1[]=al.get(j).split("\\+");
				
				if(s.equals(temp1[0])) {
					sum=sum+Integer.parseInt(temp1[1]);
					al.remove(j);
					j--;
				}
			}
			
			hm.put(s, sum);
			
		}
		
		System.out.println(hm);
		
		

		}

	}



