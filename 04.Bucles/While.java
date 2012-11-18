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

// Librer�a necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase While
* Muestra el uso de bucles while. Este tipo de bucles
* repiten unas sentencias mientras una condici�n sea verdadera.
* El final no ser� previsible.
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
	* Funci�n principal
	* esta funci�n es la que se inicia directamente al ejecutar el programa
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
		
		// Atenci�n: podemos actualizar la variable en la propia condici�n
		while (contador-- > 0)
		{
			System.out.println("Dentro del bucle " + contador);
		}

		// el bucle infinito: simplemente poniendo en la condici�n true
		//while (true)		
		// {
		//   sentencias;
		// }
	}
}