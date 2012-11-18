/**
* ValoresCadenasArgumentos
* Clase que muestra la declaración de variables de cadenas o Strings
* y cómo pasarles lo que viene como argumento
*
* Para compilar:
*   javac ValoresCadenasArgumentos.java
*
* Para ejecutarlo:
*   java ValoresCadenasArgumentos
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase ValoresCadenasArgumentos
* Clase que muestra la declaración de variables de cadenas o Strings
* y cómo pasarles lo que viene como argumento.  Los argumentos se trasvasan
* a través del parámetro args[] de la función main. Ese parámetro es un conjunto
* de Strings o Cadenas
*
*
* @author Pello Altadill
*/
public class ValoresCadenasArgumentos {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// En el caso de que el argumento sea una frase al ejecutar el programa la pasariamos así:
		//   C:\jdk>java ValoresCadenasArgumentos "Dios le ayuda"
		String frase = "A quien madruga, " + args[0];

		System.out.println("El primer argumento es: " + args[0]);	
		System.out.println("La frase final: \n" + frase);
		
	}
}