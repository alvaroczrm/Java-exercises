package T_3;

import java.util.Scanner;

public class ej2_abecedario 
{

	public static void main(String[] args) 
	{
		String cadena = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		for(int i = 0; i<cadena.length(); i++)
		{
			System.out.println(cadena.charAt(i));
		}
		/**Scanner teclado = new Scanner(System.in);
		int i;
		char chars [] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
			String s = new String(chars);
			for(i=1;i<=chars;i++)
			{
				System.out.println(s);	
			}**/
	}

}
/* Recorre – Realizar un programa que, dada una cadena con todo el abecedario
de la A a la Z en mayúsculas, la recorra y muestre una a una las letras que la
componen.*/