package T_3;

import java.util.Scanner;

public class ej13_suma_matrices {

	public static void main(String[] args) {
		final int COLUMNAS = 3;
		final int FILAS = 3;
		int tabla1[][] = new int[COLUMNAS][FILAS];
		int tabla2[][] = new int[COLUMNAS][FILAS];
		int tabla3[][] = new int[COLUMNAS][FILAS];
		Scanner teclado = new Scanner(System.in);
        int i, j;
        for(i=0;i<FILAS;i++) 
        {
                for(j=0;j<COLUMNAS;j++) 
                {
                        System.out.println("Dame la posición ["+ i +"][" + j + "] = ");
                        tabla1[i][j] = teclado.nextInt();
                }
        }
        for(i=0;i<FILAS;i++) 
        {
                for(j=0;j<COLUMNAS;j++) 
                {
                        System.out.println("Dame la posición ["+ i +"][" + j + "] = ");
                        tabla2[i][j] = teclado.nextInt();
                }
        }
        for(i=0;i<FILAS;i++) 
        {
                for(j=0;j<COLUMNAS;j++) 
                {
                	tabla3[i][j] = tabla1[i][j] + tabla2[i][j];
                }
        }
        for(i=0;i<FILAS;i++) 
        {
            for(j=0;j<COLUMNAS;j++) 
            {
                    System.out.print("\t" + tabla3[i][j]);
            }
            System.out.println("");
        }
        teclado.close();
	}

}
