package T_3;

public class ej1_rellenar_tabla_pares 
{
public static void main(String[] args) 
{
	int Pares[] = new int [20];
	for (int i=0;i<=19;i++) 
	{
		Pares[i]=(i+1)*2;
		
	}
	for (int i=0;i<=19;i++)
	{
		System.out.println(Pares[i]);
	}
}

}
