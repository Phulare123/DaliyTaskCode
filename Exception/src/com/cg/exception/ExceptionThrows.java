package com.cg.exception;

import java.util.Scanner;

public class ExceptionThrows 
{
	//Defing the method
		public static  void divisibleByTwo( int num)throws NumberFormatException 
		{
			if(num%2!=0) 
			{
				throw new NumberFormatException(" Number is not divisible by 2");
			}
				
			else 
			{
				System.out.println("Number is divisible by 2");
			}
			
		}
		
	    public static void main(String[] args)
	    {
	    	//Define the Scanner class
	    	Scanner sc=new Scanner(System.in);
	    	int xy=sc.nextInt();
	    	
	    	//Take the input form User
	        System.out.println("Enter the value of xy:");
	        // Pass the number
	        divisibleByTwo(xy);
	    	
		
	}
}
