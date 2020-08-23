package com.day_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Society> al= new ArrayList<>();
		al.add(new Society(1, 201,"abc"));
		al.add(new Society(2, 202,"skj"));
		al.add(new Society(3, 203,"xyz"));
		al.add(new Society(4, 202,"pqr"));
		al.add(new Society(5, 202,"mno"));
		al.add(new Society(6, 201,"qwerty"));
		
		HashMap<Integer, ArrayList<String>> hm= new HashMap<>();
		
		for(int i=0;i<al.size();i++) {
			int flatno=al.get(i).wing_Flatno;
			ArrayList<String> member=new ArrayList<>();
			member.add(al.get(i).name);
			for(int j=i+1;j<al.size();j++) {
				if(flatno==al.get(j).wing_Flatno) {
					member.add(al.get(j).name);
					al.remove(j);
					j--;
				}
			}
			
			hm.put(flatno, member);
			
		}
		
		System.out.println(hm);
		

	}

}
