/**
* For
* Clase que muestra el uso de un bucle for
*
* Para compilar:
*   javac For.java
*
* Para ejecutarlo:
*   java For
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase For
* Muestra el uso de un bucle for. Los bucles for sirven para
* ejecutar unas sentencias un número determinado de veces.
* Los bucles while se usan cuando la condición de salida es más incierta,
* o dependemos del valor de alguna variable.
*
* Formato:
*  for (inicio;condición;actualización)
*  {
*    sentencias; 
*  }
* @author Pello Altadill
*/
public class For {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Vamos a dar 10 vueltas.
		// En los bucles for solemos usar un número como índice
		// del bucle.
		int i,j,k;
		
		i = j = k = 0;
		
		// Vamos a dar 10 vueltas: dentro del for 
		// - Primero iniciamos: i=0;
		// - Luego ponemos la condición de salida: i>0
		// - Luego ponemos la actualiación
		for (i=0; i<10; i++)
		{
			System.out.println("Dentro del bucle 1 : " + i);
		}
		
		// podemos inicializar la variable dentro del for
		// pero ojo, el ámbito de z solo será el bucle for.
		for (int z = 10; z>0; z--)
		{
			System.out.println("Dentro del bucle 2 : " + z);
		}
		
		// Podemos usar más de una variable usando la ,
		for (j=0, k=20; j<10 && k>0; j++, k=k-2)
		{
			System.out.println("Dentro del bucle 3 : " + j + " , " + k);
		}

		// El bucle infinito:
		// for (;;)		
	}
}