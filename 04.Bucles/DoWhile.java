/**
* DoWhile
* Clase que muestra los bucles while
*
* Para compilar:
*   javac DoWhile.java
*
* Para ejecutarlo:
*   java DoWhile
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase DoWhile
* Muestra el uso de bucles do while. Este tipo de bucles
* es como el while, repiten unas sentencias mientras una condición sea verdadera
* pero en su caso la primera iteración sucede siempre ya que la condición se comprueba
* al final.
* Formato:
*		do
*		{
*         sentencias;
*		} while();
*
* @author Pello Altadill
*/
public class DoWhile {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Vamos a comprobar si un número es primo
		// para eso hay que verificar que solo es divisible
		// por si misma o por 1.
		int numero, anterior;
		
		// Les asignamos a las dos
		numero = anterior = 7;
		
		// para guardar el resultado
		boolean esPrimo = true; 
		
		// Ejecutamos el do-while
		do
		{
			anterior--;

			if (numero % anterior == 0)
			{
				esPrimo = false;	
			}
			
		} while(anterior > 2 && esPrimo);
		
		// Mostramos el resultado
		if (esPrimo)
		{
			System.out.println("Este numero: " + numero + " es primo");
		}
		else
		{
			System.out.println("Este numero: " + numero + " NO es primo");
		}
	
	}
}