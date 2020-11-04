package es.studium.Suma;

import java.util.Scanner;

public class intercambio_valores 
{

	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
		int a, b, inter;
	System.out.println("Dame un valor");
		a = teclado.nextInt();
	System.out.println("Dame otro valor");
		b = teclado.nextInt();
		teclado.close();
		inter = a;
		a = b;
		b = inter;
	}

}
/*-Realizar un programa en PSEUDOCÓDIGO que lea dos números
por teclado e intercambie sus valores. (2 versiones)*/
/*PROGRAMA 11
VARIABLES
    ENTERO a, b, inter
INICIO
    ESCRIBIR "Introduzca el primer valor"
    LEER a

    ESCRBIR "Introduzca el segundo valor"
    LEER b

     inter = a
     a = b
     b = inter

FIN*/