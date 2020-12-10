package T_3;

import java.util.Scanner;

public class ej11_compararCadenas 
{

	public static void main(String[] args) 
	{
		String c1,c2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena y te dire cual es la mayor alfabeticamente");
		c1 = teclado.nextLine();
		System.out.println("Dame otra cadena");
		c2 = teclado.nextLine();
		teclado.close();
		int r = c1.compareTo(c2);
		if (r > 0) {
			//es mas pequeño
			System.out.println(c2+ " es mayor ");
		}
		else if (r < 0) {
			//c1 es mas grande
			System.out.println(c1+ " es mas menor");
		}
		else {
			//son iguales
			System.out.println("son iguales");
		}
	}

}
