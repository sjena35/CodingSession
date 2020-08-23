package com.day_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Student8 s[]= new Student8[3];
		
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter Student id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String n=sc.next();
			
			ArrayList<String> al= new ArrayList<>();
			for(int j=0;j<2;j++) {
				System.out.println("Enter hobby");
				al.add(sc.next());
			}
			
			s[i]=new Student8(id, n,al);
		}
		
		HashSet<String> hs= new HashSet<>();
		
		for(int i=0;i<s.length;i++) {
			
			for(int j=0;j<s[i].hobby.size();j++) {
				hs.add(s[i].hobby.get(j));
			}
		}
		
		HashMap<String, ArrayList<Student8>> hm= new HashMap<>();
		
		Iterator itr =hs.iterator();
		
		int max=0;
		String maxh="";
		
		while(itr.hasNext()) {
			String h=(String) itr.next();
			ArrayList<Student8> al= new ArrayList<>();
			int cnt=0;
			
			for(int i=0;i<s.length;i++) {
				for(int j=0;j<s[i].hobby.size();j++) {
					
					if(s[i].hobby.get(j).equals(h)) {
						al.add(s[i]);
						cnt++;
						break;
					}
				}
			}
			
			hm.put(h, al);
			if(max<cnt) {
				max=cnt;
				maxh=h;
			}
		}
		
		System.out.println(hm);
		System.out.println(maxh);

	}

}
