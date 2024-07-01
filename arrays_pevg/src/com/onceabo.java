package com;
import java.util.*;

public class onceabo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe del 1 al 5 para seleccionar un pais: ");
		int zona = scanner.nextInt();
		
		System.out.println("Cuanto va a pesar?");
		double peso = scanner.nextDouble();
		
		double costo;
		
		double precio;
		
		
		switch (zona) {
		case 1:
			costo = 24;
			precio = costo * peso;
			System.out.println("Seleccionaste el pais América del Norte Y el peso seleccionado fue " 
			+ peso + "Kg. Y su precio es de " + precio + " Euros");
			
			break;
		case 2:
			costo = 20;
			precio = costo * peso;
			System.out.println("Seleccionaste el pais América Central Y el peso seleccionado fue " 
					+ peso + "Kg. Y su precio es de " + precio + " Euros");
			break;
		case 3:
			costo = 21;
			precio = costo * peso;
			System.out.println("Seleccionaste el pais América del Sur Y el peso seleccionado fue " 
					+ peso + "Kg. Y su precio es de " + precio + " Euros");
			break;
		case 4:
			costo = 10;
			precio = costo * peso;
			System.out.println("Seleccionaste el pais Europa Y el peso seleccionado fue " 
					+ peso + "Kg. Y su precio es de " + precio + " Euros");
			break;
		case 5:
			costo = 18;
			precio = costo * peso;
			if (peso  >6) {
				System.out.println("No se puede");
			}else {
				
				System.out.println("Seleccionaste el pais Asia Y el peso seleccionado fue " 
						+ peso + "Kg. Y su precio es de " + precio + " Euros");
			}
			
			break;
		default:
			System.out.println("Ese país no existe");
			break;
		}
		
		if((zona * peso) >=5 ) {
			System.out.println(" No podemos llevarte es mucho peso");
		}

	}

}

