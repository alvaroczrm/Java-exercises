package T_3;
import java.util.Scanner;
public class ej7_maximo_minimo_media {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int suma=0;
		int maximo;
		int minimo;
		int[] tabla=new int[10];
		for (int i=0;i<=9;i++)
		{
			tabla[i] = 0;
		}
		for (int i=0;i<=9;i++)
		{
			System.out.println("Indique el valor de la tabla en la posicion"+i);
			tabla[i] = teclado.nextInt();
		}
		maximo = tabla[0];
		minimo = tabla[0];
		for (int i=0;i<9;i++)
		{
			suma=suma+tabla[i];
			if(tabla[i]>maximo)
			{
				maximo=tabla[i];
			}
			if(tabla[i]<minimo)
			{
				minimo=tabla[i];
			}
		}
		System.out.println("La media de todos los n�meros indicados es: "+((float)suma/(float)10));
        System.out.println("El n�mero m�ximo de los indicados es: "+maximo);
        System.out.println("El n�mero m�nimo de los indicados es: "+minimo);
        teclado.close();
}
}
