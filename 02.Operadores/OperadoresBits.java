/**
* OperadoresBits
* Clase que muestra el uso de operadores de bits
*
* Para compilar:
*   javac OperadoresBits.java
*
* Para ejecutarlo:
*   java OperadoresBits
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase OperadoresBits
* Muestra el uso de operadores de bits. Su uso no es que sea muy frecuente
* pero suele estar presente en todos los lenguajes tipo c.
*
* & : AND Conjunción de bits:  1011 & 1001 = 1001
* | : OR disjunción de bits:   1011 | 1001 = 1011
* ^ : XOR disjunción excluyente de bits:   1011 ^ 1001 = 0010
* <<: desplazamiento de bits a la izquierda
* >>: desplazamiento de bits a la derecha
* 
*
* 
* @author Pello Altadill
*/
public class OperadoresBits {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		int numero1, numero2;
		numero1 = 0x0010;
		numero2 = 0x1101;
		
		System.out.println("Resultado: \n" + (numero1 & numero2));
		System.out.println("Resultado: \n" + (numero1 | numero2));
		
		// se puede abreviar:
		// numero1 = numero1 & numero2;
		numero1 &= numero2;
		
		// Para operaciones en las que el resultado vaya a una de los propios
		// operandos (numero1 = numero1 & 0x1111) podemos usar una operadores de asignación especial:
		// &=, |=, ^=, >>=, >>>=, <<= 

	}
}