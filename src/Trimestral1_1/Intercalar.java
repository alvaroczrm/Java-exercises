package Trimestral1_1;

import java.util.Scanner;

public class Intercalar {


	public static String combinar(String s1, String s2) {
		StringBuilder resultado = new StringBuilder();

		for (int i = 0; i < s1.length() || i < s2.length(); i++) {

			if (i < s1.length())
				resultado.append(s1.charAt(i)); 

			if (i < s2.length())
				resultado.append(s2.charAt(i));
		}

		return resultado.toString();
	}

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame tu nombre");
		String s1 = teclado.nextLine();
		System.out.println("Dame tu apellido");
		String s2 = teclado.nextLine();
		System.out.println(combinar(s1, s2));
		teclado.close();
	}
}