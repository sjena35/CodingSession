package com.day_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<BookSale> al = new ArrayList<>();

		al.add(new BookSale(new Book(101, "abc", 100f), 6));
		al.add(new BookSale(new Book(102, "xyz", 100f), 3));
		al.add(new BookSale(new Book(103, "pqr", 300f), 6));
		al.add(new BookSale(new Book(104, "qwerty", 1000f), 8));
		al.add(new BookSale(new Book(105, "tiger", 200f), 2));

		HashMap<Integer, Float> hm = new HashMap<>();

		hm.put(101, 500f);
		hm.put(103, 1000f);
		hm.put(104, 5000f);

		Set s = hm.entrySet();

		for (int i = 0; i < al.size(); i++) {
			BookSale bs = al.get(i);
			int id = bs.b.bookid;
			float price = bs.b.price;
			int sold = bs.copiesSold;
			float amt = price * sold;

			Iterator itr = s.iterator();

			while (itr.hasNext()) {
				Map.Entry e = (Entry) itr.next();
				int mid = (int) e.getKey();
				float mamount= (float) e.getValue();
				if (mid == id) {
					amt=mamount+amt;
				}
			}
			
			hm.put(id, amt);
		}
		
		System.out.println(hm);

	}
	

}
