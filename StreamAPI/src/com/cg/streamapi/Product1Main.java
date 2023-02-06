package com.cg.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product1Main {
	
	 public static void main(String[] args) {    
	        List<Product1> list = new ArrayList<Product1>();    
	           
	        list.add(new Product1(1,"Tv",30000f));    
	        list.add(new Product1(2,"Pan",2000f));    
	        list.add(new Product1(3,"Remote",28000f));    
	        list.add(new Product1(4,"car",28000f));    
	        list.add(new Product1(5,"Ac",90000f)); 
	        
	       // count number of products based on the filter  
	        long count =list.stream()  
                    .filter(product->product.price<30000)  
                    .count(); 
	        
	        System.out.println("Count :"+count);
	        
	        
}
	

}
