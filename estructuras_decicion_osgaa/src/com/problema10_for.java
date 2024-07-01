package com;

import java.util.Scanner;

public class problema10_for {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[20];
    int sumatoriaPositivos = 0;
    int sumatoriaImpares = 0;

    
    for (int i = 0; i < 20; i++) {
        System.out.print("Ingrese el número " + (i+1) + ": ");
        numeros[i] = scanner.nextInt();

        
        if (numeros[i] > 0) {
            sumatoriaPositivos += numeros[i];
        }

        
        if (numeros[i] % 2 != 0) {
            sumatoriaImpares += numeros[i];
        }
    }

    
    System.out.println("\nResultados:");
    for (int i = 0; i < 20; i++) {
        System.out.print(numeros[i] + ": ");
        if (numeros[i] > 0) {
            System.out.print("positivo, ");
        } else {
            System.out.print("negativo, ");
        }

        if (numeros[i] % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }

    System.out.println("\nSumatoria de positivos: " + sumatoriaPositivos);
    System.out.println("Sumatoria de impares: " + sumatoriaImpares);

    
	

} 
}
	
