/**
* Matrices
* Clase que muestra la declaración y uso de Arrays de varias dimensiones
* le he llamado Matriz por distinguir, aunque formalmente puede ser los mismo.
*
* Para compilar:
*   javac Matrices.java
*
* Para ejecutarlo:
*   java Matrices
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase Matrices
* Clase que muestra la declaración y uso de Arrays de dos o más dimensiones
*
*
* @author Pello Altadill
*/
public class Matrices {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Vamos a definir un array de enteros de dos dimensiones y otro de tres
		int valores[][];
		int [][] dorsales;
		
		// Podemos establecer el tamaño mediante new, y puede ser distinto para cada dimensión:
		// En este caso definimos un array de DIEZ  y TRES elementos 
		int [][] puntos = new int[10][3];
		
		
		// Podemos inicializar los arreglos con valores concretos,
		// lo cual sería una forma de implícita de especificar su tamaño:
		int numeros[][] = {{7,15,42},{69,666,23},{5,87,1},{0,665,-1}};
		
		char letras [][] = {{'a','b','c','d'},{'e','f','g','h'}};
		
		// Podemos crear Matrices de Strings
		String heroes[][] = {{"Gandalf","Trancos"}, {"Haplo","Alfred"},{"Jon Nieve", "Brienne"}};
		
		
		// Podemos alterar valores de un elemento del array
		heroes[0][1] = "Aragorn";
		numeros[1][2] = 24;
		
		// Y por supuesto operar con ellos:
		// al elemento 0 del array heroes le concatenamos algo:
		heroes[2][0] = heroes[2][0] + " lord Comandante";
		
		numeros[3][1]++;

		// para recorrer estos arrays con un for, hay que anidar tantos for
		// como dimensiones tenga el array:
		// ATENCIÓN a la forma de acceder al subarray en el segundo FOR	
		System.out.println("Estos son los mayores heroes, por sagas: ");

		for (int i = 0;i < heroes.length; i++)
		{
			System.out.println("Saga " + i);
			for (int j = 0; j < heroes[i].length; j++)
			{
				System.out.println("\tEn el índice " + i + "," + j +": " + heroes[i][j]);
			}
		}
		
	}
}