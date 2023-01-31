package com.cg.map.treemap;
import java.util.*;  


public class TreeMap1{  
 public static void main(String args[])
 {  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(1,"java");    
      map.put(2,"pythone");    
      map.put(3,"webtech");    
      map.put(4,"C#");    
        
      System.out.println("TreeMap:"+map);
      
      //Display elements using eachforloop
      for(Map.Entry m:map.entrySet())
      {    
       System.out.println( m.getKey()+" "+m.getValue());    
      } 
      
      //remove elements for the map using remove method
     
      map.remove(2);
      
      for(Map.Entry m:map.entrySet())
      {    
       System.out.println( m.getKey()+" "+m.getValue());    
      }  //display map after removing element
      
      
      
      
 }  
}  
