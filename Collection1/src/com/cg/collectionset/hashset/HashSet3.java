package com.cg.collectionset.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSet3 {

   
    public static void main(String[] args)
    {
       
        Set<String> list= new HashSet<String>();
  
      
        list.add("Java");
        list.add("WebTech");
        list.add("C");
        list.add("Pythone");
  
        // Print the Set object elements
        System.out.println("Set is " + list);
  
        // Declaring a string
        String check = "C";
  
        // Check if the above string exists in
        // the SortedSet or not
        // using contains() method
        System.out.println("Contains " + check + " "+ list.contains(check));
        
        // Removing custom element
        // using remove() method
        list.remove("Java");
  
        // Printing Set elements after removing an element
        // and printing updated Set elements
        System.out.println("After removing element " + list);
        
        
        
        
     // Iterating through the Set
        // via for-each loop 
        for (String value : list)
  
            // Printing all the values inside the object 
            System.out.print(value + ", ");
          
        System.out.println();
    }

}
