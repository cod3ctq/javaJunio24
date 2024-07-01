package com;


import java.util.Scanner;

public class ejercicio4_for_muestra {
public static void main(String[] args) {
	Scanner palabra = new Scanner(System.in);
//	for (int i = 1; i<=100; i+=2) {
//		System.out.println(i+1);
//	}
//	 _________________________________________________
//	String []frutas = {"banana","manzana"};
//	
//	for(String fruta: frutas) {
//		System.out.print(fruta + ", ");
//	}
	System.out.println("Escribe la palabra");
	String pala = palabra.nextLine();
	
	String inversion = "";
	
	for(int i =  pala.length()-1; i>=0; i--) {
		inversion += pala.charAt(i);
	}System.out.println("La palabra al reves es: " + inversion );
	
	
	}
	}


