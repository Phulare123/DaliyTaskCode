package com.cg.stringbulider;

public class StringBuilderExample1 {
	
	public static void main(String[] args)
    {
 
        // create a StringBuilder object,
        // default capacity will be 16
        StringBuilder str = new StringBuilder();
 
        // get default capacity
        int capacity = str.capacity();
 
        System.out.println("Default Capacity of StringBuilder = " + capacity);
 
        // add the String to StringBuilder Object
        str.append("Hello");
 
        // get capacity
        capacity = str.capacity();
 
        // print the result
        System.out.println("StringBuilder = " + str);
        System.out.println("Current Capacity of StringBuilder = "+ capacity);
        

        // get char at position 1
        char ch = str.charAt(1);
        
        System.out.println("Character at Position 1"+ " in StringBuilder = " + ch);
    }

}
