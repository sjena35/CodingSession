package com.thinkitive;

import java.util.Scanner;

public class PalindromeSubString {
	
	static String str1="";
	static boolean flag=false;
	static int max=0;
	static String str2="";
	
	static void PalindromeCheck(String str,int i) {
	
		int p=str.lastIndexOf(str.charAt(i));
		
		if(p!=i) {
			flag=true;
			for(int j=i;j<str.length();j++) {
				for(int k=p;k>=0;k--) {
					if(j<=k) {
						if(str.charAt(j)!=str.charAt(k)) {
							flag=false;
							break;
						}
						else {
							j++;
						}
					}
				}
				
				if(flag) {
					str1=str.substring(i,p+1);
					if(max<str1.length()) {
						max=str1.length();
						str2=str1;
					}
					
				}
				
				else {
					break;
				}
				
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(flag==false) {
				PalindromeCheck(str, i);
			}
			else {
				System.out.println(str2);
				break;
			}
		}

	}

}
