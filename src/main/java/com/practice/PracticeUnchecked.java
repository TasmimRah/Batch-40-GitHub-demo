package com.practice;

public class PracticeUnchecked {
	int a= 10;
	public void getmoney() {
		System.out.println(a);
		System.out.println(a+1); 
		try {
			System.out.println(a/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("bye");   
	}
	public static void main(String[] args) {
		PracticeUnchecked obj = new PracticeUnchecked();
		obj.getmoney();
	}  

}
