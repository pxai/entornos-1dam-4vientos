/**
* DividirString
* Clase que muestra el uso de la estructura de datos Vector
*
* Para compilar:
*   javac DividirString.java
*
* Para ejecutarlo:
*   java DividirString
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

// Librería necesaria para trabajar con Vector
import java.util.*;

/**
* clase DividirString
* Muestra el uso de la clase StringTokenizer, la cual permite
* dividir una cadena según un caracter y convertirla en un array:
*  "esto,es,una,cadena,de,ejemplo"
* Dividiendo esa cadena por la coma sería:
* tokens[0] == "esto"
* tokens[1] == "es"
* tokens[2] == "una"
* ...
* Esto en otros lenguajes se hace con la función split
* @author Pello Altadill
*/
public class DividirString {
	
	/**
	* main
	* Función principal
	* Desde la función principal probamos un Vector
	*/
	public static void main (String args[])
	{
		String cadena = "Corre Sombragris muéstranos lo que es la premura";
		
		StringTokenizer tokens = new StringTokenizer(cadena);
		
		// ahora recorremos los tokens
		while (tokens.hasMoreTokens()) {
			System.out.println("palabra: " + tokens.nextToken());
		}
		
		// Otra cadena, cuyas palabras están divididas por ":"
		String otraCadena = "Juan:Martinez:Irujo:24-10-1982:Ibero";
		
		tokens = new StringTokenizer(otraCadena,":");
		
		System.out.println("\n Ahora salen: " + tokens.countTokens());
		
		// ahora recorremos los tokens con un for.
		// OJO! nextToken() altera el valor de countTokens, por tanto
		// no se puede usar como condición del for
		for (int i = 0; tokens.hasMoreTokens();i++) {
			System.out.println("palabra " + i + ">" + tokens.nextToken());
		}
	}
}

