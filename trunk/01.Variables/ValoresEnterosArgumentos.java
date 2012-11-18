/**
* ValoresEnteros
* Clase que muestra la declaraci�n de variables num�ricas enteras
* y c�mo pasarles lo que viene como argumento
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
* y c�mo pasarles lo que viene como argumento. En el caso
* de los enteros HAY QUE CONVERTIR lo que viene por el argumento
* porque viene como un String!
*
* @author Pello Altadill
*/
public class ValoresEnterosArgumentos {
	
	/**
	* main
	* Funci�n principal
	* esta funci�n es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Declaraci�n de variables: tipo nombre;
		int dias;
		short contador;
		String diasString;
		
		// As� no hay problemas porque son del MISMO TIPO
		diasString = args[0];
		
		// Atenci�n a la CONVERSI�N. Utilizamos la clase Integer,
		// y s� metodo para convertir de String a int
		dias = Integer.parseInt(args[0]);
		
		// Con los short y con cualquier otro tipo b�sico hariamos
		// lo mismo, usar su clase correspondiente y la misma funci�n:
		contador = Short.parseShort(args[0]);
		
		// ATENCI�N: si lo que pasamos como argumento NO ES un entero
		// el programa casca irremediablemente y vomita una excepci�n
		
		// Vamos a probar a mostrarlos por pantalla: concatenamos con +
		System.out.println("El total de d�as es: " + dias);

		System.out.println("El contador queda as�: " + contador);
	}
}