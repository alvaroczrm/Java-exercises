package repaso_navidad;

import java.util.Scanner;

public class leer_10 
{	
	static int tabla[] = new int [10];
	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		for (int i=0; i<tabla.length;i++)
        {
            System.out.println("Dame un numero para la posición [" + (i+1)+"]");
            tabla[i] = teclado.nextInt();
        }
		for (int i = tabla.length -1; i >= 0; i--) 
		{
			System.out.println(tabla[i]);
		}
		System.out.println("la media es "+media(tabla));
		teclado.close();
	}

	public static double media(int[] tabla) 
	{
		double resultado;
		double media = 0.0;
		for (int i = 0; i < tabla.length; i++) {
			media = media + tabla[i];
		}
		media = media / tabla.length;

		resultado = media;
		return resultado;
		
	}

}
