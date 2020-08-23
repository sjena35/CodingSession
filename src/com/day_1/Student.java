package com.day_1;

public class Student {
	
	int sid;
	String name;
	String course;
	public Student(int sid, String name, String course) {

		this.sid = sid;
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}
	
	
	
	

}
