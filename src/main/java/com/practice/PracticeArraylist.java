package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeArraylist {
	public List<Integer> getvalue(){
		List<Integer> mylist = new ArrayList<>();
		mylist.add(2);
		mylist.add(8);
		mylist.add(80);
		System.out.println(mylist); 
		return mylist;
				
	}
	public static void main(String[] args) {
		
		PracticeArraylist obj = new PracticeArraylist ();
		obj.getvalue();
	} 

}
