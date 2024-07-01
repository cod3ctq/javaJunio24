package com;

public class class01 {
	public static void main(String[] args) {
		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int filas = myNumbers.length;
		int columnas = myNumbers[0].length;

		int B[][] = new int[myNumbers[0].length][myNumbers.length];

		int i, j;

		for (i = 0; i < myNumbers.length; i++) {
			for (j = 0; j < myNumbers[i].length; j++) {
				B[j][i] = myNumbers[i][j];
			}
		}
		for (i = 0; i < B.length; i++) {
			for (j = 0; j < B[i].length; j++) {
				System.out.print(" "+B[i][j]+ " ");
			}
			System.out.println("");
		}
	}
}