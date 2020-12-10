package T_3;

import java.util.Scanner;

public class ej13_cambiar_a_por_o {


	public static void main(String[] args) {
		String cadena, cadena2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena");
		cadena = teclado.nextLine();
		cadena2 = cadena.replace('a', 'o');
		System.out.println(cadena2);
	}
}

