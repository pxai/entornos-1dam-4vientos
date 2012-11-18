/**
* While
* Clase que muestra los bucles while
*
* Para compilar:
*   javac While.java
*
* Para ejecutarlo:
*   java While
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase While
* Muestra el uso de bucles while. Este tipo de bucles
* repiten unas sentencias mientras una condición sea verdadera.
* El final no será previsible.
* Formato:
*  while (true)		
*  {
*     sentencias;
*  }
*
* @author Pello Altadill
*/
public class While {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Vamos a usar un contador
		int contador = 10;
		
		// Ejecutamos el bucle mientras contador sea mayor que 0
		while (contador > 0)
		{
			System.out.println("Dentro del bucle " + contador);
			// y vamos decrementando
			contador--;
		}
		
		// Vamos a hacer otra prueba
		contador = 10;
		System.out.println("El siguiente bucle:");
		
		// Atención: podemos actualizar la variable en la propia condición
		while (contador-- > 0)
		{
			System.out.println("Dentro del bucle " + contador);
		}

		// el bucle infinito: simplemente poniendo en la condición true
		//while (true)		
		// {
		//   sentencias;
		// }
	}
}