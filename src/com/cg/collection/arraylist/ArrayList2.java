//Program related sorting ArrayList Using  sort mehtod
package com.cg.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
	 public static void main(String[] args) {
	        ArrayList<Integer> num= new ArrayList<>();
	        num.add(13);
	        num.add(7);
	        num.add(18);
	        num.add(5);
	        num.add(2);

	        System.out.println("ArrayList Befor the sorted list : " + num);

	        // Sorting an ArrayList using Collections.sort() method
	        Collections.sort(num);

	        System.out.println("ArrayList After the sorted list : " + num);
	    }

}
