package com.qa.javaLearnings;

import java.util.Scanner;

public class CommandLineArguments {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			int sum = 0;
			
			
			System.out.println("Enter firstNumber");
			int firstNumber = input.nextInt();
			System.out.println("Enter secondNumber");
			int secondNumber = input.nextInt();
			
			sum =firstNumber  + secondNumber;
			System.out.println("The Sum is"+sum);
			
			
			System.out.println("Enter first name");
			String firstName = input.nextLine();
			System.out.println("Enter last Name");
			String lastName = input.nextLine();
			
			System.out.println(firstName+" "+lastName);
		}
	}

}
