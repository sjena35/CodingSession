package com.day_1;

import java.util.Arrays;

public class Customer implements Comparable<Customer> {
	int cid;
	String name;
	int item;
	public Customer(int cid, String name, int item) {
	
		this.cid = cid;
		this.name = name;
		this.item = item;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", item=" + item + "]";
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.item-o.item;
	}
	
	
	
	

}
