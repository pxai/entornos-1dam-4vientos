/**
* Constructores
* Clase que muestra la declaración de variables de cadenas o Strings
*
* Para compilar:
*   javac Constructores.java
*
* Para ejecutarlo:
*   java Constructores
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase Constructores
* Muestra la declaración de Cadenas: son variables que 
* contienen más de un caracter: una palabra una frase, etc...
* Para esto no existen tipos primitivos y se usa una clase
* llamada String
*
* Una clase, como ya se verá más adelante es mucho más que un tipo
* de dato. Es una tipo complejo que tiene propiedas y métodos.
*
* @author Pello Altadill
*/
public class Constructores {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		String nombre;
		String frase = "A quien madruga, patada en los cojones";
		String presidente;

		// Podemos iniciarla con una cadena vacía
		String otraFrase = "Solo quiero que seamos \"amigos\"";
		
		int edad = 666;
		
		presidente = "Cthulhu";
		nombre = "Optimus Prime";
		
		// Los especiales comienzan por \
		char nuevaLinea = '\n';
		char tabulacion = '\t';

		// Podemos unir dos cadenas con el operador de concatenación.
		frase = frase + nuevaLinea;

		
		// Vamos a probar a mostrarlos por pantalla:
		System.out.println(frase);

		// Al concatenar números se convierten en cadenas
		frase = presidente + " tiene : " + edad + " años";
		
		System.out.println("La frase queda así: \n" + frase);

		System.out.println("Y la otra frase: \n" + otraFrase);
		
	}
}