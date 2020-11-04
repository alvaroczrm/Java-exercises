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
		    System.out.println("No se puede realizar la división");
		else {
			float resultado;
			resultado=(float)n1/(float)n2;
		    System.out.println("La division de los dos numeros es "+ resultado);
			 }
	}

}
/*Operaciones - Realizar un programa en PSEUDOCÓDIGO que lea dos números
enteros por teclado y calcule su suma, su resta, su producto y su cociente cuando
fuera posible.
*/
/*PROGRAMA 18

VARIABLES
    ENTERO a, b
INICIO
    ESCRIBIR "Introduce el primer número"
    LEER a
    
    ESCRIBIR "Introduce el segundo número"
    LEER b
    
    ESCRIBIR "La suma de los dos números " + (a+b)
    ESCRIBIR "La resta de los dos números " + (a-b)
    ESCRIBIR "La multiplicación de los dos números " + (a*b)
    
        SI b = 0 ENTONCES
            ESCRIBIR "No se puede dividir"
        SINO
            ESCRIBIR "La división de los dos números  " + (a/b)
        FINSI
FIN*/