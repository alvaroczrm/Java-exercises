package es.studium.Suma;

import java.util.Scanner;

public class Potencias 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
			int base, exponente, resultado, i;
		System.out.println("Dame un numero");
			base = teclado.nextInt();
		System.out.println("Dame un exponente");
			exponente = teclado.nextInt();
		teclado.close();
		resultado=1;
		for(i=1;i<=exponente;i++)
		{
			resultado=resultado*base;
		}	
			System.out.println("El resutado es "+resultado);
	}

}
/*Programa 8
VARIABLES
        ENTERO base,exponente, resultado, i
CONSTANTES
INICIO
    ESCRIBIR "Introduzca el primer numero"
        LEER base
        ESCRIBIR "Introduzca el segundo numero"
        LEER exponente
         PARA i = 1 hasta exponente HACER
        resultado = resultado*base
        FINPARA
     ESCRIBIR "El numero" + base + "elevadoa" + exponente + "es" + resultado
FIN */