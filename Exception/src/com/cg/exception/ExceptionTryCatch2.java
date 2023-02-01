package com.cg.exception;

import java.util.Scanner;

public class ExceptionTryCatch2 
{
	
	
		  public  static void checkAge(int age) {
		    if (age < 18)
		    
		    {
		      throw new ArithmeticException("Your age not  to access .");
		    }
		    else {
		      System.out.println("You age is enough to access");
		    }
		  }

		  public static void main(String[] args) {
			  
			  Scanner sc=new Scanner(System.in);
			  int sr=sc.nextInt();
			  System.out.println("enter the  Age");
			  
		    checkAge(sr);
		  }
		}
	


