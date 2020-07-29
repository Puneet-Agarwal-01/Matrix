package myCaptain;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
//		int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		System.out.println("Enter elements of first matrix :");
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements of second matrix :");
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements of matrix after adding both matrix :");
		
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		System.out.println("All the Best!");
		
	}

}
