package es.studium.Suma;

import java.util.Scanner;

public class summa_resta_producto_cociente 
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
		System.out.println("La suma de los dos numeros es "+(n1+n2));
		System.out.println("La resta de los dos numeros es "+(n1-n2));
		System.out.println("La multiplicacion de los dos numeros es "+(n1*n2));
		
		if (n2==0)
		    System.out.println("No se puede realizar la divisi�n");
		else {
			float resultado;
			resultado=(float)n1/(float)n2;
		    System.out.println("La division de los dos numeros es "+ resultado);
			 }
	}

}
/*Operaciones - Realizar un programa en PSEUDOC�DIGO que lea dos n�meros
enteros por teclado y calcule su suma, su resta, su producto y su cociente cuando
fuera posible.
*/
/*PROGRAMA 18

VARIABLES
    ENTERO a, b
INICIO
    ESCRIBIR "Introduce el primer n�mero"
    LEER a
    
    ESCRIBIR "Introduce el segundo n�mero"
    LEER b
    
    ESCRIBIR "La suma de los dos n�meros " + (a+b)
    ESCRIBIR "La resta de los dos n�meros " + (a-b)
    ESCRIBIR "La multiplicaci�n de los dos n�meros " + (a*b)
    
        SI b = 0 ENTONCES
            ESCRIBIR "No se puede dividir"
        SINO
            ESCRIBIR "La divisi�n de los dos n�meros  " + (a/b)
        FINSI
FIN*/