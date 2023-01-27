//Arraylist using iterator

package com.cg.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {
	 public static void main(String[] args)
	    {
	        // Create and populate the list
		 ArrayList<String> list = new ArrayList<>();
	  
	        list.add("Mango");
	        list.add("Orange");
	        list.add("Oriange ");
	        list.add("Banana");
	        list.add("pappaya");
	       
	        // Displaying the list
	        System.out.println("The list is=" + list);
	  
	        // Create an iterator for the list
	        // using iterator() method
	        Iterator<String> iter= list.iterator();
	  
	        // Displaying the values after iterating
	        // through the list
	        System.out.println("The iterator values"
	                           + " of list are: ");
	       
	        while (iter.hasNext()) {
	            System.out.print(iter.next() + " ");
	        }
	    }

}
