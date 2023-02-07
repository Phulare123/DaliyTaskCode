package com.cg.lambdaexperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExperation1 {
	 public static void main(String[] args) {    
	        List<Product> list = new ArrayList<Product>();    
	           
	        list.add(new Product(1,"Tv",30000f));    
	        list.add(new Product(2,"Pan",2000f));    
	        list.add(new Product(3,"Remote",28000f));    
	        list.add(new Product(4,"car",28000f));    
	        list.add(new Product(5,"Ac",90000f)); 
	       
	      
	    
	     // implementing lambda expression  
	        Collections.sort(list,(p1,p2)->{  
	        return p1.getName().compareTo(p2.getName());  
	        });  
	        for(Product p:list){  
	            System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());  
	        }  
	       
}
	


}
