package T_3;

import java.util.Scanner;

public class ej9_subcadena {

	public static void main(String[] args) {
		String cadena;
		int posicion;
		int longitud;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena");
		cadena = teclado.nextLine();
		System.out.println("Dame una posicion");
		posicion = teclado.nextInt();
		do {
		System.out.println("Dame una longitud");
		longitud = teclado.nextInt();
		}while(posicion+longitud>cadena.length());
		teclado.close();
		System.out.println("La subcadena pedida es: '"+funCadena(cadena, posicion, longitud)+"'");
	}

	public static String funCadena(String cadena,int posicion, int longitud) 
	{
		String cadenaResultado= new String();
		int i;
		for (i=posicion; i<longitud+posicion;i++) 
		{
			cadenaResultado=cadenaResultado+cadena.charAt(i);
		}
		return (cadenaResultado);

	}
}
