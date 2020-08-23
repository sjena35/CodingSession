package com.day_1;

public class Society {
	int memberid;
	int wing_Flatno;
	String name;
	public Society(int memberid, int wing_Flatno, String name) {
	
		this.memberid = memberid;
		this.wing_Flatno = wing_Flatno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Society [memberid=" + memberid + ", wing_Flatno=" + wing_Flatno + ", name=" + name + "]";
	}
	
	
	
	

}
