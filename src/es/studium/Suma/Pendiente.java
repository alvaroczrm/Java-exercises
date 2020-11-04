package es.studium.Suma;

import java.util.Scanner;

public class Pendiente 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int x1, x2, y1, y2;
		System.out.println("Introduce un numero para x1");
			x1 = teclado.nextInt();
		System.out.println("Introduce un numero para x2");
			x2 = teclado.nextInt();
		System.out.println("Introduce un numero para y1");
			y1 = teclado.nextInt();
		System.out.println("Introduce un numero para y2");
			y2 = teclado.nextInt();
		teclado.close();
		procPendiente(x1, x2, y1, y2);
	}
	public static void procPendiente(int x1, int x2, int y1, int y2) 
	{
		float m;
		m=((float)y2-(float)y1)/((float)x2-(float)x1);
		System.out.println("La pendiente es "+ m);
	}

}
/*Realizar un programa en PSEUDOCÓDIGO que calcule la pendiente
m de una recta dada por dos puntos de la misma (x1, y1) y (x2, y2) mediante un
procedimiento. La fórmula es la siguiente:*/
/*PROGRAMA 25 Pendiente
VARIABLES
ENTERO x1, x2, y1, y2
INICIO
ESCRIBIR “Indique el valor de x1:”
LEER x1
ESCRIBIR “Indique el valor de x2:”
LEER x2
ESCRIBIR “Indique el valor de y1:”
LEER y1
ESCRIBIR “Indique el valor de y2:”
LEER y2
procPendiente(x1, x2, y1, y2)
FIN
PROCEDIMIENTO procPendiente(ENTERO x1, x2, y1, y2)
VARIABLES
REAL m
INICIO
m=(y2-y1)/(x2-x1)
ESCRIBIR “La pendiente entre los dos puntos indicados es:”+m
FIN */