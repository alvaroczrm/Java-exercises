package T_3;

public class ej10_SumaPosiciones {

	public static void main(String[] args) {
		final int x=10,y=10;
		int tabla[][] = new int[x][y];
		int i,j;
		
		for(i=0; i<x; i++) {
			for(j=0; j<y; j++) {
				tabla[i][j]=i+j;
			}
		}
		for(i=0; i<x; i++) {
			for(j=0; j<y; j++) {
				System.out.print(tabla[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
