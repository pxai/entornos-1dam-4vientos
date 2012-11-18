/**
* OperadoresBooleanos
* Clase que muestra el uso de operadores booleanos
*
* Para compilar:
*   javac OperadoresBooleanos.java
*
* Para ejecutarlo:
*   java OperadoresBooleanos
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase OperadoresBooleanos
* Muestra el uso de los operadores booleanos: se trata de operaciones
* que operan sobre sentencias y cuyo resultado es un booleano, true o false.
* Las operaciones son:
* && : operación AND, a && b: el resultado es verdadero si a y b son verdaderos
* || : operación OR, a || b: el resultado es verdadero si cualquiera de los dos es verdadero
* !  : operación NOT, !a : invierte el valor booleano de a. Si a es true !a devuelve false.
*
* @author Pello Altadill
*/
public class OperadoresBooleanos {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// probaremos con algunos enteros
		int bajo, alto, mediano;
		
		bajo = 4;
		alto = 666;
		mediano = 42;
		
		// Solo pueden ser true o false
		boolean a = false;
		boolean b = true;
		boolean c = true;
		
		boolean resultado = false;
		
		resultado = a || b;
		System.out.println("Si alguno entre A o B es true el resultado es: " + resultado);
		
		resultado = b && c;
		System.out.println("B y C son true por tanto el resultado es: " + resultado);

		resultado = !(b && c);
		System.out.println("B y C son true, pero si le hacemos un NOT: " + resultado);

		// Vamos a combinarlo con operadores de comparación
		resultado = (bajo < mediano) && (mediano < alto);
		System.out.println("El resultado es: " + resultado);

		resultado = (bajo == mediano) || (mediano <= alto);
		System.out.println("El resultado es: " + resultado);

	}
}