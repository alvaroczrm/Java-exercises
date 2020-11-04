package es.studium.Suma;

import java.util.Scanner;

public class Meses_numero 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int a;
		System.out.println("Introduce el numero del mes");
		a = teclado.nextInt();
			switch(a) 
			{
			case 1: System.out.println("enero");
			break;
			case 2: System.out.println("febrero");
			break;
			case 3: System.out.println("marzo");
			break;
			case 4: System.out.println("abril");
			break;
			case 5: System.out.println("mayo");
			break;
			case 6: System.out.println("junio");
			break;
			case 7: System.out.println("julio");
			break;
			case 8: System.out.println("agosto");
			break;
			case 9: System.out.println("septiembre");
			break;
			case 10: System.out.println("octubre");
			break;
			case 11: System.out.println("noviembre");
			break;
			case 12: System.out.println("diciembre");
			break;
			}

	}

}
/*Meses - Realizar un programa en PSEUDOCÓDIGO que lea un entero entre 1 y
12 y escriba por pantalla el nombre del mes al que corresponde*/
/*PROGRAMA ejercicio15
VARIABLES
    ENTERO a
INICIO
    ESCRIBIR "Introduce el nuemro del mes del 1 al 12"
    LEER a
    SEGUN a HACER
        CASO1 :
            ESCRIBIR "Enero"
        CASO2 :
            ESCRIBIR "Febrero"
        CASO3 :
            ESCRIBIR "Marzo"
        CASO4 :
            ESCRIBIR "Abril"
        CASO5 :
            ESCRIBIR "Mayo"
        CASO6 :
            ESCRIBIR "Junio"
        CASO7 :
            ESCRIBIR "Julio"
        CASO8 :
            ESCRIBIR "Agosto"
        CASO9 :
            ESCRIBIR "Septiembre"
        CASO10 :
            ESCRIBIR "Octubre"
        CASO11 :
            ESCRIBIR "Nobiembre"
        CASO12 :
            ESCRIBIR "Diciembre"
        DEFECTO:
            ESCRIBIR “Numero no correcto”
    FIN SEGUN
FIN*/