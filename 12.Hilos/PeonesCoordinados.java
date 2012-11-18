/**
* PeonesCoordinados
* Clase que muestra el uso de los hilos de ejecución concurrente
* que se pueden agrupar, coordinar y sincronizar...
*
* Para compilar:
*   javac PeonesCoordinados.java
*
* Para ejecutarlo:
*   java PeonesCoordinados
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

// Librería necesaria para el Random
import java.util.*;


/**
* clase PeonesCoordinados
* Muestra el uso de hilos o threads de ejecución formando un grupo
* Pueden acceder a un objeto de manera que la información no se degrade
*
* Además definimos un hilo especial con mayor prioridad que se encargará
* de parar, reanudar o matar hilos.
*
* @author Pello Altadill
*/
public class PeonesCoordinados implements Runnable{
	
	// nombre del hilo
	private String nombre;
	
	// array de frases que dirá el personjae
	private static final String[] frases = {"Your command Master", "The town is under attaaack!", "For The Horde!", "As you wish"};
	
	private static int contador = 0;
	
	/**
	* PeonesCoordinados
	* Constructor
	* @param String nombre
	*/
	PeonesCoordinados (String nombre) {
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
				// si es el jefe se invoca coordinar, sino, lo otro.
				if (Thread.currentThread().getName().equals("WarMaster")) 
					coordinar();
				else
					sacarMensaje();
					
				modificarValor();
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
		
		System.out.println(nombre + "> " + contador + " " + frases[rnd.nextInt(4)]);
	}
	
	/**
	* coordinar
	* Método que ejecuta el jefe. LLeva a cabo acciones aleatorias 
	* con el resto de hilos.
	*/
	private void coordinar () {
		Random rnd = new Random();
		int accion = rnd.nextInt(4);
		
		System.out.println(nombre + "> " + contador + " acción: " + accion);
		
		switch (accion) {
			case 0:
					System.out.println(nombre + "> Coordinar: Sacar Mensaje");
					sacarMensaje();
					break;
			case 1:
					System.out.println(nombre + "> Coordinar: Modificar Valor");
					modificarValor();
					break;					
			case 2:
			case 3:
			case 4:
		}
	}
	
	/**
	* modificarValor
	* método que incrementa el valor de una variable.
	* Para asegurarse de que cada hilo ejecuta esto por separado
	* podemos declarar el método como synchronized
	*/
	private synchronized void modificarValor () {
			contador = contador + 1;
	}
	/**
	* main
	* Función principal
	* Desde la función principal probamos un Vector
	*/
	public static void main (String args[])
	{
		PeonesCoordinados personaje1, personaje2, personaje3, personaje4, jefazo;
		
		// Definimos Grupo de hilos
//		ThreadGroup grupoHilos = new ThreadGroup();
		
		// Creamos los Thread asignando el mismo nombre
		personaje1 = new PeonesCoordinados("Thrall");
		Thread hilo1 = new Thread(personaje1, "Thrall");
		
		personaje2 = new PeonesCoordinados("Grunt");
		Thread hilo2 = new Thread(personaje2, "Grunt");
		
		personaje3 = new PeonesCoordinados("Ulur");
		Thread hilo3 = new Thread(personaje3, "Ulur");
		
		personaje4 = new PeonesCoordinados("Gaaak");
		Thread hilo4 = new Thread(personaje4, "Gaaak");		
		
		// Este será el hilo jefe!
		jefazo = new PeonesCoordinados("WarMaster");
		Thread hiloJefe = new Thread(jefazo, "WarMaster");
		
		// Le damos más prioridad:
		hiloJefe.setPriority(hilo1.getPriority() + 5);
		// Podriamos hacer:
		//hiloJefe.setPriority(Thread.MAX_PRIORITY);
		
		// Ponemos en marcha los hilos
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hiloJefe.start();
		
	}
}

