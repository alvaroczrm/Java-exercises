package repaso_navidad;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class final_ano 
{

	public static void main(String[] args) 
	{
		Calendar calendar1 = Calendar.getInstance();
		Scanner teclado = new Scanner (System.in);
		System.out.println("dame un año");
		int year = 0;
		int currentDay = calendar1.get(Calendar.DAY_OF_YEAR);
		
		//year = calendar1.get(Calendar.YEAR);
		
		Calendar calendar2 = new GregorianCalendar(year, 11, 31);
		int dayDecember31 = calendar2.get(Calendar.DAY_OF_YEAR);
		
		int days = dayDecember31 - currentDay;
		System.out.println(days+ " dias quedan para que termine este suplicio");
	}

}
