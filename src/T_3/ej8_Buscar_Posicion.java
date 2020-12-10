package T_3;

import java.util.Scanner;

public class ej8_Buscar_Posicion {
	static String cadena;
	static char caracter;

	public static void main(String[] args) {
		String cadena;
		char caracter;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena");
		cadena = teclado.nextLine();
		System.out.println("Dame un caracter");
		caracter = teclado.nextLine().charAt(0);
		teclado.close();
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				System.out.println(i);
				break;
			}

		}
	}
}
