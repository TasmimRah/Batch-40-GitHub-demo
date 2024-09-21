package com.practice;

public class PublicVariable {
	int a = 4;
	int b =3;
	boolean c = true;
	double d = 3.44;
	String e = "hi";
	static int f = 9;
public void getmoney() {
	System.out.println(a+b);  
}
public void getteacher() {
	System.out.println(d); 
	System.out.println(f); 
}
public static void getstudent() {
	System.out.println(f); 
}
public static void main(String[] args) {
	PublicVariable obj = new PublicVariable();
	obj.getmoney();
	obj.getteacher();
	getstudent();
} 
}
