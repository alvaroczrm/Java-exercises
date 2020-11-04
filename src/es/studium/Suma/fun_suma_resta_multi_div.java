package es.studium.Suma;

import java.util.Scanner;

public class fun_suma_resta_multi_div 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduce el primer numero ");
		n1= teclado.nextInt();
		System.out.println("Introduce el segundo numero ");
		n2= teclado.nextInt();
		teclado.close();
		System.out.println("La suma de los dos numeros es "+funSuma(n1,n2));
		System.out.println("La resta de los dos numeros es "+funRest(n1,n2));
		System.out.println("La multiplicacion de los dos numeros es "+funMult(n1,n2));
		
		if (n2==0)
		    System.out.println("No se puede realizar la división");
		else {
		    System.out.println("La division de los dos numeros es "+ funDiv(n1,n2));
			 }
		
		}
			public static int funSuma(int n1, int n2)
			{
				int resultado;
				resultado = n1 + n2;
				return(resultado);
			}
			public static int funRest(int n1, int n2)
			{
				int resultado;
				resultado =  n1 - n2;
				return(resultado);
			}
			public static int funMult(int n1, int n2)
			{
				int resultado;
				resultado = n1 * n2;
				return(resultado);
			}
			public static float funDiv(int n1, int n2)
			{
				float resultado;
				resultado = (float) n1 / (float) n2;
				return(resultado);
			}

}
/*Operaciones - Realizar un programa en PSEUDOCÓDIGO que lea dos números
enteros por teclado y calcule su suma, su resta, su producto y su cociente cuando
fuera posible mediante funciones.*/
/*PROGRAMA 19
VARIABLES
    ENTERO a,b
INICIO
    ESCRIBIR "Introduce el primer número"
    LEER a
    ESCRIBIR "Introduce el segundo número"
    LEER b
    ESCRIBIR "La suma de los dos números " + funSum(a,b)
    ESCRIBIR "La resta de los dos números " + funRest(a,b)
    ESCRIBIR "La multiplicación de los dos números " + funMult(a,b)
    SI b = 0 ENTONCES
        ESCRIBIR "No se puede dividir"
    SINO
         ESCRIBIR "La división de los dos números  " + funDiv(a,b)
    FINSI
FIN

FUNCION funSum (ENTERO a,ENTERO b,) DEVUELVE ENTERO

VARIABLES
    ENTERO c
INICIO
    c=a+b
DEVOLVER c
FIN

FUNCION funRest (ENTERO a,ENTERO b,) DEVUELVE ENTERO

VARIABLES
    ENTERO c
INICIO
    c=a+b
DEVOLVER c
FIN

FUNCION funMult (ENTERO a,ENTERO b,) DEVUELVE ENTERO

VARIABLES
    ENTERO c
INICIO
    c=a*b
DEVOLVER c
FIN

FUNCION funDiv (ENTERO a,ENTERO b,) DEVUELVE REAL

VARIABLES
    REAL c
INICIO
    c=a/b
DEVOLVER c
FIN*/