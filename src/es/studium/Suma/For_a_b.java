package es.studium.Suma;

import java.util.Scanner;

public class For_a_b 
{

	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
		int a, b, i;
	System.out.println("Dame un numero");
		a = teclado.nextInt();
	System.out.println("Dame otro numero");
		b = teclado.nextInt();
		teclado.close();
		for(i=1;i<=a;i++)
		{
			System.out.println(b);	
		}
	}

}
/*Realizar un programa en PSEUDOC�DIGO que lea dos n�meros enteros
por teclado. El primero nos dir� el n�mero de veces que debe escribirse el
segundo introducido.
*/
/*PROGRAMA 10
VARIABLES
    ENTERO a, b, i
CONSTANTES

INICIO
    ESCRIBIR "Introduzca el primer valor"
    LEER a
    ESCRBIR "Introduzca el segundo valor"
    LEER b
    PARA i = 1 hasta i <= a HACER
        ESCRIBIR b
        LINEANUEVA()
    FINPARA
FIN*/