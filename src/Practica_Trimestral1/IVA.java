package Practica_Trimestral1;
import java.util.Scanner;
public class IVA {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float cantidad, iva, ivaFormat, resultado;
		System.out.println("Dame una cantidad monetaria");
		cantidad = teclado.nextFloat();
		if (cantidad == 0) {
			System.out.println("Fin del programa");
			System.exit(0);
		}
		else {
			System.out.println("Dame un iva");
			iva = teclado.nextFloat();
			teclado.close();
			ivaFormat = iva/100;
			resultado = cantidad*ivaFormat;
			System.out.println("Al aplicar el IVA la cantidad es "+(resultado+cantidad));
		}

	}

}
