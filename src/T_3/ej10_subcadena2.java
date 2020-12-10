package T_3;

import java.util.Scanner;

public class ej10_subcadena2 {

	public static void main(String[] args) {
		String cadena;
		int posicion;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena");
		cadena = teclado.nextLine();
		System.out.println("Dame una posicion");
		posicion = teclado.nextInt();
			teclado.close();
			System.out.println(cadena.substring((cadena.length()-posicion),cadena.length()));

	}

}
