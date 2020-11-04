package es.studium.Suma;

import java.util.Scanner;

public class Binario_decimal 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int a, b, c, d, e;
		System.out.println("Introduce el primer numero ");
			a= teclado.nextInt();
		System.out.println("Introduce el segundo numero ");
			b= teclado.nextInt();
		System.out.println("Introduce el tercero numero ");
			c= teclado.nextInt();
		System.out.println("Introduce el cuartonumero ");
			d= teclado.nextInt();
		System.out.println("Introduce el ultimo numero ");
			e= teclado.nextInt();
		teclado.close();
		if (a==0 || a==1 && b==0 || b==1 && c==0 || c==1 && d==0 || d==1 && e==0 || e==0) 
		{
			System.out.println("El numero decimal es " + funDecimal(a, b, c, d, e));
		}
		else
		{
			System.out.println("Un digito no es ni un 1 ni un 0");
		}
	}
	public static int funDecimal(int a, int b, int c, int d, int e)
	{
		float resultado;
		resultado = (1*a)+(2*b)+(4*c)+(8*d)+(16*e);
		return (int) (resultado);
	}
}
/*Introducir numero en binario de 5 bits y traducirlo a decimal*/
/*Programa 22

VARIABLES
    ENTERO a,b,c,d,e
INICIO
    ESCRIBIR "Introduce el primer digito:"
        LEER a
    ESCRIBIR "Introduce el segundo digito:"
        LEER b
    ESCRIBIR "Introduce el tercer digito:"
        LEER c
    ESCRIBIR "Introduce el cuarto digito:"
        LEER d
    ESCRIBIR "Introduce el quinto digito:"
        LEER e

    SI a=0 O a=1 Y b=0 O b=1 Y c=0 O c=1 Y d=0 O d=1 Y e=0 O e=1
        ESCRIBIR "El numero en decimal es "+ funDecimal(a,b,c,d,e)
    SINO
        ESCRIBIR "Un digitos no es ni un 1 ni un 0"
FIN

FUNCION funDecimal (ENTERO a,ENTERO b,ENTERO c,ENTERO d,ENTERO e) DEVUELVE ENTERO

VARIABLES
    ENTERO r
INICIO
    r=(1*a)+(2*b)+(4*c)+(8*d)+(16*e)
DEVOLVER r
FIN*/