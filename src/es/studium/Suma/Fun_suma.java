package es.studium.Suma;

import java.util.Scanner;

public class Fun_suma 
{

	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
		int a, b, resultado;
	System.out.println("Dame un valor");
		a = teclado.nextInt();
	System.out.println("Dame otro valor");
		b = teclado.nextInt();
		teclado.close();
		resultado= FunSuma(a,b);
		System.out.println(resultado);
	}
	public static int FunSuma (int a, int b)
	{
		int resultado;
		resultado =  a + b;
		return(resultado);
	}

}
/*Realizar un programa en PSEUDOC�DIGO que lea dos n�meros
enteros por teclado y muestre la suma de ambos mediante una funci�n.
*/
/*FUNCION funSum (ENTERO a,ENTERO b,) DEVUELVE ENTERO

VARIABLES
    ENTERO c
INICIO
    c=a+b
DEVOLVER c
FIN
PROGRAMA 12
VARIABLES
    ENTERO a,b
INICIO
    ESCRIBIR "Introduce el primer n�mero"
    LEER a
    ESCRIBIR "Introduce el segundo n�mero"
    LEER b
    ESCRIBIR "El resultado es " + funSum(a,b)
FIN*/