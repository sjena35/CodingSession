package com.thinkitive;

public class WorkingDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totaldays_A=60;//1 unit of work
		int totaldays_B=9;
		int totaldays_C=10;
		
		int unit=1;
		
		float workperday_A=unit/totaldays_A;
		float workperday_B=unit/totaldays_B;
		float workperday_C=unit/totaldays_C;
		
		float workbyB_C=workperday_B+workperday_C;
		
		float remainingwork=unit-(workbyB_C*3);
		
		float days=remainingwork/workperday_A;
		
	
		
		System.out.println(days);

	}

}
