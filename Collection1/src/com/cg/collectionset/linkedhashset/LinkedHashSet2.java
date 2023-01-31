package com.cg.collectionset.linkedhashset;

import java.util.*;  
public class LinkedHashSet2
{  
 public static void main(String args[])
 {  
  LinkedHashSet<String> set=new LinkedHashSet<String>(); 
  
  set.add("Ajay");  
  set.add("Vijay");  
  set.add("Ravi");  
  set.add("Ajay"); 
  
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
   
   
// Removing an element from the above linked Set  
   System.out.println(set.remove("Ajay"));  
   
// After removing the element  
System.out.println("After removing the element, the hash set is: " + set);

  }  
 }  
}  