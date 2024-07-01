package com;

import java.util.Scanner;

public class problema2_for {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Introduce la tabla de multiplicar que desea realizar");
	int num = sc.nextInt();
	
	System.out.println("Introduce hasta que iteraccion requiere");
	int iter = sc.nextInt();
	
	for(int i = num; i==iter; i++) {
		int resultado = num * iter;
		System.out.println(num + "X" + iter + " = " + resultado);
	}
}
}
