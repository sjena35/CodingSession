package com.day_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Student6> hs= new HashSet<>();
		hs.add(new Student6(1, "abc", 66));
		hs.add(new Student6(2, "xyz", 88));
		hs.add(new Student6(3, "pqr", 88));
		hs.add(new Student6(4, "qwerty", 88));
		hs.add(new Student6(5, "mno", 66));
		hs.add(new Student6(6, "jkl", 77));
		
		HashMap<Integer, ArrayList<Integer>> hm= new HashMap<>();
		
		Iterator itr= hs.iterator();
		HashSet<Integer> temp= new HashSet<>();
		
		while(itr.hasNext()) {
			Student6 s=(Student6)itr.next();
			Integer m=s.marks;
			temp.add(m);
		}
		
		Iterator itr1=temp.iterator();
		
		while(itr1.hasNext()) {
			Integer m=(Integer) itr1.next();
			ArrayList<Integer> al= new ArrayList<>();
			
			Iterator itr2=hs.iterator();
			
			while(itr2.hasNext()) {
				Student6 s=(Student6) itr2.next();
				Integer m1=s.marks;
				if(m==m1) {
					al.add(s.rollno);
				}
			}
			
			hm.put(m, al);
		}
		
		System.out.println(hm);
	}
		

}
