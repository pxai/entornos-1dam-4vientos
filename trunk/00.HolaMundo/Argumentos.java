/**
* Argumentos
* Clase que muestra c�mo recoger argumentos de la l�nea de comandos
*
* Para compilar:
*   javac Argumentos.java
*
* Para ejecutarlo:
*   java Argumentos
*/

// Librer�a necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase Argumentos
* Muestra c�mo recoger par�metros de la linea de comandos
* es decir, cuando ejecutamos el programa:
*   java Argumentos ejemplo_de_argumento
* tras el nombre del programa podemos poner lo que queramos como
* par�metro. Para recoger los valores usaremos la variable args[]
*
* @author Pello Altadill
*/
public class Argumentos {
	
	/**
	* main
	* Funci�n principal
	* esta funci�n es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Vamos a suponer que nos han pasado alg�n argumento,
		// Los argumentos los recoge autom�ticamente la variable
		// args[]. El primer argumento ser�a args[0], el segundo args[1], etc...
		
		System.out.println("�Hola Mundo! me has pasado: " + args[0]);
		// Lo pasariamos as�:
		//   C:\jdk>java Argumentos blablabla
		// ATENCI�N, si NO le pasamos nada el programa casca con una excepci�n
	}
}