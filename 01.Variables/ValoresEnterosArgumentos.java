/**
* ValoresEnteros
* Clase que muestra la declaración de variables numéricas enteras
* y cómo pasarles lo que viene como argumento
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
* y cómo pasarles lo que viene como argumento. En el caso
* de los enteros HAY QUE CONVERTIR lo que viene por el argumento
* porque viene como un String!
*
* @author Pello Altadill
*/
public class ValoresEnterosArgumentos {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Declaración de variables: tipo nombre;
		int dias;
		short contador;
		String diasString;
		
		// Así no hay problemas porque son del MISMO TIPO
		diasString = args[0];
		
		// Atención a la CONVERSIÓN. Utilizamos la clase Integer,
		// y sú metodo para convertir de String a int
		dias = Integer.parseInt(args[0]);
		
		// Con los short y con cualquier otro tipo básico hariamos
		// lo mismo, usar su clase correspondiente y la misma función:
		contador = Short.parseShort(args[0]);
		
		// ATENCIÓN: si lo que pasamos como argumento NO ES un entero
		// el programa casca irremediablemente y vomita una excepción
		
		// Vamos a probar a mostrarlos por pantalla: concatenamos con +
		System.out.println("El total de días es: " + dias);

		System.out.println("El contador queda así: " + contador);
	}
}