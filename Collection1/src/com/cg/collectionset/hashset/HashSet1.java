package com.cg.collectionset.hashset;
import java.util.*; 
class HashSet1{ 
	
	
  public static void main(String args[])
  {  
  
    HashSet<String> set=new HashSet();  
           set.add("Java");    
           set.add("C#");    
           set.add("pythone");   
           set.add("webTech");  
           set.add("C");  
           
           // Display element Using Iterator
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 } 
}