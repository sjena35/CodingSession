package com.day_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> cust = new ArrayList<>();

		cust.add(new Customer(101, "abc", 8));
		cust.add(new Customer(102, "skj", 6));
		cust.add(new Customer(101, "abc", 3));
		cust.add(new Customer(104, "xyz", 7));
		cust.add(new Customer(103, "pqr", 11));
		cust.add(new Customer(103, "pqr", 9));
		cust.add(new Customer(101, "abc", 2));

		HashSet<Customer> hs = new HashSet<>();

		for (int i = 0; i < cust.size(); i++) {

			int item1 = cust.get(i).item;
			int id = cust.get(i).cid;
			String n = cust.get(i).name;

			for (int j = i + 1; j < cust.size(); j++) {
				int item2 = cust.get(j).item;
				int id1 = cust.get(j).cid;

				if (id == id1) {
					item1 = item1 + item2;
					cust.remove(j);
					j--;
				}
			}

			hs.add(new Customer(id, n, item1));
		}

		TreeSet<Customer> ts = new TreeSet<>(hs);

		System.out.println(ts);

	}

}
