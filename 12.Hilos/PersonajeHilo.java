/**
* PersonajeHilo
* Clase que muestra el uso de los hilos de ejecución concurrente
*
* Para compilar:
*   javac PersonajeHilo.java
*
* Para ejecutarlo:
*   java PersonajeHilo
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

// Librería necesaria para el Random
import java.util.*;


/**
* clase PersonajeHilo
* Muestra el uso de hilos o threads de ejecución, lo cual permite
* que varios códigos se ejecuten en paralelo.
*
* En este caso se crea una clase que implementa la interfaz Runnable.
* Eso la convierte en un hilo. Lo único que hace es sacar un mensaje
* por la consola. 
*
* @author Pello Altadill
*/
public class PersonajeHilo implements Runnable{
	
	// nombre del hilo
	private String nombre;
	
	// array de frases que dirá el hilo
	// no se puede modificar (eso es el final) y aunque
	// haya muchos objetos de la clase Hilos
	// solo habrá un único array frases compartido
	// por todos (eso es el static)
	private static final String[] frases = {"Hola", "Adios", "Qué tal", "Bien...", "Buh"};
	
	/**
	* PersonajeHilo
	* Constructor
	* @param String nombre
	*/
	PersonajeHilo (String nombre) {
		this.nombre = nombre;
	}
	
	// Al implementar Runnable, esta clase debe definir una serie 
	// de métodos, entre otros run
	/**
	* run
	* En un bucle infinito, saca un mensaje aleatorio por pantalla
	* y no hace nada en un tiempo aleatorio de 0 a 5 sg.
	* @throws InterruptedException
	*/
	public void run ()
	{
		Random rnd = new Random();
		try {
			while (true) {
				sacarMensaje();
				Thread.currentThread().sleep(rnd.nextInt(5000));
			}
		} catch (InterruptedException iex) {
			System.err.println("Error en la ejecución del hilo");
		}
	}
	
	/**
	* sacarMensaje
	* Saca un mensaje aleatorio por pantalla
	*/
	private void sacarMensaje ()
	{
		Random rnd = new Random();
		
		System.out.println(nombre + "> " + frases[rnd.nextInt(4)]);
	}
	
	/**
	* main
	* Función principal
	* Desde la función principal probamos un Vector
	*/
	public static void main (String args[])
	{
		PersonajeHilo personaje1, personaje2, personaje3, personaje4;
		
		personaje1 = new PersonajeHilo("Cersei");
		Thread hilo1 = new Thread(personaje1);
		
		personaje2 = new PersonajeHilo("Tyrion");
		Thread hilo2 = new Thread(personaje2);
		
		personaje3 = new PersonajeHilo("Jaime");
		Thread hilo3 = new Thread(personaje3);
		
		personaje4 = new PersonajeHilo("Tywin");
		Thread hilo4 = new Thread(personaje4);		
		
		// Ponemos en marcha los hilos
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
	}
}

