package com.cg.map.hashmap;


	import java.util.HashMap;
	import java.util.Map;

	public class HashMap2 {

		public static void main(String [] aggrs)
		{
			HashMap<Integer,String> map=new HashMap<Integer,String>();//Declare HashMap 
			map.put(1, "Java");
			map.put(2, "WebTech");
			map.put(3, "C#");
			map.put(4, "pythone");
			map.put(5, "c");
				       
		
			System.out.println("HahsMap:"+map);
		// Add  element using putIfAbsent()
			map.putIfAbsent(6, "C++");
			
			System.out.println("  ");
		
			  for(Map.Entry m : map.entrySet())
			  {    
				    System.out.println("HashMap:"+m.getKey()+" "+m.getValue());    
			  }
			  
			 //add map to other using add all method
			  
			   HashMap<Integer,String> map1=new HashMap<Integer,String>();
			   map1.putAll(map);
			   
			   System.out.println("HashMap Map1="+map1);
			  }
	}



