package com.cg.collection.vector;

import java.util.Scanner;
import java.util.Vector;

public class Vector1 {
	 public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	        System.out.println("Enter the number:"+num);
	        
	  
	        // Declaring the Vector with
	        // initial size n
	        Vector<Integer> vec = new Vector<Integer>(num);
	  
	        
	        for (int i = 1; i <= num; i++)
	            vec.add(i);
	  
	        // display the elements
	        System.out.println(vec);
	  
	        // Remove element at index 2
	        vec.remove(2);
	  
	        // Displaying the vector
	        // after deletion
	        System.out.println(vec);
	  
	        // iterating over vector elements
	        // using for loop
	        for (int i = 0; i < vec.size(); i++)
	  
	            // Printing elements one by one
	            System.out.print(vec.get(i) + " ");
	        }
}
