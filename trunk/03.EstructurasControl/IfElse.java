/**
* IfElse
* Clase que muestra un bloque condicional if-else
*
* Para compilar:
*   javac IfElse.java
*
* Para ejecutarlo:
*   java IfElse
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase IfElse
*  Muestra el uso de un bloque condicional if-else: si se cumple la
* condición del if se ejecuta su bloque, en caso contrario se ejecuta
* el bloque del else.
*  if (condición)
*  {
*    sentecias_bloque_if;
*  }
* else
* {
*    sentecias_bloque_else;
* }
*
* @author Pello Altadill
*/
public class IfElse {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Declaramos una variable.
		int a = 666;
		int b = 0;

		if (a >= b)
		{
			System.out.println("A es mayor o igual que B");
		}
		else
		{
			System.out.println("A es menor que B");
		}
	
		
	}
}