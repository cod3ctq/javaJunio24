//leer un archivo y escribir la longitud de las lineas en otro archivo
//
package com;

// importado de variables

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

public class buscarNombre {

	public static void main(String[] args) {

		String ruta1 = "escritura.txt";
		String ruta2 = "lectura.txt";
		String linea = "";
		int d;
		int b = 0;
		File file = new File(ruta1); // representacion del archivo fisico, dentro de java
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Scanner n = new Scanner(System.in).useLocale(Locale.US);
		try {
			BufferedWriter escritura = new BufferedWriter(new FileWriter(ruta2));
			System.out.println("Cuantos nombres deseas ingresar? ");
			d = n.nextInt();
			
			FileWriter fw = new FileWriter(file, false);
			for (int i = 0; i < d; i++) {
				System.out.println("ingrese un nombre");
				linea = sc.nextLine();
				b = linea.length();
				escritura.write(linea+ " " + b + "\n ");
//				fw.write(linea + "\n");
			}
			fw.close();
			
		} catch (Exception p) {
			p.printStackTrace();

		}
/*
 * package com;

// importado de variables

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

public class ejercicio1 {

	public static void main(String[] args) {
		
		
		String ruta1 = "C:\\\\Users\\\\HP\\\\Documents\\\\archvos de programacion\\\\archivo1.txt";
		String ruta2 = "C:\\\\Users\\\\HP\\\\Documents\\\\archvos de programacion\\\\archivo2.txt";
		String linea = "";
		
		int d;
	
		File file = new File(ruta1); // representacion del archivo fisico, dentro de java
		
	
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Scanner n  = new Scanner(System.in).useLocale(Locale.US);

		try {
			System.out.println("Cuantos nombres deseas ingresar? ");
			d = n.nextInt();
	
			FileWriter fw = new FileWriter(file, false);

			// ingrese una lista de nombres
			for (int i = 0; i < d; i++) {
				System.out.println("ingrese un nombre");
				linea = sc.nextLine();
				fw.write(linea + "\n");
			}
		
	(BufferedReader leer = new BufferedReader(new FileReader(file));
	BufferedWriter escribir = new BufferedWriter(new FileWriter(ruta2))) {
//	//
		String lin;
		while ((lin = leer.readLine()) != null) {
////					// Calcular longitud de la línea
			int longitud = lin.length();
////					// Escribir la longitud en el archivo de salida
			escribir.write(String.valueOf(longitud));
              fw.write("esta es una nueva linea de texto");
              escribir.newLine(); // Nueva línea para el próximo número
		}

		System.out.println("Se ha modificado el 'archivo2.txt' con las longitudes de las líneas del 'archvivo1.txt',  \n Revisa el archivo2.txt por favor.");
	} catch (IOException e) {
		System.err.println("Error " + e.getMessage());
		e.printStackTrace();
	}
}}}}}
 */
	}
}