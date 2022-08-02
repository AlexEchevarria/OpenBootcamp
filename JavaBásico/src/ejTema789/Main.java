package ejTema789;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	// 1
	public static String reverse(String texto) {
		StringBuilder sb = new StringBuilder(texto);
		String reverseString = sb.reverse().toString();
		return reverseString;
	}
	
	public static String DividePorCero(int number) throws ArithmeticException {
		if(number / number == 0) {}

		return "Demo de codigo";
	}
	
	public static void getArchivo(String fileIn, String fileOut) throws IOException {
		InputStream in = new FileInputStream(fileIn);
		byte [] data = in.readAllBytes();
		
		PrintStream out = new PrintStream(fileOut);
		out.write(data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//función 1
		//Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
		String cadena = "Hola mundo";
		System.out.println("Ejercicio 0");
		System.out.println(reverse(cadena));
		System.out.println("\n");
		
		// 1
		//Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
		System.out.println("Ejercicio 1");
		String [] sbArray = { "Hola", "Soy", "Ale" };
		for( String s : sbArray) {
			System.out.println(s);
		}
		System.out.println("\n");
		
		// 2
		// Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
		System.out.println("Ejercicio 2");
		int [][] arrayNumeros = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0;i<arrayNumeros.length;i++) {
			for(int j=0;j<arrayNumeros.length;j++) {
				System.out.println("Pos i:" + i + ", Pos j: " + j + ", Valor:" + arrayNumeros[i][j]);
			}
		}
		System.out.println("\n");
		
		// 3
		// Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
		System.out.println("Ejercicio 3");
		Vector<String> v = new Vector<String>();
		v.add("Hola"); v.add("que"); v.add("tal"); v.add("soy"); v.add("Ale");
		System.out.println(v);
		v.removeElementAt(1); 
		v.removeElementAt(1);
		// Si queremos eliminar el elemento 2do y 3ro, necesitamos coger el elemento -1 de la posición
		// que buscamos. Al eliminar 1 elemento en el vector, se reajusta la posición.
		System.out.println(v);
		System.out.println("\n");
		
		// 4
		// Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
		System.out.println("Ejercicio 4");
		/** 
		 * El problema sería que tendría mucha sobrecarga al tener que sincronizar todas las adiciones.
		 * 
		*/
		System.out.println("\n");
		
		// 5
		// Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
		System.out.println("Ejercicio 5");
		ArrayList<String> lista = new ArrayList<>();
		lista.add("lista"); lista.add("para"); lista.add("ser"); lista.add("copiada");
		LinkedList<String> listaEnlazada = new LinkedList<>();
		for(String s : lista) {
			listaEnlazada.add(s);
		}
		
		System.out.println("lista: " + lista);
		System.out.println("listaEnlazada: " + listaEnlazada);	
		System.out.println("\n");
		
		// 6
		// Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. 
		// A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. 
		// Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
		System.out.println("Ejercicio 6");
		
		ArrayList<Integer> listaEnteros = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			listaEnteros.add(i);
		}
		System.out.println("lista enteros: " + listaEnteros);
		
		for(int i=0;i<listaEnteros.size();i++) {
			if(listaEnteros.get(i) % 2 == 0) {
				listaEnteros.remove(i);
			}
		}
		System.out.println("lista enteros: " + listaEnteros);
		System.out.println("\n");
		
		// 7
		// Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo 
		// ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
		// Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
		System.out.println("Ejercicio 7");
		try {
			System.out.println(DividePorCero(5));
			System.out.println(DividePorCero(0));
		}catch (ArithmeticException ex) {
			System.out.println("Esto no puede hacerse");
		}
		System.out.println("\n");
		
		// 8
		// Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". 
		// La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
		System.out.println("Ejercicio 8");
		
		try {
			 getArchivo("/Programas/OpenBootCamp/JavaBásico/src/ejTema789/fichero.txt", "/Programas/OpenBootCamp/JavaBásico/src/ejTema789/copiaFichero.txt");
			 System.out.println("Archivo copiado");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n");
	
		
		// 9
		// Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
		
		// Leer un texto que tenga numeros entre corchetes [], los cuales corresponden a una palabra concreta del texto
		// explicando su significado. K= numero, V = palabra. Esa palabra se almacena en un arraylist.
		
		System.out.println("Ejercicio 9");
		String linea;
		String palabra = "";
		// el contador nos servirá para buscar las palabras y poder ir añadiendolas al hashmap
		int contador = 1;
		HashMap <Integer, String> mapa = new HashMap<>();
		ArrayList<String> listaPalabras = new ArrayList<>();
		try {
			InputStream in = new FileInputStream("/Programas/OpenBootCamp/JavaBásico/src/ejTema789/textoLectura");
			Scanner obj = new Scanner(in);
			
			while(obj.hasNextLine()) {
				linea = obj.nextLine();
				if(linea.contains("[" + contador +  "]")) {
					for(int i=0;i < linea.length();i++) {
						if(linea.charAt(i) == '[') {
							int posicion = i-1;
							while(posicion > 0 && linea.charAt(posicion) != ' ') {
								if(linea.charAt(posicion) != ' ') {
									palabra += linea.charAt(posicion);
									posicion--;
									String reversada = reverse(palabra);
									if(reversada.charAt(0) == reversada.toUpperCase().charAt(0)) {
										mapa.put(contador, reversada);
										contador++;
										listaPalabras.add(reversada);
										palabra = "";
									}
								}
							}
						}
					}
				}
			}
			System.out.println(mapa);
			System.out.println(listaPalabras);
			BufferedWriter out = new BufferedWriter(new FileWriter("/Programas/OpenBootCamp/JavaBásico/src/ejTema789/palabras.txt"));
			System.out.println("Datos del map en el palabras.txt");
			for(Entry<Integer, String> entry: mapa.entrySet()) {
				out.write(entry.getKey() + ": " + entry.getValue());
				out.newLine();
			}

			System.out.println("Datos del arrayList en el palabras.txt");
			for(int i=0;i<listaPalabras.size();i++) {
				out.write(listaPalabras.get(i) + " ");
			}
			out.close();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
	}

}
