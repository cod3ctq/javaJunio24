package archivoFor;

import java.util.Iterator;
import java.util.Scanner;

public class segundo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe el numero con el que quieras hacer la multiplicacion");
		int numero1 = scanner.nextInt();

		System.out.println("Escribe hasta donde deseas multiplicar");
		int numero2 = scanner.nextInt();

		if (numero1 <= numero2) {
			for (int i = 1; i <= numero2; i++) {

				int resultado = numero1 * i;
				System.out.println(numero1 + " * " + i + " = " + resultado);

			}
		} else {
			System.out.println("El primer número debe ser menor o igual que el segundo número.");
		}

	}

}
