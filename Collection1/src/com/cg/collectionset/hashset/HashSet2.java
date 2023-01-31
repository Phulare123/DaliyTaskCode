package com.cg.collectionset.hashset;

import java.util.*;  
class HashSet2{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
  HashSet<String> set=new HashSet<String>();  
  set.add("Java");    
  set.add("C#");    
  set.add("pythone");   
  set.add("webTech");  
  set.add("C#");  
  
  //Traversing elements   
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
	  // Hashset Ignore duplicate element
   System.out.println(itr.next());  
  }  
  
  
  //Removing specific element from HashSet  
  
  set.remove("webTech");  
  System.out.println("After invoking remove(object) method: "+set);  
  
  
  //Removing all the new elements from HashSet  
  set.removeAll(set);  
  System.out.println("After invoking removeAll() method: "+set);  
  
  
  //Removing all the elements available in the set  
  set.clear();  
  System.out.println("After invoking clear() method: "+set);  
 }  
}  