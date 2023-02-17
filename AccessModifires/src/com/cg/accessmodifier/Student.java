package com.cg.accessmodifier;

public class Student 
{
//	public access modifier 
	public static int rollNumber;
	
	public Student()
	{
		rollNumber=100;
		
	}
	
	public static void printNumebr()
	{
		System.out.println("Number"+rollNumber);
		
	}
	
	public void abc()
	{
		printNumebr();
	}

}
