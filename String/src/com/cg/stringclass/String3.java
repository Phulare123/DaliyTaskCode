package com.cg.stringclass;

import java.util.Scanner;

public class String3 
{
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		String l1=sc.nextLine();	
		String l2=sc.nextLine();
		
		System.out.println("Enter string l1:");
		
		System.out.println(l1);
		
		System.out.println("Enter string l2:");
		System.out.println(l2);
		
		
		System.out.println("String l1"+l1);
		System.out.println("String l2"+l2);
		
		String l3=l1.concat(l2);
		System.out.println("String l3"+l3);
		
	}

}
