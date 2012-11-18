/**
* ValoresBooleanos
* Clase que muestra la declaración de variables booleanas
*
* Para compilar:
*   javac ValoresBooleanos.java
*
* Para ejecutarlo:
*   java ValoresBooleanos
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase ValoresBooleanos
* Muestra la declaración de booleanos: son variables que solo
* pueden tener dos posibles valores: true (verdadero) o false (falso)
*
* @author Pello Altadill
*/
public class ValoresBooleanos {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Solo pueden ser true o false
		boolean terminado = false;
		boolean aprobar = true;
		boolean resultado = aprobar;
		
		// Vamos a probar a mostrarlos por pantalla: concatenamos con +
		System.out.println("Este programa ha terminado? " + terminado);

		System.out.println("Aprobaré la asignatura? " + aprobar);

		System.exit(0);
	}
}