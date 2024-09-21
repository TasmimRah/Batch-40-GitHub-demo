package com.practice;

public class PracticeLoop { 
	public void getmoney() {
		for(int i=0;i<=100;i++)
			System.out.println(i); 
	}
	public void getclass() {
		for(int j=100;j>=0;j--)
			System.out.println(j); 
	}
	public void getpool() {
		for(int i=0;;i++) {
			System.out.println(i); 
		if (i==300)
				 break;
		}
	}
	public static void main(String[] args) {
		PracticeLoop obj = new PracticeLoop();
//obj.getmoney();
//obj.getclass();
		obj.getpool();
	} 
		 
}
