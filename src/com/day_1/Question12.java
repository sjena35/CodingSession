package com.day_1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm= new HashMap<>();
		hm.put("a1234rr", "bjp");
		hm.put("a1237r4", "shivsena");
		hm.put("a12i34", "shivsena");
		hm.put("a1u234", "ncp");
		hm.put("at1234", "congress");
		hm.put("ad1234", "shivsena");
		hm.put("ab1234", "bjp");
		
		Collection<String> temp=hm.values();
		HashSet<String> hs= new HashSet<>(temp);
		System.out.println(hs);
		
		HashMap<String, Integer> votes= new HashMap<>();
		
		Iterator itr=hs.iterator();
		Set s=hm.entrySet();
		
		while(itr.hasNext()) {
			String party=(String) itr.next();
			int cnt=0;
			
			Iterator itr1=s.iterator();
			
			while(itr1.hasNext()) {
				Map.Entry m=(Entry) itr1.next();
				String party1=(String) m.getValue();
				
				if(party.equals(party1)) {
					cnt++;
				}
			}
			
			votes.put(party, cnt);
		}
		
		
		System.out.println(votes);
		
		
		

	}

}
