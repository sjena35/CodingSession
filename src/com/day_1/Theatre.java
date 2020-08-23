package com.day_1;

public class Theatre {
	
	int theatreid;
	String theatrename;
	String location;
	Movie m;
	public Theatre(int theatreid, String theatrename, String location, Movie m) {
	
		this.theatreid = theatreid;
		this.theatrename = theatrename;
		this.location = location;
		this.m = m;
	}
	@Override
	public String toString() {
		return "Theatre [theatreid=" + theatreid + ", theatrename=" + theatrename + ", location=" + location + ", m="
				+ m + "]";
	}
	
	
	
	

}
