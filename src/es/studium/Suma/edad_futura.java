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
		System.out.println("Introduce tu a�o de nacimiento");
			anyo = teclado.nextInt();
		System.out.println("Introduce tu a�o de nacimiento");
			nombre = teclado.nextLine(); /*Line se usa para cadena*/
		teclado.close();
		if (anyo>)
		System.out.println("Hola "+ nombre + " en el a�o 2030 tendr�s "+ (2030-anyo)+ " a�os");
			
	}

}
/*2030-Realizar un programa en PSEUDOC�DIGO que pregunte el nombre y el
a�o de nacimiento del usuario y d� como resultado:
�Hola nombre, en el a�o 2030 tendr�s n a�os.�*/
/*PROGRAMA A2030
VARIABLES
ENTERO anyo
CADENA nombre
INICIO
ESCRIBIR �Indique su nombre:�
LEER nombre
ESCRIBIR �Indique el a�o de su nacimiento:�
LEER anyo
ESCRIBIR �Hola� + nombre + �, en el a�o 2030 tendr�s� + 2030-anyo + �a�os�
FIN 
*/