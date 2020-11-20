package Practica_Trimestral1;
import java.util.Scanner;
public class Intercalar 
{
	
	// Funcion para combinar los caracteres de dos strings 
		public static String combinar(String s1, String s2) 
		{ 
			// Guarda el resultado de la cadena resultado de s1 y s2 
			StringBuilder resultado = new StringBuilder(); 

			// por cada index en la cadena 
			for (int i = 0; i < s1.length() || i < s2.length(); i++) { 

				 
				if (i < s1.length()) 
					resultado.append(s1.charAt(i)); 

				
				if (i < s2.length()) 
					resultado.append(s2.charAt(i)); 
			} 

			return resultado.toString(); 
		} 

		// Pedimos al usuario introducir su nombre, las dos variables quedan guardadas como strings en s1 y s2
		public static void main(String[] args) 
		{ 
			Scanner teclado = new Scanner(System.in); 
			System.out.println("Dame tu nombre");
			String s1 = teclado.nextLine();
			System.out.println("Dame tu apellido");
			String s2 = teclado.nextLine();
			System.out.println(combinar(s1, s2)); 
			teclado.close();
		} 
	} 
