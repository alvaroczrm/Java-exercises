package T_3;

import java.util.Scanner;

public class ej12_tabla_traspuesta 
{

	public static void main(String[] args) 
	{
		final int COLUMNAS = 3;
		final int FILAS = 3;
		int tabla[][] = new int[COLUMNAS][FILAS];
		int traspuesta[][] = new int[COLUMNAS][FILAS];
		Scanner teclado = new Scanner(System.in);
        int i, j;
        for(i=0;i<FILAS;i++) {
                for(j=0;j<COLUMNAS;j++) {
                        System.out.println("Dame la posici�n ["+ i +"][" + j + "] = ");
                        tabla[i][j] = teclado.nextInt();
                }
        }
        teclado.close();
        for(i=0;i<FILAS;i++) {
                for(j=0;j<COLUMNAS;j++) {
                        traspuesta[j][i] = tabla[i][j];
                }
        }
        System.out.println("La tabla toma la siguiente forma: ");
        for(i=0;i<FILAS;i++) {
                for(j=0;j<COLUMNAS;j++) {
                        System.out.print("\t" + tabla[i][j]);
                }
                System.out.println("");
        }
        System.out.println("------------------------------");
        System.out.println("La tabla traspuesta toma la siguiente forma: ");
        for(i=0;i<FILAS;i++) {
                for(j=0;j<3;j++) {
                        System.out.print("\t" + traspuesta[i][j]);
                }
                System.out.println("");
        }
}

}