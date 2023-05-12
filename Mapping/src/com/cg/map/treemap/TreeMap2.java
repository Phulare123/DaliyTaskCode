package com.cg.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap2 
{
	public static void main(String args[])
	 {  
	   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(1,"java");    
	      map.put(2,"pythone");    
	      map.put(3,"webtech");    
	      map.put(4,"C#");    
	        
	      System.out.println("TreeMap:"+map);
	      
	     //map in descending order
	      map.descendingKeySet();
	      for(Map.Entry m:map.entrySet())
	      {    
	       System.out.println( m.getKey()+" "+m.getValue());    
	      }  //display map after removing element
	      
	      //Display the which is less than given elements
	      
	      System.out.println("TreeMap:"+map.headMap(2, true));
	      
	      //Display the which is greater  than given elements
	  
	      System.out.println("TreeMap:"+map.tailMap(2, false));
	      
	   
	      
	      
	      
	      
	      
	 }  
	
	
	

}
