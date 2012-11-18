/**
* BreakContinue
* Clase que muestra el uso de sentencias Break Continue para
* alterar la ejecución de bucles While, Do-While, o For
*
* Para compilar:
*   javac BreakContinue.java
*
* Para ejecutarlo:
*   java BreakContinue
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
*  clase BreakContinue
* Clase que muestra el uso de Break y Continue que nos sirven para
* modificar el normal comportamiento de los bucles.
* - Con break se rompe el bucle y se sale de él.
* - Con continue interrumpimos la ejecución actual del bucle y se salta a la siguiente vuelta
*   sin salir del bucle. 
*
*
* @author Pello Altadill
*/
public class BreakContinue {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		
		// Declaramos una serie de variables
		int numero, anterior;
		int x,y;
		
		x = 10;
		
		while (x > 0)
		{
			if (x == 5)
			{
				break; // salimos del bucle
			}
			x--;
		}
		
		// Vamos a buscar los números primos
		// que hay del 2 al 20
		for (numero = 2; numero < 20; numero++)
		{
			anterior = numero;
			do
			{
				anterior--;

				// En cuanto es divisible, salimos
				if (numero % anterior == 0)
				{
					break;	
				}
			
			} while(anterior > 2);
			
			// Si se ha llegado hasta el final, es primo
			if (anterior == 2)
			{
				System.out.println(numero + " es un PRIMO");
			}
		}
		
		// Si tenemos dos bucles anidados, 
		// ¿cómo podemos salir de un bucle concreto con break?
		// hay que usar una etiqueta, que es un identificador seguido de
		// dos puntos:
		
		salida:
		
		for(x=1;x<20;x++)
		{
			System.out.println("Bucle principal: " + x);
			
			if (20 % x == 7)
			{	// salimos del bucle principal
				break;
			}
			
			// para salir desde el bucle interno hasta fuera
			// tendremos que usar la etiqueta salida
			for(y=10;y>0;y--)
			{
				System.out.println("Bucle interno: " + y);
				if (20 % y == 4)
				{	// Salimos de este y del bucle principal también
					// pero hay que especificar la etiqueta de salida
					break salida;
				}
			}// for2
			
		}// for1
		
	}
}