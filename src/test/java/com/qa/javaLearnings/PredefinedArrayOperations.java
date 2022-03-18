package com.qa.javaLearnings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import org.testng.annotations.Test;

public class PredefinedArrayOperations {

	@Test
	public void sortArray() {

		// Approach 1
		int a[] = {4,3,5,2,6,3,9,8,7,1};

		System.out.println("before sorting"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("after sorting"+Arrays.toString(a));

		// Approach 2
		int b[] = {4,3,5,2,6,3,9,8,7,1};
		System.out.println("before sorting"+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("after sorting"+Arrays.toString(b));

		// Descending Order
		Integer c[] = {4,3,5,2,6,3,9,8,7,1};
		System.out.println("before sorting"+Arrays.toString(c));
		Arrays.sort(c, Collections.reverseOrder());
		System.out.println("after sorting"+Arrays.toString(c));
	}

	@Test
	public void test() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of Runners");
		int N = scanner.nextInt();
		scanner.nextLine();
		
		Float[] R = new Float[N];
		
		for(int i=0;i<N;i++) {
			System.out.println("Enter distance covered for "+(i+1)+"th runner.");
			String input = scanner.nextLine();
			if(input.equals("q")) {
				break;
			}else {
				R[i] = Float.parseFloat(input);
			}
				
		}
		
		System.out.println("Before Sort "+Arrays.toString(R));

		Arrays.sort(R, Collections.reverseOrder());

		System.out.println("after Sort "+Arrays.toString(R));
	}

}
