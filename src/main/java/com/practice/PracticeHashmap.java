package com.practice;

import java.util.HashMap;
import java.util.Map;

public class PracticeHashmap {
	public Map<String, Integer> getvalue() {
		Map<String,Integer> mymap = new HashMap<>();
		mymap.put("Tasmim", 100);
		mymap.put("Wasim", 200);
		System.out.println(mymap);  
		return mymap;
	}
	public static void main(String[] args) {
		
		PracticeHashmap obj = new PracticeHashmap();
		obj.getvalue();
	} 

}
