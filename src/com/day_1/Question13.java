package com.day_1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		LinkedHashSet<Student13> hs= new LinkedHashSet<>();
		hs.add(new Student13(1, "abc"));
		hs.add(new Student13(2, "xyz"));
		hs.add(new Student13(3, "mno"));
		hs.add(new Student13(4, "pqr"));
		hs.add(new Student13(5, "qwerty"));
		System.out.println(hs);
		
		LinkedHashSet<Student13> hs1= new LinkedHashSet<>();
		
		hs1.add(new Student13(4, "pqr"));
		hs1.add(new Student13(5, "qwerty"));
		hs1.add(new Student13(3, "mno"));
		hs1.add(new Student13(1, "abc"));
		hs1.add(new Student13(2, "xyz"));
		System.out.println(hs1);
		
		System.out.println("Enter student id");
		int id=sc.nextInt();
		
		Iterator itr=hs.iterator();
		int cnt=0;

		
		while(itr.hasNext()) {
			Student13 s=(Student13) itr.next();
			cnt++;
			if(s.sid==id) {
				break;
			}
		}
		
		Iterator itr1=hs1.iterator();
		int cnt1=0;
		
		while(itr1.hasNext()) {
			Student13 s1=(Student13) itr1.next();
			cnt1++;
			if(s1.sid==id) {
				break;
			}
		}
		
		if(cnt1==cnt) {
			System.out.println("Same position");
		}
		
		else {
			System.out.println("position not same");
		}

	}

}
