package es.studium.Suma;

import java.util.Scanner;

public class mayor_que 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Dame un numero");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro numero");
		numero2 = teclado.nextInt();
			if (numero1>numero2)
			  System.out.println(numero1 + " es mayor que " + numero2);
			if (numero1<numero2)
			  System.out.println(numero1 + " es menor que " + numero2);
			else
			  System.out.println(numero2 + " es igual que " + numero1);
	}

}

/*Programa 7
CONSTANTES
VARIABLES
    REAL var1,var2
INICIO
    ESCRIBIR "Introduzca el primer numero"
        LEER var1
        ESCRIBIR "Introduzca el segundo numero"
        LEER var2
        SI var1 > var2 ENTONCES
            ESCRIBIR var1 + "es mayor que" + var2
        SI var1 > var2 ENTONCES
        SINO
                ESCRIBIR var1 + "es menor que" + var2
            SI var1 = var2 ENTONCES
            SINO
                ESCRIBIR var1 + "es igual que" + var2
            FINSI
        FINSI

FIN */