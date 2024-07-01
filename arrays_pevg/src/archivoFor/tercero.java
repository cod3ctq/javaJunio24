package archivoFor;

import java.util.Iterator;
import java.util.Scanner;

public class tercero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe una palabra para ver si es polimorfismo");
		String palabra = scanner.nextLine();

		String inversion = "";
		
		String texto = inversion.replace(" ", "");
		
		for (int i = palabra.length() - 1; i >= 0; i--) {
			texto = texto + palabra.charAt(i);
		}
		if (palabra.equalsIgnoreCase(texto)) {
			System.out.println("polimorfismo");
		}else {
			System.out.println("no es");
		}
	}

}
