package com.cg.stringclass;

public class String1{
  public static void main(String[] args) 
  
  {
	  //declare String
    String str = "Hello";
    System.out.println(str);
    
//    find the length of String
     int value;
     value=str.length();
     System.out.println("lenght of the String:"+value);
     
     //convert to lower case
     String l1=str.toLowerCase();
     System.out.println("In lower case:"+l1);
     
     
   //convert to lower case
     String l2=str.toUpperCase();
     System.out.println("In upper case:"+l2);
     
     //
     String nonTrimmedString="    Hellow";
     
     System.out.println(nonTrimmedString);
     
     //trim method which remove the space between the String
     
     String trimmedString=nonTrimmedString.trim();
     
     System.out.println(trimmedString);
     
     
     //subString
     
     System.out.println(str.substring(2));
     
//     replace the character
     System.out.println(str.replace("e", "r"));
     
  //index value
     
     System.out.println(str.indexOf("H"));
     
     //Find the character  at index 
     
     System.out.println(str.charAt(4));
     
     
     
     
    
    
  }
}