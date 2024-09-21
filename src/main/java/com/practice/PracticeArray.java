package com.practice;

import java.util.Arrays;

public class PracticeArray {
int[] a = {3,20};
int[] b= {10,20,22};
int[][]c = {a,b};
public void getarray() {
	System.out.println(Arrays.toString(b));  
	System.out.println(Arrays.deepToString(c));  
}
public static void main(String[] args) {
	PracticeArray pa = new PracticeArray();
	pa.getarray();
} 
}
