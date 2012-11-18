/**
* Arrays
* Clase que muestra la declaración y uso de arrays
*
* Para compilar:
*   javac Arrays.java
*
* Para ejecutarlo:
*   java Arrays
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase Arrays
* Clase que muestra la declaración y uso de arrays. Los arrays
* o arreglos son variables que contienen un conjunto de datos del mismo tipo
* indexados numéricamente desde el 0 en adelante.
*
* NOTA: pueden crearse arrays de elementos del tipo básico: int, float,...
*       y también pueden crearse de clases.
* NOTA2: los arrays en java se definen con un tamaño concreto y no puede
*        alterarse. Si necesitamos elasticidad entonces debemos usar clases
*        como por ejemplo Vector.
*
* @author Pello Altadill
*/
public class Arrays {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Vamos a definir un array de enteros, todavía sin especificar el tamaño.
		// Lo podemos hacer de dos formas:
		int valores[];
		int [] dorsales;
		
		// Podemos establecer el tamaño mediante new:
		// En este caso definimos un array de DIEZ elementos, 
		// pero ATENCIÓN, los índices irán del 0 al 9.
		int [] puntos = new int[10];
		
		// Si quisieramos crear un array de caracteres que contenga el abecedario
		// lo hariamos así. El abecedario español tiene 28 letras, en el array serán
		// del 0 al 27.
		char abecedario[] = new char[28];
		boolean  verdades[] = new boolean[5];
		
		// Podemos inicializar los arreglos con valores concretos,
		// lo cual sería una forma de implícita de especificar su tamaño:
		int numeros[] = {7,15,42,69,666};
		
		char letras [] = {'a','b','c','d','e','f','g','h'};
		
		// Podemos crear arrays de Strings
		String heroes[] = {"Gandalf", "Haplo", "Jon Nieve", "Vader", "Trancos"};
		
		// para acceder a un elemento del array debemos indicar su índice.
		// el índice es un número entero que va de 0 al tamaño-1 del array
		System.out.println("The number of the beast: " + numeros[4]);
		
		// Podemos alterar valores de un elemento del array
		verdades[0] = false;
		numeros[2] = 23;
		
		// Y por supuesto operar con ellos:
		// al elemento 0 del array heroes le concatenamos algo:
		heroes[0] = heroes[0] + " el gris";
		
		numeros[3] = numeros[2] + 8;
		
		// Vale, ¿que hacemos con el array? Podemos recorrerlo con un for
		// Todo array tiene una propiedad que es length, la cual no da su tamaño
		
		// Por ejemplo, los elementos del array puntos los podemos inicializar 
		// con un valor concreto:
		for (int i = 0;i< puntos.length; i++)
		{
			puntos[i] = 0;
		}
		
		System.out.println("Estos son los mayores heroes: ");

		for (int i = 0;i < heroes.length; i++)
		{
			System.out.println("En el índice " + i + ": " + heroes[i]);
		}
		
	}
}