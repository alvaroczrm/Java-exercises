package es.studium.Suma;

import java.util.Scanner;

public class Suma 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, suma;
		System.out.println("Dame un numero");
			numero1 = teclado.nextInt();
		System.out.println("El numero introducido es " + numero1);
		System.out.println("Dame otro numero");
			numero2 = teclado.nextInt();
		System.out.println("El numero introducido es " + numero2);
			suma = numero1 + numero2;
		System.out.println("El resultado es " + suma);
	}
}
/*
PROGRAMA Suma
	VARIABLES 
		ENTERO numero1, numero2, suma
	INICIO
		ESCRIBIR "Dame un numero"
		LINEANUEVA()
		LEER numero1
		ESCRIBIR "Dame otro numero"
		LINEANUEVA()
		LEER numero2
		suma=numero1+numero2
		ESCRIBIR "La suma es" + suma
	FIN
*/

