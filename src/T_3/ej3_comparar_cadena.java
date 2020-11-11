package T_3;

import java.util.Scanner;

public class ej3_comparar_cadena 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String cadena1, cadena2 = new String();
			System.out.println("Dame la cadena1");
			cadena1 = teclado.nextLine();
			System.out.println("Dame la cadena2");
			cadena2 = teclado.nextLine();
			teclado.close();
		if (cadena1.length() > cadena2.length())
		{
			System.out.println(cadena1 + " es mas larga que "+ cadena2);
		}
		if (cadena1.length() < cadena2.length())
		{
			System.out.println(cadena2 + " es mas larga que "+ cadena1);
		}
		else
		{
			System.out.println(cadena1 + " y "+cadena2+ " son iguales");
		}
		
	}

}
/*Compara - Realizar un programa que compare dos cadenas dadas por teclado.
Se nos mostrará un mensaje indicando cuál de las dos es mayor o si son iguales,
con respecto a su longitud.*/
