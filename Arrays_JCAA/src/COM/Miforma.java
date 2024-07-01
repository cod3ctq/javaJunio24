package COM;

public class Miforma {
	public static void main(String[] args) {
		String[][] matrizUno = { { "p", "9", "u", "3" }, { "4", "6", "f", "4" }, { "p", "9", "u", "3" },
				{ "4", "6", "f", "4" } };
		String[][] matrizDos = { { "2", "6", "f", "h" }, { "3", "s", "5", "4" }, { "g", "s", "2", "5" },
				{ "2", "e", "t", "5" } };

		int filas = matrizUno.length;
		int columnas = matrizUno[0].length;
		String[][] resultado = new String[filas][columnas];
		for (int i = 0; i <= matrizUno.length - 1; i++) {
			for (int j = 0; j <= matrizUno[0].length - 1; j++) {
				try {

					int valor = Integer.parseInt(matrizUno[i][j]);
					int valor1 = Integer.parseInt(matrizDos[i][j]);
					resultado[i][j] = String.valueOf(valor + valor1);

				} catch (NumberFormatException e) {

					resultado[i][j] = "0";

				}

			}

		}
		for (int i = 0; i <= filas - 1; i++) {
			for (int j = 0; j <= columnas - 1; j++) {
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println();
		}
	}
}
