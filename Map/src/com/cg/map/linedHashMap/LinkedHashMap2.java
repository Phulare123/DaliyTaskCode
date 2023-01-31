package com.cg.map.linedHashMap;

import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMap2 
{
	public static void main(String aggrs[])
	{
		
		  //Creating map of cars    
	    Map<Integer,Car> map=new TreeMap<Integer,Car>();  
	    
	    Car car=new Car("CA1",50000,"Tesla");
	    Car car1=new Car("CA2",200000,"Honda");
	    Car car2=new Car("CA3",1000000,"Jaguar");
	    Car car3=new Car("CA4",1000000,"Kia");
	   
        map.put(0, car3);
	    map.put(1, car2);
	    map.put(2, car1);
        map.put(3, car);
        
        //display map
        System.out.println(map);
      //Traversing map  
        for(Map.Entry<Integer, Car> entry:map.entrySet()){    
            int key=entry.getKey();  
            Car b=entry.getValue();  
            System.out.println(key+" Details:");  
            System.out.println(b.getCarId()+" "+b.getCarName()+" "+b.getCarPrice());   
        }  
        
        Car car5=new Car("C6",150000,"Volvo");
        
        map.replace(0, car3, car5);
     
        for(Map.Entry<Integer, Car> entry:map.entrySet()){    
            int key=entry.getKey();  
            Car b=entry.getValue();  
            System.out.println(key+" Details:");  
            System.out.println(b.getCarId()+" "+b.getCarName()+" "+b.getCarPrice());   
        }  
        

        
        
        
         
	    
	    
		
	}

	

}
