package com.cg.stringbulider;

public class StringBuilderexample2 {
	
            public static void main(String[] args) {

                // create StringBuilder object
                StringBuilder str = new StringBuilder(" JavaProgram");
                System.out.println("StringBuilder = " + str);
         
                // Append 'C'(67) to the String
                str.appendCodePoint(67);
         
                // Print the modified String
                System.out.println("Modified StringBuilder = "+ str);
            }
			}


