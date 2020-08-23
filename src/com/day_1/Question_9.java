package com.day_1;

import java.util.ArrayList;

public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> al= new ArrayList<>();
		al.add(new Employee(101, "abc", 103));
		al.add(new Employee(102, "xyz", 101));
		al.add(new Employee(103, "pqr", 105));
		al.add(new Employee(104, "mno", 102));
		al.add(new Employee(105, "qwerty", 104));
		
		for(int i=0;i<al.size();i++) {
			Employee e=al.get(i);
			String n=e.name;
			int mid=e.mngid;
			
			for(int j=0;j<al.size();j++) {
				Employee e1=al.get(j);
				
				int id=e1.eid;
				if(id==mid) {
					System.out.println(n+" "+e1.name);
					break;
				}
			}
		}
		

	}

}
