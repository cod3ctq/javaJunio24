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

public class Complicado {
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
        //buscarFecha(nombreBuscado, archivo2 );
        
    }

   
	// Método para transformar el archivo 
    private static void transformarArchivo(String archivo1, String archivo2) {
    	//try para manejor de error con condicion de buffer
    	// BufferReader es para guardar la variable y poder leer File Reader y FileReader es para
    	//leer el archivo1/2
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo1));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo2))) {
        	//Declaracion de variable (linea porque es la primera lina)
            String linea;
            //Abrimos el bucle wile con condicionamiento y le damos el valor al objeto (lector , archivo1) a linea cn readline para que del txt
            while ((linea = lector.readLine()) != null) {
            	//Comenzamos un Array partes y decimos que va a ser igual a linea pero divido 
            	//en comas es decir que lo va a seccionar por partes de acuerdo a las comas
                String[] partes = linea.split(","); // Dividir por comas
                if (partes.length > 2) { // Asegurarse de las columnas existentes que sean mas de 3 en este caso
                    // Modificar la primera columna (fecha)
                	//creamos la variable fecha que sera igual a la seccion de partes que es 0
                    String fechaOriginal = partes[0];
                    //iniciamos nuevamente un try para manerar errores al convertir los numeros de la fecha en texto
                    //sin condicion
                    try {
                    	// utilizamos simpledateformat de entrada de datos para formatear el dato de fecha y analizarlo (patrones de cadena)
                    	//y creamos una nueva instancia simple....
                        SimpleDateFormat formatoEntrada = new SimpleDateFormat("ddMMyyyy");
                        //creamos otro simple... para el formato de salida junto con su instancia pero para convertirlo
                        //los datos que va a pedir esta instancia seran en formato de dia mes y año
                        SimpleDateFormat formatoSalida = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
                        //utilizamos el metodo Date en la variable fecha que sera igual a el formato de salida 
                        // y parce se encargara de de convertirlo en el formatode la fecha original
                        Date fecha = formatoEntrada.parse(fechaOriginal);
                        //despues seleccionamos que seccion con partes vamos a editar en este caso seria 0
                        // y se utiliza el motodo format para darle formato de texto a la fecha salida
                        partes[0] = formatoSalida.format(fecha);
                        
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    // Modificar la segunda columna (nombre)
                    partes[1] = incrementarCaracteres(partes[1]);

                    // Modificar la tercera columna (apellido)
                    partes[2] = incrementarCaracteres(partes[2]);

                    // Construir la línea modificada con una instancia StringB
                    StringBuilder lineaModificada = new StringBuilder();
                    //iniciamos bucle for para que conviera en enteros y usar length 
                    for (int i = 0; i < partes.length; i++) {
                    	//iniciamos el bucle si es mayor a 0 y que continue para asegurarnos que siempre va a hacerlo hasta que termine la frase 
                        if (i > 0) {
                        	//en caso que sea llama a la variable de la instancia  y agrega con append ","
                            lineaModificada.append(",");
                        }
                        //lo agregamos todo a la nueva linea con appened y seleccionando la parte a la que va a ir con partes  de i
                        lineaModificada.append(partes[i]);
                    }

                    // Escribir la línea modificada en el archivo de salida con nuestra variable de salidade texto y lo devolvemos a String con toS
                    escritor.write(lineaModificada.toString());
                    // Añadir nueva línea después de la línea escrita
                    escritor.newLine();
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
    	//Creamos de nuevo el try de lector con condicion de Buffer  y lo instanciamos  con file-archivo1
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo1))) {
            String linea;
            //definimos por defecto false al boolean encontrado
            boolean encontrado = false;

            //
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(","); // Dividir por comas

                // Verificar que haya al menos dos partes (fecha y nombre)
                if (partes.length > 1 && partes[1].equals(nombreBuscado)) {
                    // Transformar la fecha del formato numérico al formato texto
                	
                	//Basicamente lo mismo que hicimos el en el anterior para cambiar del formato de fecha 
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
            //Si encontrado es false imprime el texto
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
    	//iniciamos StringB... con una variable y lo instanciamos porque se puede transformar o modificar y tiene los metodos appened
        StringBuilder resultado = new StringBuilder();
        //iniciamos el bucle forEach en donde vamos a buscar el cambio de una variable char 'c' (a -z)
        // y lo definimos en texto.toCharArray debido a que es un array char
        for (char c : texto.toCharArray()) {
            // Incrementar solo letras con Caracter
            if (Character.isLetter(c)) {
            	//desplazamiento hacia adelante
                if (c == 'z') {
                	// usamos condicion para cuanto vea una z la cambie por una a
                	//utilizamos app para agregarlo
                    resultado.append('a');
                } else if (c == 'Z') {
                    resultado.append('A');
                } else {
                	//si no encuentra sigue y aunmenta en 1 los char de las letras del texto
                    resultado.append((char) (c + 1));
                }
            } else {
            	// Agregar caracteres que no son letras directamente
                resultado.append(c);
            }
        }
        //regresamos nuestro valor a String 
        return resultado.toString();
    }

}





