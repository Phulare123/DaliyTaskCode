package com.cg.collection.arraylist;
import java.util.*; 
public class ArrayList1 {
	public static void main(String[]arggs)
	{
           //create ArrayList
           ArrayList names=new ArrayList();
           names.add("Lisa");
           names.add("Jennifer");
           names.add("Mark");
           names.add("David");
           
           //Find the size of arrayList Using size()Method
           
           System.out.println("Size of arrayList="+names.size());
           
           //Display the arrayList
           System.out.println("Names : " + names);
           
           // Retrieve the element at a given index
           System.out.println("Names : " + names.get(0));
           System.out.println("Names : " + names.get(2));
           System.out.println("Names : " + names.get(1));
           System.out.println("Names : " + names.get(3));
           
        // Modify the element at a given index
           names.add(0, "Rahul");
           System.out.println("Names : " + names);
           
           // add all elements from names to names1
           ArrayList names1=new ArrayList();
           names1.addAll(names);
           System.out.println("List:"+names1);
           
           // remove all elements
          names.clear();
          System.out.println("List:"+names);
          
          // create copy of number
          ArrayList<String> cloneName = (ArrayList<String>)names.clone();
          System.out.println("Cloned ArrayList: " + cloneName);
      
          // checks if 3 is present in the arraylist
          System.out.print("Is  David present in the arraylist: ");
          System.out.println(names1.contains("David"));
           
           
           
           
           
          
           
           
           
           
           
	      
	}

}
