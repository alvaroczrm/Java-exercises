package es.studium.Suma;

import java.util.Scanner;

public class Tabla_multiplicar 
{

	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
		int numero, i;
	System.out.println("Dame un numero");
		numero = teclado.nextInt();
		for(i=0;i<=10;i++)
		{
			System.out.println(numero + " x " + i + "=" + (numero*i));
		}	
			
	}
	
}
/*Tabla Multiplicar- Realizar un programa en PSEUDOCÓDIGO que lea un número
por teclado y escriba su tabla de multiplicar del 0 al 10*/
/*Programa 13

VARIABLES
    ENTERO a,i
INICIO
    PARA i = 0 hasta i <= 10 HACER
        ESCRIBIR a + "x" + i + "="+(a*i)
        LINEANUEVA()
    FINPARA
FIN*/