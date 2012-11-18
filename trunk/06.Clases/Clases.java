/**
* Clases
* Clase que muestra la declaración de una clase
*
* Para compilar:
*   javac Clases.java
*
* Para ejecutarlo:
*   java Clases
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase Clases
* Clase que muestra la declaración de una clase
*
* @author Pello Altadill
*/
public class Clases {
	
	// ATRIBUTOS de CLASE
	String nombre;
	
	/**
	* Método constructor, se ejecuta al crear una instancia de la clase
	*/
	Clases ()
	{
		nombre = "Juan Solo";
		System.out.println("Has creado una instancia de la clase");
	}
	
	/**
	* saludo
	* Un método de la clase que simplemente saca un mensaje
	*/
	void saludo ()
	{
		System.out.println("Hola Mundo, soy " + nombre);
	}
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Creamos una INSTANCIA de la clase:
		// es como declarar una variable, pero el tipo es el
		// nombre de la clase
		Clases unaClase = new Clases();
		
		// Con la instancia llamamos a uno de sus métodos
		unaClase.saludo();
	}
}