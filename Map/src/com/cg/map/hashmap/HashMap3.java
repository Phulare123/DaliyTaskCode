package com.cg.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 
{
	public static void main(String [] aggrs)
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Declare HashMap 
		map.put(1, "Java");
		map.put(2, "WebTech");
		map.put(3, "C#");
		map.put(4, "pythone");
		map.put(5, "c");
			       
	
		System.out.println("HahsMap:"+map);
		
		// Remove Element based on key
		map.remove(3);
		System.out.println("Map After removing value based on kay value ="+map);
		
		// Remove Element based on value
				map.remove(2);
				System.out.println("Map After removing value based on value ="+map);
	
				// Remove Element based on key -value paring
				map.remove(5,"c");
				System.out.println("Map After removing value based on kay value paring ="+map);
		   
				//Replace the element
				map.replace(1, "pythone");
				System.out.println("Map After replacing element ="+map);
		  }

}
