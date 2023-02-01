package com.cg.exception;
// Arithmetic exception 
public class Exception1 
{
	
	 public static void main (String[] args) 
	 {
	      int a=11;
	      int b=0;
	        try
	        {
	          System.out.println(a/b);
	        }
	      catch(ArithmeticException e)
	        {
	        System.out.println(e.toString());
	      }
	    }

}
