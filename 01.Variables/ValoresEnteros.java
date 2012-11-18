/**
* ValoresEnteros
* Clase que muestra la declaraci�n de variables num�ricas <b>enteras</b>
*
* Para compilar:
*   javac ValoresEnteros.java
*
* Para ejecutarlo:
*   java ValoresEnteros
*/

// Librer�a necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase ValoresEnteros
* Muestra la declaraci�n de tipos num�ricos enteros b�sicos:
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
	* Funci�n principal
	* esta funci�n es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Declaraci�n de variables: tipo nombre;
		byte dias;
		short contador;
		
		// Declaraci�n y asignaci�n de valor
		// tipo nombre = valor inicial;
		short resultado = 42;
		
		// Declaraci�n de varias variables del mismo tipo
		short codigo, edad, media;
		
		// Declaraci�n y asignaci�n a varias a la vez:
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