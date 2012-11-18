/**
* EntradaPorConsola
* Clase que como solicitar datos al usuario y guardarlos
* en variables.
*
* Para compilar:
*   javac EntradaPorConsola.java
*
* Para ejecutarlo:
*   java EntradaPorConsola
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase EntradaPorConsola
* Muestra como se solicitan datos al usuario por consola y guardarlos
* en todo tipo de variables.
* En el caso
* de los enteros HAY QUE CONVERTIR lo que viene por el argumento
* porque viene como un String!
*
* @author Pello Altadill
*/
public class EntradaPorConsola {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[]) 
	{
		// Para leero por consola hay que crear
		// una instancia de Console
		Console consola = System.console();
		
		// Declaración de variables: tipo nombre;
		int edad;
		float temperatura;
		String lectura;
		boolean booleano;
		
		// Para solicitar datos al usuario, usamos el método
		// readLine();
		
		// Primero avisamos al usuario:
		System.out.println("Por favor, introduce un texto cualquiera: ");
		
		// Así no hay problemas porque son del MISMO TIPO
		lectura = consola.readLine(); 
		
		// Y mostramos por pantalla lo que el usuario ha metido
		System.out.println("Has escrito: " + lectura + "\n");
				
		
		// Primero avisamos al usuario:
		System.out.println("Por favor, introduce un número con decimales: ");

		lectura = consola.readLine(); 

		// Atención a la CONVERSIÓN. Utilizamos la clase Float,
		// y sú metodo para convertir de String al tipo simple float
		temperatura = Float.parseFloat(lectura);

		// Y mostramos por pantalla lo que el usuario ha metido
		System.out.println("Has escrito: " + temperatura + "\n");
		

		// Primero avisamos al usuario:
		System.out.println("Por favor, introduce tu edad: ");

		lectura = consola.readLine(); 

		// Atención a la CONVERSIÓN. Utilizamos la clase Integer,
		// y sú metodo para convertir de String al tipo simple int
		edad = Integer.parseInt(lectura);

		// Y mostramos por pantalla lo que el usuario ha metido
		System.out.println("Has escrito: " + edad);
		
		// Vamos a solicitar un booleano
		System.out.println("Por favor, introduce un valor booleano: ");

		lectura = consola.readLine(); 

		// Atención a la CONVERSIÓN. Utilizamos la clase Boolean,
		// y sú metodo para convertir de String al tipo simple boolean
		booleano = Boolean.parseBoolean(lectura);

		// Y mostramos por pantalla lo que el usuario ha metido
		System.out.println("Has escrito: " + booleano);

	}
}