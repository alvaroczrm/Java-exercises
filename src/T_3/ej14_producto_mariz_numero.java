package T_3;

import java.util.Scanner;

public class ej14_producto_mariz_numero {

	public static void main(String[] args) {
		final int COLUMNAS = 3;
		final int FILAS = 3;
		int n;
		int tabla[][] = new int[COLUMNAS][FILAS];
		Scanner teclado = new Scanner(System.in);
		System.out.println("dame un numero para multiplicar la matriz");
		n = teclado.nextInt();
		int i, j;
		for (i = 0; i < FILAS; i++) {
			for (j = 0; j < COLUMNAS; j++) {
				System.out.println("Dame la posición [" + i + "][" + j + "] = ");
				tabla[i][j] = teclado.nextInt();
			}
		}
		for (i = 0; i < FILAS; i++) {
			for (j = 0; j < COLUMNAS; j++) {
				System.out.print(n * tabla[i][j] + "\t");
			}
			System.out.println("");
		}
		teclado.close();
	}
}
