package com.qa.javaLearnings;

import org.testng.annotations.Test;

public class InsertionSort {
	
	/*
	 * 
	 * */
	
	@Test
	public void intArrayInsertionSort() {
		
		int a[] = {5,1,6,2,4,3};
		int temp;
		
		for(int i=1;i<a.length;i++) {
			temp = a[i];
			int j = i;
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j--;
			}
			a[j] = temp;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	@Test
	public void stringArrayInsertionSort() {
		
		String a[] = {"Zulfikar","Badal","Hanuman","Khatri","Amit","Chinu"};
		String temp;
		
		for(int i=1;i<a.length;i++) {
			temp = a[i];
			int j = i;
			while(j>0 && a[j-1].compareTo(temp)>0) {
				a[j]=a[j-1];
				j--;
			}
			a[j] = temp;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
