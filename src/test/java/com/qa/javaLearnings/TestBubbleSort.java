package com.qa.javaLearnings;

import org.testng.annotations.Test;

public class TestBubbleSort {
	
	@Test
	public void bubbleSortTest() {
		
		int[] a = new int[]{15,8,26,4,9};
		
		int temp = 0;
		
		for(int i=0;i<a.length;i++) {
			int flag = 0;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {
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
			System.out.print(a[k]+" ");
		}
		
	}

}
