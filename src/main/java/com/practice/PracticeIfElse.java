package com.practice;

public class PracticeIfElse {
	public void getmoney(String name) {
		if(name.contains("can")) {
			System.out.println("this is canada");      
		}else if (name.contains("usa")){
			System.out.println("this is usa");     
		}else {
			System.out.println("not found");   
		}
	}
	public static void main(String[] args) {
		PracticeIfElse obj = new PracticeIfElse();
				obj.getmoney("can");
				obj.getmoney("Ta2mk");
		
	} 
		
}
