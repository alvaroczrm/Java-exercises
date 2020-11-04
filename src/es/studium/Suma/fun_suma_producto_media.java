package es.studium.Suma;

import java.util.Scanner;

public class fun_suma_producto_media 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Introduce el primer numero ");
		n1= teclado.nextInt();
		System.out.println("Introduce el segundo numero ");
		n2= teclado.nextInt();
		System.out.println("Introduce el tercer numero ");
		n3= teclado.nextInt();
		teclado.close();
		System.out.println("La suma de los tres numeros es "+funSuma(n1,n2,n3));
		System.out.println("El producto de los tres numeros es "+funMult(n1,n2,n3));
		
		if (n2==0)
		    System.out.println("No se puede realizar la división");
		else {
			 }
			if (n1==0)
			{
			 System.out.println("No se puede realizar la división");
			}
			else 
			{
			}
			if (n3==0) 
			{
				 System.out.println("No se puede realizar la división");
			}
			else 
			{
			}
	}
	public static int funSuma(int n1, int n2,int n3)
	{
		int resultado;
		resultado = n1 + n2 +n3;
		return(resultado);
	}
	public static int funMult(int n1, int n2, int n3)
	{
		int resultado;
		resultado = n1 * n2;
		return(resultado);
	}
	public static float funDiv(int n1, int n2,int n3)
	{
		float resultado;
		resultado =((float)n1+(float)n2+(float)n3)/3;
		return(resultado);
	}
}
/*Calcula la suma, producto y media de tres valores mediante funciones*/
/*Programa 20
VARIABLES
ENTERO a,b,c
INICIO
ESCRIBIR "Dame un número entero"
LEER a
LINEA NUEVA
ESCRIBIR "Dame otro número entero"
LEER b
ESCRIBIR "Dame un tercer número entero"
LEER c
ESCRIBIR "La suma de los tres números dados es: " + funsuma(a,b,c)
LINEA NUEVA
ESCRIBIR "El producto de los tres números dados es: " + funproducto(a,b,c)
LINEA NUEVA
ESCRIBIR "La media de los tres números dados es: " + funmedia(a,b,c)
FIN
FUNCION funmedia(ENTERO a ENTERO b, ENTERO c) DEVUELVE ENTERO
VARIABLES
DEVUELVE (a,b,c)/3
FIN
FUNCION funsuma(ENTERO a,ENTERO b, ENTERO c) DEVUELVE ENTERO
VARIABLES
DEVUELVE a+b+c
FIN

FUNCION funproducto(ENTERO a,ENTERO b,ENTERO c)
VARIABLES
DEVUELVE a*b*c
FIN*/