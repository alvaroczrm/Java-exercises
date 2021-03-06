package Practica_Trimestral1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hopolapa {
	static String palabra;
	static List<Character> vocales = Arrays.asList('a', 'e', 'i', 'o', 'u');
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

		for (Character i : palabra.toCharArray()) { //convierte palabra en un array y lo recorre
			if (vocales.contains(i)) { //el array vocales junto .contains comprueba que el incremento del array palabra coincida
				resultado.append(i);//vocal y .append significa que adjunta (i) a la variable resultado
				resultado.append(VARIABLE_P);//a�ade letra P
				resultado.append(i);//repite vocal
			} else {
				resultado.append(i);//consonantes
			}
		}

		return resultado.toString();
	}
}
