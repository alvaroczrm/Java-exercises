package T_3;

import java.util.Scanner;

public class ej15_replace_chars {

	public static void main(String[] args) {
	      Scanner teclado = new Scanner(System.in);
	        String cadena;
	        System.out.println("Introduzca primera cadena");
	        cadena=teclado.nextLine();
	        System.out.println(cadena.replaceAll("a", "ha"));
	        teclado.close();
	        
	}

}
