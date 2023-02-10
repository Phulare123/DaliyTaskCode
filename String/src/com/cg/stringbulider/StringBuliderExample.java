package com.cg.stringbulider;

public class StringBuliderExample 

{
	
	public static void main(String[] args) {
		
		 StringBuilder str = new StringBuilder();// create object for String Builder using new keyword and contractor;
		 str.append("Hellow");
	
	        System.out.println("String = " + str.toString());
	 
	        // using StringBuilder(CharSequence) constructor
	        StringBuilder str1= new StringBuilder("java");
	 
	        // print string
	        System.out.println("String1 = " + str1.toString());
	 
	        // create a StringBuilder object
	        // using StringBuilder(capacity) constructor
	        StringBuilder str2 = new StringBuilder(10);
	 
	        // print string
	        System.out.println("String2 capacity = "+ str2.capacity());
	 
	        // create a StringBuilder object
	        // using StringBuilder(String) constructor
	        StringBuilder str3 = new StringBuilder(str1.toString());
	 
	        // print string
	        System.out.println("String3 = " + str3.toString());
	    }
	
		 
		
	}
	
	
	

	 

