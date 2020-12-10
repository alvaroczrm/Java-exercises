package T_3;

import java.util.Scanner;

public class ej12_comparar_mayor_cadena {

	public static void main(String[] args) {
		String[]tabla=new String[5];
		Scanner teclado = new Scanner(System.in);
		String base = null;
		for (int i=0;i<(tabla.length);i++) {
			System.out.println("Escriba la palabra numero" +(i+1));
			tabla[i]=teclado.nextLine();
		}
		base = tabla[0];
		for (int i=0;i<tabla.length;i++) {
			if (tabla[i].compareTo(base)>0) {
				base = tabla[i];
			}
		}
		System.out.println("La cadena alfabeticamente mayor es: "+base);
		teclado.close();
	}

}
