package com.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class PracticeLinkedHashSet {
public Set<Integer> getvalue() {
	Set<Integer> myset = new LinkedHashSet<Integer>();
	myset.add(99);
	myset.add(98);
	myset.add(100);
	System.out.println(myset);  
	return myset;
}
public static void main(String[] args) {
	
	PracticeLinkedHashSet obj = new PracticeLinkedHashSet();
	obj.getvalue();
} 

}
