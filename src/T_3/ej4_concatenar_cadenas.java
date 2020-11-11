package T_3;

import java.util.Scanner;

public class ej4_concatenar_cadenas 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String cadena1, cadena2, cadena3 = new String();
			System.out.println("Dame tu nombre");
			cadena1 = teclado.nextLine();
			System.out.println("Dame tu apellido");
			cadena2 = teclado.nextLine();
			teclado.close();
			cadena3 = cadena1 +" "+ cadena2;
			System.out.println("Hola "+ cadena3);
	}

}
/*Concatena - Realizar un programa que lea dos cadenas y las concatene en una
tercera cadena que mostrará por pantalla.
*/
