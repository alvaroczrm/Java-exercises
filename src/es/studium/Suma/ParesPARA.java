package es.studium.Suma;

import java.util.Scanner;

public class ParesPARA 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, i;
		System.out.println("Dame un numero");
			numero1 = teclado.nextInt();
		System.out.println("El numero introducido es " + numero1);
		System.out.println("Dame otro numero");
			numero2 = teclado.nextInt();
		System.out.println("El numero introducido es " + numero2);
			for(i=numero1;i<=numero2;i++)
			{
				if(i%2!=0) /* != no es igual == es igual lo que nos dara los pares */
				{
					System.out.println(i);
				}
			}
			teclado.close();
	}

}
