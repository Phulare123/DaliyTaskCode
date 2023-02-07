package com.cg.lambdaexperation;

public class LampbdaExperation2 {

	
	 public static void main(String[] args) {  
	        int area=30;         
	        //with lambda 
	        Area withLambda=()->{  
	            System.out.println("Area "+ area);  
	        };  
	        withLambda.area();  
	    }  
}
