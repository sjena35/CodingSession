package com.day_1;

import java.util.ArrayList;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Order> al= new ArrayList<>();
		al.add(new Order(1, "pav bhaji", 100f, 4));
		al.add(new Order(2, "dhokla", 150f, 2));
		al.add(new Order(3, "samosa", 200f, 4));
		al.add(new Order(4, "vada pav", 50f, 3));
		al.add(new Order(5, "samosa", 80f, 2));
		al.add(new Order(1, "pav bhaji", 50f, 6));
		al.add(new Order(1, "samosa", 100f, 5));
		
		for(int i=0;i<al.size();i++) {
			
			float sum=al.get(i).price*al.get(i).qtyOrdered;
			
			for(int j=i+1;j<al.size();j++) {
				
				if(al.get(i).ordername.equals(al.get(j).ordername)) {
					sum=sum+(al.get(j).price*al.get(j).qtyOrdered);
					al.remove(j);
					j--;
				}
			}
			
			System.out.println(al.get(i).ordername+" "+sum);
		}

	}

}
