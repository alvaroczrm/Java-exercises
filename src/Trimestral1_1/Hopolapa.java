package Trimestral1_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hopolapa {
	static String palabra;
	static List<Character> vocales = Arrays.asList('a', 'e', 'i', 'o', 'u'); //lo mismo que un array
	static Character VARIABLE_P = 'p';

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una palabra:");
		palabra = teclado.nextLine();
		teclado.close();
		System.out.println("Te contesto con: " + writeWord(palabra));

	}

	public static String writeWord(String palabra) {
		StringBuilder resultado = new StringBuilder();

		for (Character i : palabra.toCharArray()) { 
			if (vocales.contains(i)) { 
				resultado.append(i);
				resultado.append(VARIABLE_P);
				resultado.append(i);
			} else {
				resultado.append(i);
			}
		}

		return resultado.toString();
	}
}