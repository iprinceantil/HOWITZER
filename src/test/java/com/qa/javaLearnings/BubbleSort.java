package com.qa.javaLearnings;

import org.testng.annotations.Test;

public class BubbleSort {

	/*
	 * Simplest Search algorithm
	 * takes multiple passes to sort the entire array.
	 * total number of passes are 1 less than the total number of array elements.
	 * In one pass or iteration, it compares all elements in pairs like (1,2),(2,3),(3,4),(4,.........
	 * in first pass it fixes the highest number to the end.
	 * 
	 * */

	@Test
	public void intArrayInsertionSort() {

		//int a[] = {36,19,29,12,5};
		int a[] = {12, 1, 25, 23};

		int temp = 0;
		for(int i=0;i<a.length;i++) {
			int flag=0;
			for(int j=0;j<a.length-1-i;j++) {

				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		
		for(int b:a) {
			 System.out.print(b+",");
		 }

	}
	
	@Test
	public void stringArrayInsertionSort() {
		
		String a[] = {"Zulfikar","Badal","Hanuman","Khatri","Amit","Chinu"};

		String temp = "";
		for(int i=0;i<a.length;i++) {
			int flag=0;
			for(int j=0;j<a.length-1-i;j++) {

				if(a[j].compareTo(a[j+1])>0) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		
	}

}

