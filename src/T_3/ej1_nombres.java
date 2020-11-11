package T_3;

import java.util.Scanner;

public class ej1_nombres 
{

	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
	String nombre1, nombre2, nombre3, nombre4, nombre5 = new String();
	// si usamos next, no nos deja poner nombres como Julio Cesar, hay que usar nextLine para nombres compuestos
		System.out.println("Dame el primer nombre");
		nombre1 = teclado.nextLine();
		System.out.println("Dame el segundo nombre");
		nombre2 = teclado.nextLine();
		System.out.println("Dame el tercer nombre");
		nombre3 = teclado.nextLine();
		System.out.println("Dame el cuarto nombre");
		nombre4 = teclado.nextLine();
		System.out.println("Dame el quinto nombre");
		nombre5 = teclado.nextLine();
		teclado.close();
		System.out.println("El primer nombre es "+ nombre1);
		System.out.println("El segundo nombre es "+ nombre2);
		System.out.println("El tercer nombre es "+ nombre3);
		System.out.println("El cuarto nombre es "+ nombre4);
		System.out.println("El quinto nombre es "+ nombre5);

	}

}
/*1. Nombres - Realizar un programa que lea 5 nombres y los muestre por pantalla.*/