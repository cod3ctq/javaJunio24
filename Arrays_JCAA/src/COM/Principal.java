package COM;

import java.util.Arrays;
import java.util.Scanner;

// con () metodo sin() propiedad
public class Principal {
	public static void main(String[] args) {
//	Integer[] nums = new Integer[10];
//	System.out.println(Arrays.toString(nums));
		Scanner scanner = new Scanner(System.in);
//	for(int i =0;i<=nums.length-1;i++) {
//		System.out.println("Añade un numero");
//		nums[i] = scanner.nextInt();
//		
//	}
//	System.out.println(Arrays.toString(nums));
//	Object[] varios = new Object[10];
//	varios[0] = 30;
//	varios[1] = "hola";
//	varios[2] = 30.0;
//	varios[3] = true;
//	varios[4] = 'g';
//	varios[5] = 34;
//	varios[6] = "hola";
//	varios[7] = new Integer("345");
//	varios[8] = 30;
//	varios[9] = 30;
//	

		String caracteres = "b4e5vn59m0j98nb363¡()/#¡¡#$b5u4/(6v5y79Ñ%24v565823440¿204245JO/23t*&/M(O/c234";
		String c = "";
		String numeros = "0123456789";
		int[] conteo = new int[10];// declaras el arreglo para optener los contenedores
		String residuo = "";// para poner los caracteres sobrantes
		for (int i = 0; i < caracteres.length() - 1; i++) {// recorre la posicion de todoel string
			// la posicion i lo covieten a caracter y de ahi lo combieten a string
			c = Character.toString(caracteres.charAt(i));
//compara la el string optenido con el extring ya dado que es numeros
//si da >=0 entonces continia al no encontrar da -1
			if (numeros.indexOf(c) >= 0) {
				// se creea el array para un conteo de cada string numero
				conteo[numeros.indexOf(c)]++;
			}
//al ser negado el caracter se ingresa a residuo y se suma para pasar todo el string sobrante
			else {
				residuo = residuo + c;
			}

		}
		System.out.println(Arrays.toString(conteo));
		System.out.println(residuo);
	}
}
