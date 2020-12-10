package T_3;

import java.util.Scanner;

public class ej15_letra_por_posicion 
{

	public static void main(String[] args) 
	{
		final int COLUMNAS = 3;
		final int FILAS = 3;
		char tabla[][] = new char[COLUMNAS][FILAS];
		int tabla2[][] = new int[COLUMNAS][FILAS];

		Scanner teclado = new Scanner(System.in);
		int i, j;
		for (i = 0; i < FILAS; i++) {
			for (j = 0; j < COLUMNAS; j++) {
				System.out.println("Dame la posición [" + i + "][" + j + "] = ");
				tabla[i][j] = teclado.nextLine().charAt(0);
			}
		}
		teclado.close();
		for (i = 0; i < FILAS; i++) 
		{
			for (j = 0; j < COLUMNAS; j++) 
			{
				tabla2[i][j] = tabla[i][j]-96;
			}

		}
		for (i = 0; i < FILAS; i++) 
		{
			for (j = 0; j < COLUMNAS; j++) 
			{
				System.out.println(tabla2[i][j]+"\t");
			}
			System.out.println();

		}

		

	}

}
