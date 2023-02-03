package com.cg.streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi1 {
	
	public static void main(String[] args) {
//		List without using stream API
		
		List<String>list=new ArrayList<String>();
		list.add("Java");
		list.add("pythone");
		list.add("Webtech");
		list.add("C");
		list.add("c++");
		System.out.println("System.out.println:"+list);
		
		
		
		//Using Stream API
		
		Stream<String> stream=list.stream();
		List<String> newList=stream.collect(Collectors.toList());
		System.out.println(newList);
		
		
		List<String> newList1=list.stream().collect(Collectors.toList());
		System.out.println(newList1);
		
		
		
	}

}
