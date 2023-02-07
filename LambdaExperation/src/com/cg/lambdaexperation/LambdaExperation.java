package com.cg.lambdaexperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExperation 
{
	 public static void main(String[] args) {    
	        List<Product> list = new ArrayList<Product>();    
	           
	        list.add(new Product(1,"Tv",30000f));    
	        list.add(new Product(2,"Pan",2000f));    
	        list.add(new Product(3,"Remote",28000f));    
	        list.add(new Product(4,"car",28000f));    
	        list.add(new Product(5,"Ac",90000f)); 
	       
	        
	        Stream<Product> filtered_data = list.stream().filter(p -> p.getPrice() > 20000);  
	        // using lambda to iterate through collection  
	        filtered_data.forEach(  
	                product -> System.out.println(product.getName()+": "+product.getId())  
	        );  
	    
	        
	       
}
	

	

}
