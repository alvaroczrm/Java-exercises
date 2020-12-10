package T_3;

import java.util.Scanner;

public class ej5_mayusculas_minusculas 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String txt;
		System.out.println("dame una frase");
		txt= teclado.nextLine();
		teclado.close();
				System.out.println(txt);
				System.out.println(txt.toUpperCase());
				System.out.println(txt.toLowerCase());
		
	}

}
/**Mayúsculas – Minúsculas - Realizar un programa que lea una cadena con letras
mayúsculas y minúsculas intercaladas y la muestre todo en mayúsculas y todo en
minúsculas**/