package archivoFor;

import java.util.Iterator;
import java.util.Scanner;

public class primero {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Escribe un numero");
//		int numero = scanner.nextInt();
		int tabla = 12;
		
		Integer[] multiplos = {1,2,3,4,5,6,7,8,9,10};
		
		for (Integer multiplo : multiplos) {
			int resultado = tabla * multiplo;
			System.out.println(resultado);
		}
		
	}

}
