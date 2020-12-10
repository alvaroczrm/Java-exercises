package T_3;

import java.util.Scanner;

public class ej18_antisimetrica {
	public static void main(String[] args) {
		final int x = 3;
		final int y = 3;
		boolean simetrica = true;
		int tabla[][] = new int[x][y];
		Scanner teclado = new Scanner(System.in);
		int i, j;
		for (i = 0; i < x; i++) {
			for (j = 0; j < y; j++) {
				System.out.println("dame el caracter [" + i + "][" + j + "]:");
				tabla[i][j] = teclado.nextInt();
			}
		}
		for (i = 0; i < x; i++) {
			for (j = 0; j < y; j++) {
				if (tabla[i][j] !=-tabla[j][i]) {
					simetrica = false;
				}
			}
		}
		if (simetrica) {
			System.out.println("la matriz es antisimetrica");
		} else {
			System.out.println("la matriz no es antisimetrica");
		}
	}

}

