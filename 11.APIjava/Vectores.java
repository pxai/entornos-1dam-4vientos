/**
* Vectores
* Clase que muestra el uso de la estructura de datos Vector
*
* Para compilar:
*   javac Vectores.java
*
* Para ejecutarlo:
*   java Vectores
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

// Librería necesaria para trabajar con Vector
import java.util.*;

/**
* clase Vectores
* Muestra el uso de la estructura de datos Vector
* El Vector es un super array que permite tamaño dinámico
* y añade muchos métodos para gestionar su contenido.
* Los elementos pueden ser cualquier objeto y se pueden repetir.
*
* @author Pello Altadill
*/
public class Vectores {
	
	/**
	* main
	* Función principal
	* Desde la función principal probamos un Vector
	*/
	public static void main (String args[])
	{
		Jugador crack = new Jugador("Maradona",10);
		Jugador catacrack = new Jugador("Drenthe",13);
		Jugador cr7 = new Jugador("Ronaldo",7);
		
		// Creamos una instancia de Vector para guardar una plantilla
		Vector plantilla = new Vector();
		
		// Metemos unos elementos:
		plantilla.addElement(crack);
		plantilla.addElement(catacrack);
		plantilla.addElement(cr7);
		
		// Recorrer la estructura con un for;
		for (int i = 0; i < plantilla.size();i++) {
			((Jugador)plantilla.elementAt(i)).sacarDatos();		
		}

		System.out.println("Otra pasada con Iterator:");
		
		// Vamos a recorrer con un Iterator
		Iterator iterador = plantilla.iterator();
		
		// Nota : enumeration está algo desfasado...
		
		// podemos usar un while
		while (iterador.hasNext()) {
			// Tenemos que forzar el tipo que devuelve lista a Jugador
			Jugador jugadorTmp = (Jugador)iterador.next();
			// Ahora ya podemos jugar con esa variable
			jugadorTmp.sacarDatos();
		}
		
		// Vamos a quitar elementos:
		// por referencia de objeto -el primero que encuentre-
		plantilla.removeElement(cr7);
		// por índice
		plantilla.removeElementAt(0);
		
		// Añadimos un elemento creado al vuelo:
		plantilla.addElement(new Jugador("Torres",9));
		
		System.out.println("Otra pasada con Enumeration:");
				
		// Recorrer la estructura con el interfaz Enumeration
		// Los elementos del Vector pasan a ser un Enumeration
		// con unas funciones añadidas: hasMoreElements y nextElement
		
		// Nota : enumeration está algo desfasado...
		
		// podemos usar un while
		for (Enumeration lista = plantilla.elements();lista.hasMoreElements();) {
			// Tenemos que forzar el tipo que devuelve lista a Jugador
			Jugador jugadorTmp = (Jugador)lista.nextElement();
			// Ahora ya podemos jugar con esa variable
			jugadorTmp.sacarDatos();
		}
		
		// Podemos dejar el Vector vacío:
		plantilla.removeAllElements();
	}
}

/**
* Clase Jugador
* la usamos como objeto para manejar con un vector
*/
class Jugador {
	public String nombre;
	public int dorsal;
	
	/**
	* Constructor
	* @param String nombre
	* @param int dorsal
	*/
	Jugador (String nombre, int dorsal) {
		this.nombre = nombre;
		this.dorsal = dorsal;
	}
	
	/**
	* sacarDatos
	* Muestra los datos de una jugador
	*/
	public void sacarDatos () {
		System.out.println("\nNombre: " + nombre + "\nDorsal: " + dorsal);
	}
	
}