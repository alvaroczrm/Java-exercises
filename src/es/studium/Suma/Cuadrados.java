package es.studium.Suma;

public class Cuadrados 
{

	public static void main(String[] args) 
	{
		System.out.println("La suma de los cuadrados de los 100 primeros n�meros naturales\r\n"
				+ "es " +funSumaCuadrados());
	}
	public static int funSumaCuadrados()
	{
		int resultado,i;
		resultado = 0;
		for(i=0;i<=99;i++) 
		{
			resultado = + (i*i);
		}	
		return (int) (resultado);
	}
}
/*Realizar un programa en PSEUDOC�DIGO que calcule la suma de
los cuadrados de los 100 primeros n�meros naturales mediante una funci�n.*/
/*PROGRAMA 22 SumaCuadrados
VARIABLES
INICIO
ESCRIBIR �La suma de los cuadrados de los 100 primeros n�meros naturales
es:�+SumaCuadrados()
FIN
FUNCION SumaCuadrados() DEVUELVE ENTERO
VARIABLES
ENTERO resultado, i
resultado=0
INICIO
PARA i=0 HASTA 99 HACER
resultado=resultado+(i*i)
FIN PARA
DEVOLVER resultado
FIN */