package com.cg.exception;

import java.util.Scanner;

// exception using finally block
public class ExceptionFinallyBlock 

{

	
            public static void main(String []aggrs)
            {
            	Scanner sc=new Scanner(System.in);
            	int a=sc.nextInt();
            	int b=sc.nextInt();
            	
            
            		try 
            		{
            			//throw exception if b=0 .otherwise it not throw any exception
            			System.out.println("Enter the value of a :");
            			System.out.println("Enter the value of b :");
						System.out.println(a/b);// 
					} 
            		
            		// Catch block excite only when try throw exception
            		catch ( ArithmeticException e)
            		{
						System.out.println("Arithematic exception accure");
					}
            		
            		//Finally block excuite any conditon
            	finally
            	{
            		System.out.println("Program will be excuite succesfully");
            	}
            }
}
