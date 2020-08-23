package com.day_1;

import java.util.LinkedList;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list1= new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		LinkedList<Integer> list2= new LinkedList<>();
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);
		list2.add(55);
		list2.add(66);
		
		LinkedList<Integer> list3= new LinkedList<>();
		
		if(list1.size()>list2.size()) {
			int i=0;
			
			while(i<list2.size()) {
				list3.add(list1.get(i));
				list3.add(list2.get(i));
				i++;
			}
			
			while(i<list1.size()) {
				list3.add(list1.get(i++));
			}
		}
		
		if(list2.size()>list1.size()) {
			int i=0;
			
			while(i<list1.size()) {
				list3.add(list1.get(i));
				list3.add(list2.get(i));
				i++;
			}
			
			while(i<list2.size()) {
				list3.add(list2.get(i++));
			}
		}
		
		System.out.println(list3);

	}

}
