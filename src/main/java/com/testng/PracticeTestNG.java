package com.testng;

import org.testng.annotations.Test;

public class PracticeTestNG {
@Test(priority=0,groups = {"smoke","regression"})
public void getLogin(){
	System.out.println("Login.");
	
}
@Test(priority=1,dependsOnMethods = {"getLogin"})
public void getCart(){
	System.out.println("Cart.");       
}
@Test(priority=2,groups = {"smoke"})
public void getsearch(){
	System.out.println("Search.");       
}
@Test(priority=3)
public void getpayment(){
	System.out.println("payment.");       
}
}
