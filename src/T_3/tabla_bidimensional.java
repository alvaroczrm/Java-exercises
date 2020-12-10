package T_3;

import java.util.Scanner;

public class tabla_bidimensional 
{

	public static void main(String[] args) 
	{
		final int FILAS = 3;
		final int COLUMNAS = 4;
		char tabla[][] = new char[FILAS][COLUMNAS];
		Scanner teclado = new Scanner(System.in);
		int i, j;
		for (i=0;i<FILAS;i++) 
		{
			for(j=0;j<COLUMNAS;j++) 
			{
				System.out.println("dame el caracter ["+i+"]["+j+"]:");
				//dame el caracter [0][1]:
				tabla[i][j] = teclado.nextLine().charAt(0); //charAt transforma a caracter y 0 indica la posicion 
						// "h" -> 'h'   ("" cadeba '' caracter)
			}
		}
		for (i=0;i<FILAS;i++) {
			for(j=0;j<COLUMNAS;j++) {
				System.out.print(tabla[i][j]+"\t");
			}
		System.out.println();
		}
	}

}
