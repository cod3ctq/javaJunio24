package com;

import java.util.Scanner;

public class problema4_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase");
		String frase = sc.nextLine();
		
		System.out.println("Escribe la letra a buscar");
		char letras = sc.next().charAt(0);
		
		int con = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i)== letras) {
			 con++;
			 
			}
			if(con > 0) {
				System.out.println(con);
			}else {
				System.out.println("No existe la letras");
			}
		}
		
	}
}