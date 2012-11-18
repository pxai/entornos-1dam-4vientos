/**
* ValoresEnteros
* Clase que muestra la declaración de variables numéricas <b>enteras</b>
*
* Para compilar:
*   javac ValoresEnteros.java
*
* Para ejecutarlo:
*   java ValoresEnteros
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase ValoresEnteros
* Muestra la declaración de tipos numéricos enteros básicos:
*  byte   : 1 byte
*  short  : entero corto, 2 bytes
*  int    : enter, 4 bytes
*  long   : entero largo, 8 bytes
*
* @author Pello Altadill
*/
public class ValoresEnteros {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Declaración de variables: tipo nombre;
		byte dias;
		short contador;
		
		// Declaración y asignación de valor
		// tipo nombre = valor inicial;
		short resultado = 42;
		
		// Declaración de varias variables del mismo tipo
		short codigo, edad, media;
		
		// Declaración y asignación a varias a la vez:
		int i, j, k;
		
		i = j = k = 0;
		
		// El tipo long
		long sueldoFutbolista = 23489343;
		long valorGoogle = 666000666;
		
		// Vamos a probar a mostrarlos por pantalla: concatenamos con +
		System.out.println("El sentido de la vida es: " + resultado);

		System.out.println("El sueldo de un futbolista medio es: " + sueldoFutbolista);
	}
}