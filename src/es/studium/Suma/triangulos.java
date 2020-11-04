package es.studium.Suma;

import java.util.Scanner;

public class triangulos 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Introduce el primer lado ");
			n1= teclado.nextInt();
		System.out.println("Introduce el segundo lado ");
			n2= teclado.nextInt();
		System.out.println("Introduce el tercer lado ");
			n3= teclado.nextInt();
		teclado.close();
		 if(n1==n2 && n2==n3)
	            System.out.println("Equilatero");

	        else if(n1 >= (n2+n3) || n3 >= (n2+n1) || n2 >= (n1+n3) )
	            System.out.println("No es un triangulo");

	        else if ((n1==n2 && n2!=n3 ) || (n1!=n2 && n3==n1) || (n3==n2 && n3!=n1))
	            System.out.println("Isosceles");

	        else if(n1!=n2 && n2!=n3 && n3!=n1)
	            System.out.println("Escaleno");
	}

}
/*Introduciendo 3 parametros indica que tipo de triangulo es*/
/*Programa 21

VARIABLES
    ENTERO a, b, c
INICIO
    ESCRIBIR "Lado a"
        LEER a
    ESCRIBIR "Lado b"
        LEER b
    ESCRIBIR "Lado c"
        LEER c
SI a = b Y b = c ENTONCES
    ESCRIBIR "Los lados corresponden a un triangulo equilatero"
SINO    SI a = b O a = c O b = c ENTONCES
        ESCRIBIR "Los lados corresponden a un triangulo isoceles"
        SINO
            ESCRIBIR "Los lados corresponden a un triangulo escaleno"
        FINSI
FINSI
FIN*/