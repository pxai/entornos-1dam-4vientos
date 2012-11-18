/**
* TreeMaps
* Clase que muestra el uso de la estructura de datos TreeMap
*
* Para compilar:
*   javac TreeMaps.java
*
* Para ejecutarlo:
*   java TreeMaps
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

// Librería necesaria para trabajar con TreeMap
import java.util.*;

/**
* clase TreeMaps
* Muestra el uso de la estructura de datos TreeMap
* Un treemap no es sino una estructura de Arbol, en este
* caso ordenada por un criterio por defecto o por el que nosotros
* le digamos.
*
* @author Pello Altadill
*/
public class TreeMaps {
	
	/**
	* main
	* Función principal
	* Desde la función principal probamos un TreeMap
	*/
	public static void main (String args[])
	{

		Naipe n1, n2, n3, n4, n5, n6, n7, n8;
		
		// Vamos a crear 8 cartas del mismo palo
		n1 = new Naipe("Picas","10");		
		n2 = new Naipe("Picas","8");		
		n3 = new Naipe("Picas","K");		
		n4 = new Naipe("Picas","A");		
		n5 = new Naipe("Picas","Q");		
		n6 = new Naipe("Picas","5");		
		n7 = new Naipe("Picas","2");		
		n8 = new Naipe("Picas","J");		

		TreeMap baraja = new TreeMap();
		
		// Y ahora las añadimos a nuestro arbol
		// El criterio de orden será su valor
		baraja.put(n1.valor,n1);
		baraja.put(n2.valor,n2);
		baraja.put(n3.valor,n3);
		baraja.put(n4.valor,n4);
		baraja.put(n5.valor,n5);
		baraja.put(n6.valor,n6);
		baraja.put(n7.valor,n7);
		baraja.put(n8.valor,n8);
		
		// Vamos a recorrer a ver cómo están. Para los TreeMaps hay
		// un paso previo
		Collection coleccionBaraja = baraja.entrySet();
		Iterator lista = coleccionBaraja.iterator();
		
		// TODO: sacar el objeto directamente
		while (lista.hasNext()) {
			System.out.println(lista.next().toString());		
		}		
	}
}

/**
* Naipe
* Clase que utilizaremos para probar la TreeMaps
* Representa una carta de la baraja francesa (la del poker tron!)
*/
class Naipe {
	String palo;
	String simbolo;
	int valor;
	
	/**
	* Naipe
	* Cosntructor parametrizado
	* @param String palo
	* @param String simbolo
	*/
	Naipe (String palo, String simbolo) {
		this.palo = palo;
		this.simbolo = simbolo;
		this.valor = asignarValor();
	}
	
	/**
	* asignarValor
	* Segun la carta (A, K, 5,...) le asigna un valor numérico
	* @return int valor de la carta
	* Este método es MUY chapuzas:
	* Buena candidata para refactorizar, o cambiar por un hashtable
	*/
	private int asignarValor () {
		int resultado = 0;
	
		if (simbolo.equals("A")) {
			resultado = 14;
		} else if (simbolo.equals("K")) {		
			resultado = 13;
		} else if (simbolo.equals("Q")) {		
			resultado = 12;
		} else if (simbolo.equals("J")) {		
			resultado = 11;
		} else {
			// Estamos dando por supuesto que cualquier otra cosa
			// será un valor entre 10 y 2. 
			resultado = Integer.parseInt(simbolo);
		}		
		return resultado;
	}
	
	/**
	* 
	*/
	public void mostrarNaipe () {
		System.out.println(simbolo + " de " + palo + ". Valor: " + valor);
	}
}