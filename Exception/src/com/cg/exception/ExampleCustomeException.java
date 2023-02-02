package com.cg.exception;

import java.util.Scanner;

public class ExampleCustomeException  
{  
  
    // method to check the age  
    static void divisible(int num) throws InvalNumberException{    
       if(num/2!=0){  
  
        // throw an object of user defined exception  
        throw new InvalNumberException("Number is not divisible by 2");    
    }  
       else {   
        System.out.println("Done");   
        }   
     }    
  
    // main method  
    public static void main(String args[])  
    {  
    	
    	Scanner sc=new Scanner(System.in);
	    int sr=sc.nextInt();
	    
	    System.out.println("enter the  Number sr");
	  
 
        try  
        {  
         
            divisible(sr);  
        }  
        catch (InvalNumberException ex)  
        {  
            System.out.println("InvalidnumberException");  
    
              
            System.out.println("InvalidException: " + ex);  
        }  
  

    }  
}  