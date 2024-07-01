package COM;

public class EjercicioMatricez {
public static void main(String[] args) {
	
	String [][] matrizDos = {{"2","6","f","h"},{"3","s","5","4"},{"g","s","2","5"},{"2","e","t","5"}};
	String [][] matrizUno =  {{"p","9","u","3"},{"4","6","f","4"},{"p","9","u","3"},{"4","6","f","4"}};
	 
	//se crea la otra matriz donde estra resultado
	/*aqui se le asigna el tamaño a filas desde la primera variable de matriz
	int filas es la variable a creear
	matrizUno.length da el tamaño que se le asigna a la variable*/
	int filas = matrizUno.length;
	//aqui se le agrega el valor de la segunda variable utilizando la segunda varaible de la primera matriz
	
     int columnas = matrizUno[0].length;
     String[][] resultado = new String[filas][columnas];

     // Sumar las matrices
     for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
             // Convertir a entero si es posible y sumar
             try {
                 int valor1 = Integer.parseInt(matrizUno[i][j]);
                 int valor2 = Integer.parseInt(matrizDos[i][j]);
                 resultado[i][j] = String.valueOf(valor1 + valor2);
             } catch (NumberFormatException e) {
                 // En caso de no ser un número entero, manejar el error o ignorar
                 resultado[i][j] = "0"; // Por ejemplo, podrías manejarlo con un valor específico
             }
         }
     }

     // Imprimir la matriz resultado
     System.out.println("La matriz resultado de la suma es:");
     for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
             System.out.print(resultado[i][j] + " ");
         }
         System.out.println();
     }
 }
















}






