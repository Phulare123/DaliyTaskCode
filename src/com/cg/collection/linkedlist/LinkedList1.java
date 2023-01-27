package com.cg.collection.linkedlist;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList<String> list = new LinkedList<String>();
  
        // Adding elements to the linked list
        list.add("Java");
        list.add("c++");
        list.addLast("Web tech");
        list.addFirst("Python");
        
        
        System.out.println("list="+list);
        
        //Replace the element form the index
        list.add(2, "C");
  
        System.out.println(list);
  
        //Remove java form the list
        list.remove("Java");
        System.out.println(list);
        
        


        
        //Remove the element form index 3
        list.remove(3);
        System.out.println(list);
        
        
        //remove first element form the list
        list.removeFirst();
        System.out.println(list);
        
        //remove last element form the list
        list.removeLast();
  
        System.out.println(list);
        
        
        
     // Using the Get method and the 
        // for loop 
        for (int i = 0; i < list.size(); i++) { 
            
            System.out.print(list.get(i) + " "); 
        } 
    
        System.out.println(); 
    
        // Using the for each loop 
        for (String str : list) 
            System.out.print(str + " "); 
        
    }

}
