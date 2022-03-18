package com.qa.javaLearnings;

import org.testng.annotations.Test;

public class SelectionSort {

	/*
	 * Combination of searching and sorting
	 * starts with the first element of array and searches for smallest element and then swap it's position with that, and goes on.
	 * total number of passes = total number of elements
	 * it maintains two sub arrays, one sorted one and another unsorted one
	 * 
	 * */
	
	@Test
	public void intArrayInsertionSort() {
		
		int a[] = {38,52,9,18,6,62,13};
		
		int min, temp=0;
		
		for(int i=0;i<a.length;i++) {	
			min=i;
			for(int j=i+1;j<a.length;j++) {		
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	
	@Test
	public void stringArrayInsertionSort() {
		
		String a[] = {"Zulfikar","Badal","Hanuman","Khatri","Amit","Chinu"};
		
		int min; 
		String temp="";
		
		for(int i=0;i<a.length;i++) {	
			min=i;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j].compareTo(a[min])<0) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
