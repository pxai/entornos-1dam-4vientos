/**
* IfElseIf
* Clase que muestra un bloque condicional if-else-if
*
* Para compilar:
*   javac IfElseIf.java
*
* Para ejecutarlo:
*   java IfElseIf
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase IfElseIf
*  Muestra el uso de un bloque condicional if-else-if: si se cumple la
* condición del if se ejecuta su bloque, en caso contrario se comprueba la condición
* del siguiente bloque else-if... y así hasta llegar opcionalmente a un último else.
*  if (condición)
*  {
*    sentecias_bloque_if;
*  }
* else if (condición2)
* {
*    sentecias_bloque_else_if_1;
* }
* else if (condición2)
* {
*    sentecias_bloque_else_if_2;
* }
* else
* {
*    sentecias_bloque_else;
* }
*
* NOTA: si todas las condicionals comprueban la igualdad de una única variable
* con un valor concreto es probable que debas usar un switch-case
* NOTA2: efectivamente, como en c aquí no hay elseif, elif, elsif, ni similares
*
* @author Pello Altadill
*/
public class IfElseIf {
	
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

		if (a > b)
		{
			System.out.println("A es mayor que B");
		}
		else if (a==b)
		{
			System.out.println("A es igual a B");
		}
		else
		{
			System.out.println("A es menor que B");
		}
	
		
	}
}