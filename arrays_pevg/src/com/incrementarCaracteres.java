package com;

public class incrementarCaracteres {

	protected static String incrementarCaracteres(String texto) {
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
