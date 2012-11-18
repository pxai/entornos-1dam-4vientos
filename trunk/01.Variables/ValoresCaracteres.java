/**
* ValoresCaracteres
* Clase que muestra la declaración de variables de caracteres
*
* Para compilar:
*   javac ValoresCaracteres.java
*
* Para ejecutarlo:
*   java ValoresCaracteres
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase ValoresCaracteres
* Muestra la declaración de booleanos: son variables que solo
* pueden contener un caracter, encerrado en comillas simples
* por ejemplo 'a' 
*
* @author Pello Altadill
*/
public class ValoresCaracteres {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Solo pueden ser true o false
		char caracter = 'A';
		char ultima = 'z';
		
		// Los especiales comienzan por \
		char nuevaLinea = '\n';
		char tabulacion = '\t';
		char retornoCarro = '\r';
		char comillaSimple = '\'';
		char contrabarra = '\\';
		char dobleComillas = '\"';
		char formFeed = '\f';
		
		// Vamos a probar a mostrarlos por pantalla: concatenamos con +
		System.out.println("Primera letra " + caracter + " y última: " + ultima);

		System.out.println("Con la \\ usamos caracteres especiales");
		System.out.println("Que parezca un \"accidente\" ");
		
		System.out.println("Vamos a saltar \n y ahora otra vez: " + nuevaLinea);
		System.out.println(tabulacion + " Vamos a ver: " + nuevaLinea + " y ahora \r");
	}
}