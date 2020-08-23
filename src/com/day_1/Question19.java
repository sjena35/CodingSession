package com.day_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Student19> hs= new HashSet<>();
		hs.add(new Student19(1,"abc","mca",2018,true));
		hs.add(new Student19(2,"skj","btech",2017,true));
		hs.add(new Student19(3,"xyz","btech",2019,false));
		hs.add(new Student19(4,"mno","mca",2018,true));
		hs.add(new Student19(5,"pqr","mca",2016,false));
		
		ArrayList<Student19> placedStudent= new ArrayList<>();
		ArrayList<Student19> unplacedStudent= new ArrayList<>();
		
		Iterator itr= hs.iterator();
		
		while(itr.hasNext()) {
			Student19 s=(Student19) itr.next();
			
			if(s.placed) {
				placedStudent.add(s);
			}
			
			else {
				unplacedStudent.add(s);
			}
		}
		
		System.out.println(placedStudent);
		System.out.println(unplacedStudent);

	}

}

class Student19{
	int sid;
	String name;
	String qualification;
	int yop;
	boolean placed;
	public Student19(int sid, String name, String qualification, int yop, boolean placed) {

		this.sid = sid;
		this.name = name;
		this.qualification = qualification;
		this.yop = yop;
		this.placed = placed;
	}
	@Override
	public String toString() {
		return "Student19 [sid=" + sid + ", name=" + name + ", qualification=" + qualification + ", yop=" + yop
				+ ", placed=" + placed + "]";
	}
	
	
	
	
}
