package com;
import java.util.*;
public class catorce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuantas horas trabajas?");
		int horas = scanner.nextInt();
		
		int paga;
		int extra = 0;
		
		if (horas <=40 ) {
			paga = horas * 16;
			System.out.println("Tu salario es de " + paga);
			
		}else {
			paga = 40 * 16;
			extra = (horas-40) * 20;
			int salario = paga + extra;
			System.out.println("Tu salario es de " + salario);
		}

	}

}
