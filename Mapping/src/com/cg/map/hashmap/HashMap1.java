package com.cg.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String [] aggrs)
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Declare HashMap 
		map.put(1, "Java");
		map.put(2, "WebTech");
		map.put(3, "C#");
		map.put(4, "pythone");
		map.put(5, "c");
		
		System.out.println("HashMap:"+map);
       
		// Display hashMap Using for loop
		
		System.out.println("  ");
	
		  for(Map.Entry m : map.entrySet())
		  {    
			    System.out.println("HashMap:"+m.getKey()+" "+m.getValue());    
		  }
	}
}
