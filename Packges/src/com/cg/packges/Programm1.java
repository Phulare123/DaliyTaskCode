package com.cg.packges;

import java.util.Scanner;

public class Programm1 
{
	
	public static float area(int a,int b)
	{
		float area=(1/2)*a*b;
		System.out.println("Area of triangle"+area);
		return  area;
		
		
	}
	
	public static void main(String[] args)
	{
		
		float ans=area(10,22);
		 
		 System.out.println("Area of triangle"+ans);

		
	}
	

}
