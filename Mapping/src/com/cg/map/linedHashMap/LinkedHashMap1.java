package com.cg.map.linedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {
	public static void main(String [] Aggr)
	{
		
		//Declare LinkedHashmap
		
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();  
         map.put(1, "WebTech");
         map.put(2, "Java");
         map.put(3, "Pythone");
         map.put(4, "C");
         
         System.out.println("Map="+map);
         
         //Display the map Using eachForLoop
         for(Map.Entry m:map.entrySet())
         {
        	System.out.println("Map:"+m.getKey()+" "+m.getValue()); 
         }
         
         

         
	    
	
	}
}
