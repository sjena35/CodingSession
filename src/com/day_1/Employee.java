package com.day_1;

public class Employee {
	
	int eid;
	String name;
	int mngid;
	public Employee(int eid, String name, int mngid) {
	
		this.eid = eid;
		this.name = name;
		this.mngid = mngid;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", mngid=" + mngid + "]";
	}
	
	
	
	

}
