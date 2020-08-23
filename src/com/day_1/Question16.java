package com.day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ArrayList<Test> al= new ArrayList<>();
		for(int i=0;i<2;i++) {
			System.out.println("Enter testid");
			int testid=sc.nextInt();
			System.out.println("Enter Student id");
			int studid=sc.nextInt();
			int m[]= new int[2];
			for(int j=0;j<m.length;j++) {
				System.out.println("Enter marks");
				m[j]=sc.nextInt();
			}
			al.add(new Test(testid, studid, m));
		}
		
		TreeSet<Student16> ts= new TreeSet<>();//comparable in test class
		
		for(int i=0;i<al.size();i++) {
			
			int id=al.get(i).sid;
			int total=0;
			
			for(int j=0;j<al.get(i).marks.length;j++) {
				total=total+al.get(i).marks[j];
			}
			ts.add(new Student16(id, total));
		}
		
		System.out.println(ts);

	}

}

class Student16 implements Comparable<Student16>{
	int sid;
	int totalmarks;
	public Student16(int sid, int totalmarks) {
	
		this.sid = sid;
		this.totalmarks = totalmarks;
	}
	@Override
	public String toString() {
		return "Student16 [sid=" + sid + ", totalmarks=" + totalmarks + "]";
	}
	@Override
	public int compareTo(Student16 o) {
		// TODO Auto-generated method stub
		return o.totalmarks-this.totalmarks;
	}
		
}

class Test{
	int tid;
	int sid;
	int marks[];
	public Test(int tid, int sid, int[] marks) {
		this.tid = tid;
		this.sid = sid;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Test [tid=" + tid + ", sid=" + sid + ", marks=" + Arrays.toString(marks) + "]";
	}

	
	
	
	
}
