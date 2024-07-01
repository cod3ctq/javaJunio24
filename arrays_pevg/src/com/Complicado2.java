package com;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Complicado2 {
    public static void main(String[] args) {
        String archivo1 = "lectura.txt"; // Nombre del archivo de entrada
        String archivo2 = "escritura.txt"; // Nombre del archivo de salida

        // Transformar el archivo de entrada
        transformarArchivo(archivo1, archivo2);

        // Buscar por nombre
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el nombre de la persona:");
        String nombreBuscado = scanner.nextLine();
        buscarNombre(nombreBuscado, archivo1);
//        buscarFecha(nombreBuscado, archivo2 );
    }

   
	// Método para transformar el archivo
    private static void transformarArchivo(String archivo1, String archivo2) {
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo1));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo2))) {

            String linea;

            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(","); // Dividir por comas
                if (partes.length > 2) { // Asegurarse de que haya al menos tres columnas
                    // Modificar la primera columna (fecha)
                    String fechaOriginal = partes[0];
                    try {
                        SimpleDateFormat formatoEntrada = new SimpleDateFormat("ddMMyyyy");
                        SimpleDateFormat formatoSalida = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
                        Date fecha = formatoEntrada.parse(fechaOriginal);
                        partes[0] = formatoSalida.format(fecha);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    // Modificar la segunda columna (nombre)
                    partes[1] = incrementarCaracteres(partes[1]);

                    // Modificar la tercera columna (apellido)
                    partes[2] = incrementarCaracteres(partes[2]);

                    // Construir la línea modificada
                    StringBuilder lineaModificada = new StringBuilder();
                    for (int i = 0; i < partes.length; i++) {
                        if (i > 0) {
                            lineaModificada.append(",");
                        }
                        lineaModificada.append(partes[i]);
                    }

                    // Escribir la línea modificada en el archivo de salida
                    escritor.write(lineaModificada.toString());
                    escritor.newLine(); // Añadir nueva línea después de la línea escrita
                } else {
                    // Escribir las líneas que no tienen al menos tres columnas sin modificar
                    escritor.write(linea);
                    escritor.newLine();
                }
            }

            System.out.println("Archivo modificado correctamente");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

// Método para buscar un nombre y mostrar la fecha asociada
    private static void buscarNombre(String nombreBuscado, String archivo1) {
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo1))) {
            String linea;
            boolean encontrado = false;

            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(","); // Dividir por comas

                // Verificar que haya al menos dos partes (fecha y nombre)
                if (partes.length > 1 && partes[1].equals(nombreBuscado)) {
                    // Transformar la fecha del formato numérico al formato texto
                    String fechaTexto = partes[0];
                    SimpleDateFormat formatoEntrada = new SimpleDateFormat("ddMMyyyy");
                    SimpleDateFormat formatoSalida = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");

                    try {
                        Date fecha = formatoEntrada.parse(fechaTexto);
                        partes[0] = formatoSalida.format(fecha);
                        System.out.println("Fecha para " + nombreBuscado + ": " + partes[0]);
                        encontrado = true;
                        break;
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (!encontrado) {
                System.out.println("Nombre no encontrado.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
//    private static void buscarFecha(String nombreBuscado, String archivo2) {    	
//    	try(BufferedReader lector = new BufferedReader(new FileReader(archivo2))){
//    		String linea;
//    		boolean encontrado =  false;
//    		
//    		while ((linea = lector.readLine()) !=null) {
//    			String[] partes = linea.split(",");
//    			if (partes.length > 1 && partes[1].equals(nombreBuscado)) {
//    				
//    				System.out.println("La fecha es " + partes[0]);
//    				encontrado = true;
//    				break;
//    			}
//    		}
//    		if (!encontrado) {
//    			System.out.println("Fecha en letras:" );
//    		}
//    		
//    		
//    	}catch (IOException e) {
//    		e.printStackTrace();
//    	}
//    }
    
    // Método para incrementar cada carácter de una cadena
    private static String incrementarCaracteres(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            // Incrementar solo letras
            if (Character.isLetter(c)) {
                if (c == 'z') {
                    resultado.append('a');
                } else if (c == 'Z') {
                    resultado.append('A');
                } else {
                    resultado.append((char) (c + 1));
                }
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

}






