package com.practice;

public class PracticeCheckedException {
	public void getvalue() {
		System.out.println("hello"); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("world");    
	}
public static void main(String[] args) {
	PracticeCheckedException obj = new PracticeCheckedException();
	obj.getvalue();
} 
}

