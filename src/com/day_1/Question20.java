package com.day_1;

import java.util.ArrayList;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Player> al= new ArrayList<>();
		al.add(new Player(1, "ms dhoni", "india", "chennai super kings"));
		al.add(new Player(2, "steve smith", "australia", "chennai super kings"));
		al.add(new Player(3, "stark", "australia", "delhi daredevils"));
		al.add(new Player(4, "iyer", "india", "delhi daredevils"));
		al.add(new Player(5, "warner", "australia", "delhi daredevils"));
		
		int max=0;
		String maxteam="";
		
		for(int i=0;i<al.size();i++) {
			int cnt=0;
			String t=al.get(i).team;
			String c= al.get(i).country;
			
			if(c.equalsIgnoreCase("australia")) {
				cnt++;
			}
			
			for(int j=i+1;j<al.size();j++) {
				
				if(al.get(j).team.equalsIgnoreCase(t)) {
					if(al.get(j).country.equalsIgnoreCase("australia")) {
						cnt++;
					}
					al.remove(j);
					j--;
				}
			}
			
			if(cnt>max) {
				max=cnt;
				maxteam=t;
			}
			
		}
		
		System.out.println(maxteam);

	}

}

class Player{
	int pid;
	String name;
	String country;
	String team;
	public Player(int pid, String name, String country, String team) {
		
		this.pid = pid;
		this.name = name;
		this.country = country;
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", name=" + name + ", country=" + country + ", team=" + team + "]";
	}
	
	
	
	
}
