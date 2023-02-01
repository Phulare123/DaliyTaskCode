package com.cg.exception;

import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException
{
	
	public static void main(String[] args) {
	    
	    try {
	       
	        FileReader fileReader = new FileReader("Test.txt");// Creating an instance of FileReader class
	    
	        System.out.println(fileReader.read());
	    
	        fileReader.close();
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
}
}
