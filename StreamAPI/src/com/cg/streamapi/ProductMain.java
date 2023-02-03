package com.cg.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain 
{
	
	 public static void main(String[] args) {    
	        List<Product> list = new ArrayList<Product>();    
	           
	        list.add(new Product(1,"Tv",30000f));    
	        list.add(new Product(2,"Pan",2000f));    
	        list.add(new Product(3,"Remote",28000f));    
	        list.add(new Product(4,"car",28000f));    
	        list.add(new Product(5,"Ac",90000f)); 
	        
	        Product product = list.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();    
	        System.out.println("Maxmum Product Price:"+product.price); 
	        
	        Product productA= list.stream().max((product1, product2)->product1.price < product2.price ? 1: -1).get();    
	        System.out.println("MinimumProduct Price:"+productA.price);    

	        
	        // Using Collectors's method to sum the prices.  
	        double totalPrice3 = list.stream().collect(Collectors.summingDouble(product4->product.price));  
	        System.out.println("totalPrice :"+totalPrice3);  
}
	 
	 
	 
}
