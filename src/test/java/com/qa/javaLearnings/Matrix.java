package com.qa.javaLearnings;

import java.util.Scanner;

public class Matrix {
	
	
	public static void main(String[] args) {
		
		int [][] a = new int[3][2];
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);


		for(int row=0;row<a.length;row++) {
			for(int col=0;col<2;col++) {
				a[row][col] = scanner.nextInt(); 
			}
		}
		
		System.out.print("Matrix without transpose");
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] b = new int[2][3];
		
		for(int row=0;row<b.length;row++) {
			for(int col=0;col<b[0].length;col++) {
				b[row][col]=a[col][row];
			}
		}
		
		System.out.print("Matrix with transpose");
		System.out.println();
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	
}
