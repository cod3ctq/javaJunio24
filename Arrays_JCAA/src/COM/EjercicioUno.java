package COM;
import java.util.Scanner;
public class EjercicioUno {
 
    public static void main(String[] args) {
    	Scanner scanner= new Scanner(System.in);
 
        //Esto es opcional
        final int TAMANIO=10;
 
        int num[]=new int[TAMANIO];
 
        //Invocamos las funciones
        rellenarArray(num);
 
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
    	Scanner scanner = new Scanner(System.in);
        for(int i=0;i<lista.length;i++){
        	System.out.println("declare ");
            String texto = scanner.nextLine();
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}
