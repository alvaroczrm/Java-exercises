package T_3;

import java.util.Scanner;

public class ej8_posicion_maxima 
{

	  public static void main(String[] args) 
      {
                  Scanner teclado = new Scanner(System.in);
                  int maximo;
                  int[] tabla=new int[10];
                  for (int i=0;i<=9;i++)
                  {
                              System.out.println("Indique el valor de la tabla en la posición "+i);
                              tabla[i] = teclado.nextInt();
                  }
                  maximo=tabla[0];                  
                  for (int i=0;i<=9;i++)
                  {
                              if(tabla[i]>maximo)
                              {
                                         maximo=tabla[i];
                              }
                  }
                  System.out.println("El número máximo de los indicados es: "+maximo);
                  for (int i=0;i<=9;i++)
                  {
                              if(tabla[i]==maximo)
                              {
                                         System.out.println(i);
                              }
                  }
                  teclado.close();
      }
}

	
	
/**	public static void main(String[] args)
	{
	int n, max;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the number of elements in the array:");
	n = s.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the elements of array:");
	for(int i = 0; i < n; i++)
	{
	a[i] = s.nextInt();
	}
	max = a[0];
	for(int i = 0; i < n; i++)
	{
	if(max < a[i])
	{
	max = a[i];
	}
	}
	System.out.println("Maximum value in the array is:"+max);
	}
	}
**/