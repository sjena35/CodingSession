package com.day_1;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l= new LinkedList<>();
		l.add(3);
		l.add(6);
		l.add(8);
		l.add(4);
		
		Collections.sort(l);
		
		int j=0;
		
		for(int i=l.get(0);i<l.get(l.size()-1);i++) {
			
			if(i!=l.get(j)) {
				System.out.println(i);
			}
			else {
				j++;
			}
			
			
			
		}

	}

}
