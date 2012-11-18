/**
* SwitchCase
* Clase que muestra el uso de un switch case
*
* Para compilar:
*   javac SwitchCase.java
*
* Para ejecutarlo:
*   java SwitchCase
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase SwitchCase
* Clase que muestra el uso de un switch case
* Estas estructuras son como un if-else-if pero se aplican comprobando
* si una variable tiene determinado valor
*
*  switch (variable)
* {
*	case valor1 : sentencias; break;
*	case valor2 : sentencias: break;
*	...
*	default: sentencias;
* }
*
* NOTA: no olvides el break para cada caso.
* NOTA2: el switchcase solo funciona para tipos simples (int, char), no se pueden usar Strings
* como en algunos lenguajes interpretados. 
*  
* NOTA3: no se permiten los intervalos como en VB.
*

* @author Pello Altadill
*/
public class SwitchCase {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		int numero = 0;
		int dorsal = 10;
		
		// Según el valor de edad sacaremos un mensaje u otro
		// NO hay que olvidar el break para cada CASO!!!!!!
		switch (numero)
		{
			case 0:
					System.out.println("Eres un 0");
					break;
			case 15:
					System.out.println("Eres la niña bonita");
					break;					
			case 42:
					System.out.println("Eres la respuesta a todo");
					break;	
			case 69:
					System.out.println("Eres el puerto tftp, malpensao.");
					break;
			default:
					System.out.println("Eres un número sin personalidad: " + numero);
					break;
		}
		
		// Podemos agrupar más opciones como una especia de OR:
		switch (dorsal)
		{
			case 3:
			case 4:
			case 5:
					System.out.println("Dorsal de un defensa" + dorsal);
					break;
					
			case 10:
					System.out.println("El dorsal del capitán: " + dorsal);
					break;					
					
			case 9:
					System.out.println("El dorsal de un ariete: " + dorsal);
					break;	
			default:
					System.out.println("Eres un número sin personalidad: " + dorsal);
					break;
		}
	}
}