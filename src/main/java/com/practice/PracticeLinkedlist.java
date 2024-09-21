package com.practice;

import java.util.LinkedList;
import java.util.List;

public class PracticeLinkedlist {
	public List<Integer> getvalue() {
		List<Integer> mylist = new LinkedList<>();
		mylist.add(10);
		mylist.add(90);
		mylist.add(100);
		System.out.println(mylist); 
		return mylist;
	}
public static void main(String[] args) {
		
		PracticeLinkedlist obj = new PracticeLinkedlist ();
		obj.getvalue();
	} 

	 
}
