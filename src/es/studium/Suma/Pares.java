package es.studium.Suma;

import java.util.Scanner;

public class Pares 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
			int numero1;
		System.out.println("Dame un numero");
			numero1 = teclado.nextInt();
		System.out.println("El numero introducido es " + numero1);
		if (numero1%2==0)
		    System.out.println("El número es par");
		else
		    System.out.println("El número es impar");
	}

}

/*PROGRAMA ejercicio3
VARIABLES
    ENTERO a
INICIO
    ESCRIBIR "Introduce el número"
    LEER a
    SI a%2 = 0 ENTONCES
        ESCRIBIR "El número " + a " es par"
    SINO 
        ESCRIBIR "El número " + a " es inpar"
    FINSI
FIN*/