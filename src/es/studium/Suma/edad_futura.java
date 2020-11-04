package es.studium.Suma;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class edad_futura 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		Scanner Calendar = new
		int anyo;
		String nombre;
		System.out.println("Introduce tu año de nacimiento");
			anyo = teclado.nextInt();
		System.out.println("Introduce tu año de nacimiento");
			nombre = teclado.nextLine(); /*Line se usa para cadena*/
		teclado.close();
		if (anyo>)
		System.out.println("Hola "+ nombre + " en el año 2030 tendrás "+ (2030-anyo)+ " años");
			
	}

}
/*2030-Realizar un programa en PSEUDOCÓDIGO que pregunte el nombre y el
año de nacimiento del usuario y dé como resultado:
“Hola nombre, en el año 2030 tendrás n años.”*/
/*PROGRAMA A2030
VARIABLES
ENTERO anyo
CADENA nombre
INICIO
ESCRIBIR “Indique su nombre:”
LEER nombre
ESCRIBIR “Indique el año de su nacimiento:”
LEER anyo
ESCRIBIR “Hola” + nombre + “, en el año 2030 tendrás” + 2030-anyo + “años”
FIN 
*/