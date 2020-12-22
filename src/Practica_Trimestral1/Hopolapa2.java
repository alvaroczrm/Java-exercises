package Practica_Trimestral1;

import java.util.Scanner;

public class Hopolapa2 {
	static String palabra;
	static String vocales[] = {'a','e','i','u','o'};
	static Character VARIABLE_P = 'p';

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una palabra:");
		palabra = teclado.nextLine();
		teclado.close();
		for (Character i : palabra.toCharArray()) {
			String resultado = palabra.replace(vocales[i],'p');
		}
		System.out.println("");
		System.out.println("Te contesto con: " + writeWord(palabra));

	}

	public static String writeWord(String palabra) {
		StringBuilder resultado = new StringBuilder();
		for (Character i : palabra.toCharArray()) {	
			//String resultado = palabra.replace(vocales[i], 'p');
		}
        System.out.println(palabra.replaceAll(vocales, "p"));


		return resultado;
	}
}