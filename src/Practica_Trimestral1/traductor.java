package Practica_Trimestral1;

import java.util.Scanner;

public class traductor { // un array por variable conteniendo en el mismo orden sus respectivos
							// equivalentes
	public static String[] Spanish = { "yo", "tu", "el", "ella", "soy", "eres", "es", "alto", "bajo" };
	public static String[] English = { "I", "you", "he", "she", "am", "are", "is", "tall", "short" };
	public static String traduccion = null;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabra;
		System.out.println("What do you want to translate? // ¿Que quieres traducir?");
		palabra = teclado.nextLine();
		teclado.close();
		funTraductor(palabra); // llama la funcion
		if (traduccion == null) {
			System.out.println("no esta en el diccionario");
		} else {
			System.out.println("La traduccion es " + traduccion);
		}
	}

	public static void funTraductor(String palabra) {
		for (int i = 0; i < Spanish.length; i++) // recorre el array en busca de la palabra
		// for (String i : Spanish)
		{
			if (palabra.equals(Spanish[i])) // comprueba palabra por cada incremento del for sobre el array
			{
				traduccion = English[i]; // aplica el incremento en el array English y lo guarda en la variable
				break;
			}

		}
		for (int i = 0; i < English.length; i++) {
			if (palabra.equals(English[i])) {
				traduccion = Spanish[i];
				break;
			}

		}
	}
}

/*
 * Since you explained you are new to Java, I think someone has to put you in
 * the right track.
 * 
 * Needless to say, I won't provide you with code, which is very easy, because
 * you need to learn to type your ideas into code.
 * 
 * Will give you a couple of ideas that all programmers use daily.
 * 
 * When you use arrays, they are like a set of blocks. What contain does blocks?
 * essentially what you made the array of. In java, you can have an array of
 * ints, or an array of Strings, and so on. They arrays are a set of the same
 * data type.
 * 
 * In your activity you have to construct 3 structures (3 arrays). 1. words in
 * english (String) 2. words in the other language (String) 3. image linked to
 * the word (Image?)
 * 
 * All the arrays work with indexes. Which enables you to spot what object from
 * all the set you are trying to refer.
 * 
 * e.g.
 * 
 * An array of colours (which is an array of strings): [ pink ] [yellow] [blue]
 * 0 1 2
 * 
 * The index, is the number of the place in your array, the n(th) element. They
 * usually start from 0 in most languages. Java starts from 0. This is an array
 * of size 3. But the last element has an index of 2. So if you need to do
 * something with blue, you'll use number 2. If yellow, number 1, and so on.
 * 
 * Please refer here for an explained tutorial on indexes and arrays.
 * 
 * Now, the key part in your assignment is to search if the words exists or not.
 * If the input is always in english then you need to search if the word exists
 * in your english array (you can use for each , look that up in google), if its
 * in the other language then look in such array. The simplest way would be to
 * search in all of the arrays until you hit the result, and retrieve the index.
 * 
 * You can set up your arrays to have the same meaningful word in the same
 * order.
 * 
 * example (4 arrays, 3 languages, 1 for images)
 * 
 * [apple] [manzana] [pomme de terre] [apple_image] [grapefruit] [uva] [raisin]
 * [grapefruit_image]
 * 
 * If you know which index is the word that was typed (after searched for it),
 * then you will just return the image in the place but from the array of images
 * (with that index).
 * 
 * If the word is not found, then just print a message saying, is not in the
 * dictionary. This can happen if you "iterate" your arrays and found no result.
 * 
 * Please try to set up a code and whatever language you want and then repost it
 * here, so we can take a look at your development.
 * 
 * Good luck. Programming is fun!, enjoy it!
 */