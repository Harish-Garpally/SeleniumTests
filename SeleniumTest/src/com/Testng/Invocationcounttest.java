package com.Testng;

import org.testng.annotations.Test;

public class Invocationcounttest {

	//@Test(invocationCount=12) // we can use invocation timeout annotation if we want to run a particular testcase for certain time 
	//public void sum() {
		
		//int a =10;
		//int b=27;
		//int c=a+b;
		
		//System.out.println("sum of a and b  is " + c);
	//}
	
	@Test(expectedExceptions=NumberFormatException.class)
	
	public void test1() {
		
		String A = "1100A";
		Integer.parseInt(A);
		
		
	}
	
}
