package T_3;

import java.util.Scanner;

public class ej7_Longitud_Cadena {

	public static void main(String[] args) 
	   {
        Scanner teclado = new Scanner(System.in);
        String cadena1;
        System.out.println("Introduzca primera cadena");
        cadena1=teclado.nextLine();
        teclado.close();
        System.out.println("La longitud con espacios "+cadena1.length());
        System.out.println("La longitud sin espacios "+sinEspacios(cadena1));

    }
    public static int sinEspacios(String c)
    {
        int longitud=0;
        int i;
        for(i=0;i<c.length();i++)
        {
            if(c.charAt(i)!=' ')
            {
                longitud ++;
            }
        }
        return longitud;

    }
}
