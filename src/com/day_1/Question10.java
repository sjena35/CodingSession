package com.day_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student10, ArrayList<Course10>> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
	
		int cid;
		for (int i = 0; i < 2; i++) 
		{			
			System.out.println("Enter Student name");
			String key = sc.next();
			ArrayList<Course10> al = new ArrayList<>();


			for (int j = 0; j < 2; j++) 
			{
				System.out.println("enter course id");
				cid = sc.nextInt();
				System.out.println("enter course name");
				String name = sc.next();
				
				al.add(new Course10(cid, name));
			}
			hm.put(new Student10(key), al);
		}
		System.out.println(hm);
		
		
		HashMap<Integer, ArrayList<Student10>> hm1 = new HashMap<>();
		
		HashSet<Integer> temp= new HashSet<>();
		
		Set s= hm.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry e=(Entry) itr.next();
			
			ArrayList<Course10> al=(ArrayList<Course10>) e.getValue();
			
			for(int i=0;i<al.size();i++) {
				Integer j=al.get(i).cid;
				temp.add(j);
			}
		}
		
		Iterator itr2=temp.iterator();
		Set s1=hm.entrySet();
		
		while(itr2.hasNext()) {
			Integer i=(Integer) itr2.next();
			ArrayList<Student10> alstudent=new ArrayList<>();

			
			Iterator itr1=s1.iterator();
			
			while(itr1.hasNext()) {
				Map.Entry e=(Entry) itr1.next();
				ArrayList<Course10> al=(ArrayList<Course10>) e.getValue();
				Student10 s2=(Student10) e.getKey();
				
				for(int j=0;j<al.size();j++) {
					Integer id=al.get(j).cid;
					if(id==i) {
						alstudent.add(s2);
						break;
					}
				}
				

			}
			
			hm1.put(i, alstudent);
		}
		
		System.out.println(hm1);
		
	
		

	}

}
