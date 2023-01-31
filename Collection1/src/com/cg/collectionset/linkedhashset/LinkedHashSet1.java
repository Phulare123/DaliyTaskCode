package com.cg.collectionset.linkedhashset;
import java.util.*;  
class LinkedHashSet1{  
 public static void main(String args[])
 {  
 //Creating HashSet and adding elements  
        LinkedHashSet<String> set=new LinkedHashSet();  
               set.add("Mango");    
               set.add("Bannana");    
               set.add("orange");   
               
               Iterator<String> i=set.iterator();  
               while(i.hasNext())  
               {  
               System.out.println(i.next());  
               }  
               
               
 }  
}  