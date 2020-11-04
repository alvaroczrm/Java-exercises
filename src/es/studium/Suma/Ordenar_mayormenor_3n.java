package es.studium.Suma;

import java.util.Scanner;

public class Ordenar_mayormenor_3n 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Introduce el primer numero ");
		n1= teclado.nextInt();
		System.out.println("Introduce el segundo numero ");
		n2= teclado.nextInt();
		System.out.println("Introduce el ultimo numero ");
		n3= teclado.nextInt();
		teclado.close();
		 if(n1>n3)
	        {
	            if(n2>n3)
	                {
	                    System.out.println("Los numeros ordenados son="+n3+n2+n1);
	                }
	            else
	            {
	                if(n1>n3)
	                {
	                    System.out.println( "Los numeros ordenados son=" + n2+n3+n1);
	                }
	                else
	                {
	                    System.out.println("Los numeros ordenados son=" + n2+n1+n3);
	                }
	            }
	        }
	        else
	        {
	            if(n1>n3)
	            {
	                System.out.println("Los numeros ordenados son="+ n3+n1+n2);
	            }
	            else
	            {
	                if(n2>n3)
	                {
	                    System.out.println( "Los numeros ordenados son=" + n1+n3+n2);
	                }
	                else
	                {
	                    System.out.println("Los numeros ordenados son=" +n1+n2+n3);

	                }
	            }
	        }
	}

}
/*Realizar un programa en PSEUDOCÓDIGO que lea tres
números enteros y los ordene de mayor a menor.*/
/*Programa 17

VARIABLES
    ENTERO N1, N2, N3
INICIO
    ESCRIBIR "INGRESE LOS NUMEROS"
    Leer N1, N2, N3
SI N1 > N2 ENTONCES
    SI N2 > N3 ENTONCES
        ESCRIBIR "Los numeros ordenados son=" N3, N2, N1
    SINO
        SI N1 > N3 ENTONCES
            ESCRIBIR "Los numeros ordenados son=" N2, N3, N1
        SINO
            ESCRIBIR "Los numeros ordenados son=" N2, N1, N3
        FINSI
    FINSI
SINO
    SI N1 > N3 ENTONCES
        ESCRIBIR "Los numeros ordenados son=" N3, N1, N2
    SINO
        SI N2 > N3 ENTONCES
            ESCRIBIR "Los numeros ordenados son=" N1, N3, N2
        SINO
            ESCRIBIR "Los numeros ordenados son=" N1, N2, N3
        FINSI
    FINSI
FINSI
FIN*/