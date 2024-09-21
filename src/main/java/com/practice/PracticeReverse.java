package com.practice;

public class PracticeReverse {
	public void getmoney(String country) {
		for(int i = (country.length()-1);i>=0; i--) {
			System.out.println(country.charAt(i));   
		}
	}
		public void getReverseStringBuilder(String desh) {
			StringBuilder sb = new StringBuilder(desh);
			System.out.println(sb.reverse());   
		
	}
public static void main(String[] args) {
	PracticeReverse pr = new PracticeReverse();
	pr.getmoney("Bangladesh");
	pr.getReverseStringBuilder("Niju");
}   
}
