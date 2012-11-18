/**
* Argumentos
* Clase que muestra cómo recoger argumentos de la línea de comandos
*
* Para compilar:
*   javac Argumentos.java
*
* Para ejecutarlo:
*   java Argumentos
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase Argumentos
* Muestra cómo recoger parámetros de la linea de comandos
* es decir, cuando ejecutamos el programa:
*   java Argumentos ejemplo_de_argumento
* tras el nombre del programa podemos poner lo que queramos como
* parámetro. Para recoger los valores usaremos la variable args[]
*
* @author Pello Altadill
*/
public class Argumentos {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Vamos a suponer que nos han pasado algún argumento,
		// Los argumentos los recoge automáticamente la variable
		// args[]. El primer argumento sería args[0], el segundo args[1], etc...
		
		System.out.println("¡Hola Mundo! me has pasado: " + args[0]);
		// Lo pasariamos así:
		//   C:\jdk>java Argumentos blablabla
		// ATENCIÓN, si NO le pasamos nada el programa casca con una excepción
	}
}