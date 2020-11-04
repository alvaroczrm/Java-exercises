package es.studium.Suma;

import java.util.Scanner;

public class Potencias2 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int base, exponente, resultado;
		System.out.println("Dame una base");
		base = teclado.nextInt();
		System.out.println("Dame un exponente");
		exponente = teclado.nextInt();
		System.out.println("Resultado "+ funPotencia (base,exponente));
		teclado.close();
	}
	public static int funPotencia(int exponente, int base)
	{
		int i, resultado;
		resultado = 1;
			for(i=1;i<=exponente;i++)
			{
				resultado=resultado*base;
			}	
		return(resultado);
	}
}
/*Potencia2- Realizar un programa en PSEUDOCÓDIGO que calcule a elevado a b
mediante una función.*/
/*FUNCION funPotencia (ENTERO base,ENTERO expoente) DEVUELVE ENTERO

VARIABLES
    ENTERO i, resultado
INICIO
    resultado = 1
    PARA i = 1 hasta i <= exponete HACER
        resultado = resultado*base
    FINPARA
DEVOLVER resultado
FIN

PROGRAMA 14
VARIABLES
    ENTERO base,exponente,resultado 
INICIO
    ESCRIBIR "Introduce la base:"
    LEER base
    ESCRIBIR "Introduce el exponente:"
    LEER exponente

    ESCRIBIR "Resultado"+ funPotencia (base,exponente)
FIN*/