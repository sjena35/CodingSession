package com.day_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Question_2 {
	
	public static boolean OrderCheck(ArrayList<String> al, LinkedHashMap<String, Integer> hm) {
		boolean flag=true;
		
		for(int i=0; i<al.size();i++) {
			if(flag==true) {
				Set s=hm.entrySet();
				Iterator itr= s.iterator();
				
				while(itr.hasNext()) {
					Map.Entry e=(Entry) itr.next();
					String str=(String) e.getKey();
					if(str.equals(al.get(i))) {
						flag=true;
						break;
					}
					
					else {
						flag=false;
						itr.remove();
					}
					
				}
			}
		}
		
		return flag;
		
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		LinkedHashMap<String, Integer> lm= new LinkedHashMap<>();
		
		for(int i=0;i<4;i++) {
			System.out.println("Enter String");
			String s=sc.next();
			System.out.println("Enter Number");
			int n=sc.nextInt();
			lm.put(s,n);
		}
		
		ArrayList<String> al= new ArrayList<>();
		
		for(int i=0;i<2;i++) {
			System.out.println("Enter String");
			al.add(sc.next());
			
		}
		
		System.out.println(OrderCheck(al, lm));

	}

}
