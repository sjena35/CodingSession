package com.day_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Theatre> al= new ArrayList<>();
		al.add(new Theatre(1,"pvr", "pune", new Movie(101,"inception", 10)));
		al.add(new Theatre(2,"pvr", "pune", new Movie(102,"pulp fiction", 9)));
		al.add(new Theatre(3,"pvr", "delhi", new Movie(103,"avengers", 5)));
		al.add(new Theatre(4,"inox", "mumbai", new Movie(104,"highwayman", 9)));
		al.add(new Theatre(5,"pvr", "pune", new Movie(105,"skdd", 6)));
		
		Collections.sort(al,new MovieComparator());
		
		System.out.println(al);

	}

}

class MovieComparator implements Comparator<Theatre>{

	@Override
	public int compare(Theatre o1, Theatre o2) {
		// TODO Auto-generated method stub
		if(o1.m.rating==o2.m.rating) {
			return o1.theatrename.compareTo(o2.theatrename);
		}
		
		else {
			return o1.m.rating-o2.m.rating;
		}
	}
	
}
