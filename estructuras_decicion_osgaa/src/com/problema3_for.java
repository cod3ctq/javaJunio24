package com;

import java.util.Scanner;

public class problema3_for {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe la palabra");
		String pala = sc.nextLine().replace(" ", "");
		
		String inversion = "";
		
		for (int i = pala.length() - 1; i >= 0; i--) {
			inversion += pala.charAt(i);
		}
		
		if(inversion.equals(pala)) {
			
			System.out.println("La palabra al reves es palindromo ");	
		}else {
			System.out.println("La palabra al reves no es palindromo ");
		}
		
	}
}
