package com.day_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Student, Integer> stud= new HashMap<>();
		
		stud.put(new Student(101, "abc", "java"), 66);
		stud.put(new Student(101, "xyz", "java"), 58);
		stud.put(new Student(101, "pqr", "angular"), 91);
		stud.put(new Student(101, "qwerty", "java"), 88);
		stud.put(new Student(101, "skj", "angular"), 33);
		stud.put(new Student(101, "jkl", "java"), 41);
		stud.put(new Student(101, "mno", "angular"), 75);
		
		HashSet<Student> java= new HashSet<>();
		HashSet<Student> angular= new HashSet<>();
		
		Set s= stud.entrySet();
		Iterator itr= s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry e=(Entry) itr.next();
			Student s1=(Student) e.getKey();
			Integer mark=(Integer) e.getValue();
			if(s1.course.equalsIgnoreCase("java")){
				
				if(mark>50) {
					java.add(s1);
				}
			}
			
			else if(s1.course.equalsIgnoreCase("angular")) {
				
				if(mark>60) {
					angular.add(s1);
				}
			}
		}
		
		System.out.println(java);
		System.out.println(angular);



	}

}
