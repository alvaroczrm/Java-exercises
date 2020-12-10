package Trimestral1_1;

import java.util.Scanner;

public class traductor {
	static String[] Spanish = { "yo", "tu", "el", "ella", "soy", "eres", "es", "alto", "bajo" };
	static String[] English = { "i", "you", "he", "she", "am", "are", "is", "tall", "short" };
	static String traduccion = new String();

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabra;
		System.out.println("What do you want to translate? // ¿Que quieres traducir?");
		palabra = teclado.nextLine().toLowerCase();
		teclado.close();
		String frase[] = palabra.split(" ");
		funTraductor(frase);
		if (traduccion == null) {
			System.out.println("no esta en el diccionario");
		} else {
			System.out.println("La traduccion es " + traduccion);
		}
	}

	public static void funTraductor(String[] frase) {
		for (int i = 0; i < frase.length; i++) {
			for (int j = 0; j < Spanish.length; j++)
			{
				if (frase[i].equals(Spanish[j]))
				{
					traduccion = traduccion + English[j] + " ";
					j = Spanish.length;										
					//break;
				}

			}
		}
		for (int i = 0; i < frase.length; i++) {
			for (int j = 0; j < English.length; j++) {
				if (frase[i].equals(English[j])) {
					traduccion = traduccion + Spanish[j] + " ";
					j = English.length;
					//break;
				}

			}
		}
	}
}