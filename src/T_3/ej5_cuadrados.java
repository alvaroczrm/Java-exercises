package T_3;

import java.util.Scanner;

public class ej5_cuadrados 
{
	public static void main(String[] args) 
	{
    Scanner teclado = new Scanner(System.in);
    int[] tabla1 = new int[10];
    int numero;
    System.out.println("Indique un n�mero:");
    numero = teclado.nextInt();
    for (int i=0;i<10;i++)
    {
                tabla1[i]=i+(numero+1);
    }
    for (int i=0;i<10;i++)
    {
                tabla1[i] = tabla1[i]*tabla1[i];
    }
    for (int i=0;i<10;i++)
    {
                System.out.println("Tabla["+i+"]="+tabla1[i]);
    }
    teclado.close();
}
}
