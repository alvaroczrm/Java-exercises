package T_3;

import java.util.Scanner;

public class ej6_igualdad_cadenas 
{

	public static void main(String[] args) 
	{
		String txt1, txt2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("dame una cadena");
		txt1=teclado.nextLine();
		System.out.println("dame una cadena");
		txt2=teclado.nextLine();
		teclado.close();
		if (txt1.equals(txt2)) {
			System.out.println("Son iguales las cadenas");
		}
		else {
			System.out.println("no son iguales");
		}
	}

}
