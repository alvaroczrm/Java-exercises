package repaso_navidad;

public class cadena_mas_corta {

	public static void main(String[] args) {
		 String [] Tabla = {"hello", "goodbye", "jack", "bye", "yes", "no", "yoo"};
	        smallest(Tabla);
	        System.out.println("The shortest word is " + smallest(Tabla));
	    }

	    public static String smallest(String Tabla[]) {
	        String first = Tabla[0];
	        for (int i = 1 ; i < Tabla.length ; i++) {
	            if ((Tabla[i].compareTo(first)) < 0) {
	                first = Tabla[i];
	            } // if
	        } // for
	        return first;
	    }// smallest
	}// lab1b