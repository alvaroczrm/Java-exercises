package T_3;

import java.util.Scanner;

public class ej17_suma2 {

	 public static void main(String[] args) 
     {
                 Scanner teclado = new Scanner(System.in);
                 int numero,suma=0;
                 System.out.print("Indique la longitud del vector: ");
                 numero=Integer.parseInt(teclado.nextLine());
                 int[]vector=new int[numero];
                 for (int i=0;i<numero;i++)
                 {
                             System.out.println("Indique el n�mero del vector situado en la posici�n "+i);
                             vector[i] = teclado.nextInt();
                 }
                 for (int i=0;i<numero;i++)
                 {
                             System.out.print(vector[i]+"\t");
                             suma+=vector[i];
                 }
                 System.out.println();
                 System.out.println("La suma de todos los elementos del vector es: "+suma);        
                 teclado.close();
     }
}
