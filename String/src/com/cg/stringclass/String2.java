package com.cg.stringclass;

public class String2

{

	public static void main(String args[]) {
		//create String by literals
		
		String s1 = "java";
		//convert array into string
		char ch[] = { 'H', 'e', 'l', 'l', 'o' };
		
		//create string using new keywords
		String s2 = new String(ch);
		String s3 = new String(" welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
