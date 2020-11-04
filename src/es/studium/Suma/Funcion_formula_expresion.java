package es.studium.Suma;

import java.util.Scanner;

public class Funcion_formula_expresion 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		System.out.println("Introduce un numero para a");
		a = teclado.nextInt();
		System.out.println("Introduce un numero para b");
		b = teclado.nextInt();
		System.out.println("Introduce un numero para c");
		c = teclado.nextInt();
		System.out.println("El resultado de la funcion es "+ funExpresion(a,b,c));
		teclado.close();
	}
	public static float funExpresion(int a, int b, int c)
	{
		float resultado;
		resultado=((float)b*(float)b-4*(float)a*(float)c)/2*(float)a;
		return(resultado);
	}
}
/*. Expresión-Realizar un programa en PSEUDOCÓDIGO que calcule mediante una
función la siguiente expresión:*/
/*PROGRAMA 16
PROGRAMA Expresion

VARIABLES
    ENTERO a, b, c

    INICIO
        ESCRIBIR "Introduce un numero:"
        LEER a
        LINEANUEVA()
        ESCRIBIR "Introduce un numero:"
        LEER b
        LINEANUEVA()
        ESCRIBIR "Introduce un numero:"
        LEER c
        LINEANUEVA()

        ESCRIBIR "El resultado de la funcion es " + funcion(a,b,c)
    FIN

    FUNCION funcion(ENTERO a, b, c) DEVUELVE REAL
        INICIO
            DEVUELVE ((bb)-4ac)/2a
        FIN*/