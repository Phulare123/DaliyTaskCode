package com.cg.collectionset.sortedset;

import java.util.*;

class SortedSetExample{
  
    public static void main(String[] args)
    {
        SortedSet<String> set= new TreeSet<String>();
  
        // Adding elements into the TreeSet
        // using add()
        set.add("India");
        set.add("Australia");
        set.add("South Africa");
  
        // Adding the duplicate import java.util.*;
        


        
        set.add("India");
  
        // Displaying the TreeSet
        System.out.println(set);
  
        // Removing items from TreeSet
        // using remove()
        set.remove("Australia");
        System.out.println("Set after removing "  + "Australia:" + set);
  
        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> i = set.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}