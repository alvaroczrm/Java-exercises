package es.studium.Suma;

import java.util.Scanner;

public class Suma_menu 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
			int numero1, numero2;
			char suma;
		System.out.println("Precione S s� quiere suma y cualquier tecla si quiere multiplicar");
		System.out.println("Dame un numero");
			numero1 = teclado.nextInt();
		System.out.println("El numero introducido es " + numero1);
		System.out.println("Dame otro numero");
			numero2 = teclado.nextInt();
		System.out.println("El numero introducido es " + numero2);
		 	if (char.equals("s"))
			{
				System.out.println("El resultado de la suma es " + (numero1 + numero2) );
			}
			else
			{
				System.out.println("El resultado de la multiplicaci�n es  " + (numero1 * numero2) );
			}
	}

}

/*PROGRAMA 4
VARIABLES 
    ENTERO num1,num2
    CARACTER sum
INICIO
    ESCRIBIR "Introduce el primer n�mero"
    LEER num1
    ESCRIBIR "Introduce el segundo n�mero"
    LEER num2
    ESCRIBIR "Si quieres sumar los dos n�meros presiona la tecla s si quieres que se multiplique pulsa otro caracter distinto"
    LEER sum
    SI sum = 's' ENTONCES
        ESCRINIR "La suma es " + (num1 + num2)
    SINO
        ESCRINIR "La multiplicaci�n es " + (num1 * num2)
    FINSI

FIN*/