package com.qa.poc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WritingConsoleOutputToTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		printOnConsole("This is Test message");
		printOnConsole("This is Test message 2");

	}
	
	public static void printOnConsole(String outputMessage) throws FileNotFoundException	{
		
		// Creating a File object that represents the disk file. 
        PrintStream o = new PrintStream(new File("ConsoleOutput.txt")); 
  
        // Store current System.out before assigning a new value 
        PrintStream console = System.out; 
  
        // Assign o to output stream 
        System.setOut(o); 
        System.out.println(outputMessage); 
  
        // Use stored value for output stream 
        System.setOut(console); 
        System.out.println(outputMessage);
		
	}

}
