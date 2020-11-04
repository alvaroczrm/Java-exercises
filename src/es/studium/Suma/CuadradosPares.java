package es.studium.Suma;

public class CuadradosPares 
{

	public static void main(String[] args) 
	{
		int i;
		for(i=1;i<=100;i++)
		if(i%2==0) 
		{
			System.out.println("La suma de los cuadrados pares de los 100 primeros números naturales es " +funCuadrados(i));
		}
	}
	public static int funCuadrados(int i)
	{	
		return i*i;
	}
}
/*s- Realizar un programa en PSEUDOCÓDIGO que muestre por
pantalla los cuadrados de los pares entre 1 y 100 mediante una función.*/
/*PROGRAMA 24 CuadradosPares
VARIABLES
ENTERO i, resultado
INICIO
PARA i = 1 HASTA 100 HACER
SI i%2 = 0 ENTONCES
resultado = calcular(i)
ESCRIBIR resultado
LINEA NUEVA
FINSI
FINPARA
FIN
FUNCION calcular(ENTERO i) DEVUELVE ENTERO
INICIO
DEVOLVER i*i
FIN */