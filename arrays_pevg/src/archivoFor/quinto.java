package archivoFor;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class quinto {
	public static void main(String[] args) {

		for (int horas = 0; horas < 24; horas++) {
			for(int minutos = 0; minutos < 60; minutos++){
				for(int segundos = 0; segundos < 60; segundos++){
					System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos );
					
				}
			}
		}
		
		
		

	}

}
