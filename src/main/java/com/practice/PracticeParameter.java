package com.practice;

public class PracticeParameter {
	public void getmoney(int a,int b) {
		System.out.println(a+b);   
	}
	public static void main(String[] args) {
		PracticeParameter obj = new PracticeParameter(); 
		obj.getmoney(50, 30);
		obj.getmoney(30, 20);
	}  

}
