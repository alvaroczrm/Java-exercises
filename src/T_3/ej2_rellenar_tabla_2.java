package T_3;
import java.util.Scanner;

public class ej2_rellenar_tabla_2 
{

	public static void main(String[] args) 
	{
		int tabla[] = new int[3];
		int i;
		Scanner teclado = new Scanner(System.in);
		//Recorrido para rellenar la tabla
		for(i=0;i<3;i++)
		{
			System.out.println("Ingrese el valor de la posicion "+i+":");
			tabla[i] = teclado.nextInt();
		}
		//Recorrido para mostrar los valores de la tabla
		for(i=0;i<3;i++)
		{
			System.out.println("Tabla["+i+"]="+tabla[i]);
		}
		teclado.close();

	}
}
