package es.studium.Suma;

import java.util.Scanner;

public class suma_mayor_multiplicacion 
{

	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
		int a, b, r;
	System.out.println("Dame un numero");
		a = teclado.nextInt();
	System.out.println("Dame otro numero");
		b = teclado.nextInt();
	if (a<b)
		System.out.println("El resultado es "+ (a+b) );
	else 
		System.out.println("El resultado es "+ (a*b) );
	}

}
/*PROGRAMA 9

VARIABLES
    ENTERO var1, var2, r
CONSTANTE

INICIO
    ESCRIBIR "Introduzca el primer valor"
    LEER var1
    ESCRBIR "Introduzca el segundo valor"
    LEER var2
        SI var1 < var2 ENTONCES
            ESCRIBIR "El resultado es" + (var1 + var2)
        SINO
            ESCRIBIR "El resultado es" + (var1 * var2)
        FINSI
FIN*/