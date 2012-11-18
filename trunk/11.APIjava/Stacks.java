/**
* Stacks
* Clase que muestra el uso de la estructura de datos Stack
*
* Para compilar:
*   javac Stacks.java
*
* Para ejecutarlo:
*   java Stacks
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

// Librería necesaria para trabajar con Stack
import java.util.*;

// Librerías para poder usar SimpleDateFormat
import java.text.*;

/**
* clase Stacks
* Muestra el uso de la estructura de datos Stack
* Un Stack no es más que una Pila, es decir, un montón ,
* es decir una estructura LIFO: 
* el último que entra es el primero que sale.
*
* De paso vemos el uso de Date y SimpleDateFormat
*
* @author Pello Altadill
*/
public class Stacks {
	
	/**
	* main
	* Función principal
	* Desde la función principal probamos un pila o Stack
	*/
	public static void main (String args[]) throws ParseException {
		Tarea tareaTonta = new Tarea(new Date(),"Tarea tonta");
		Tarea tareaImportante = new Tarea(new Date(),"Tarea fundamental para ya");
		
		// Vamos a crear una fecha cualquiera para la tarea
		SimpleDateFormat formatoFechas = new SimpleDateFormat();
		Tarea otraTarea = new Tarea(new Date(), "Otra tarea cualquiera");
		
		// ahora creamos la Pila y vamos metiendo elementos,
		// uno encima de otro
		Stack tareas = new Stack();
		
		tareas.push(tareaTonta);
		tareas.push(otraTarea);
		tareas.push(tareaImportante);
		
		// Metemos otra tarea creada al vuelo
		tareas.push(new Tarea(new Date(),"Al vuelo"));		
		
		// Se premiten los elementos repetidos...
		tareas.push(otraTarea);
		
		// Vamos a recorrer la pila con el interfaz List
		ListIterator lista = tareas.listIterator();
		
		while (lista.hasNext()) {
			Tarea t = (Tarea)lista.next();
			System.out.println(t.toString());
		}
		
		// Sacamos un par de elementos, podemos recogerlo.
		tareas.pop();
		Tarea saliente = (Tarea)tareas.pop();
		saliente.finalizar();
		
		System.out.println(saliente.toString());
		
		// Podemos echar un ojo al primero de la pila
		// sin tener que sacarlo: método peek
		Tarea arriba = (Tarea)tareas.peek();
		
		System.out.println(arriba.toString());
	}
}

/**
* Clase Tareas
* la usamos como objeto para manejar con una pila
*/
class Tarea {
	public Date fecha;
	public String nombre;
	private boolean finalizada;
	
	/**
	* Constructor
	* @param Date fecha
	* @param String nombre
	*/
	Tarea (Date fecha, String nombre) {
		this.fecha = fecha;
		this.nombre = nombre;
		this.finalizada = false;
	}
	
	/**
	* finalizar
	* Dar por finalizada la tarea
	*/
	public void finalizar () {
		finalizada = true;
	}	

		/**
	* toString
	* Devuelve una cadena con todos los datos del objeto 
	* @return String
	*/
	public String toString () {
		return "Fecha: " + fecha +" Nombre: " + nombre + " Finalizada: " + finalizada;
	}
	
}