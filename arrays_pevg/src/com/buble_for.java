package com;

import java.util.Scanner;
public class buble_for {

	public static void main(String[] args) {
		// ingresar una cadena de texto e imprimirla al revez
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe una palabra");
		String palabra = scanner.nextLine();
		
		String inv = "";
		
		for(int i = palabra.length()-1; i>=0; i--) {
			
			inv = inv +  palabra.charAt(i);
			
		}
		System.out.println("La palabra: " + palabra + " al revez es: " + inv);
		

	}

}
