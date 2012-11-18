/**
* Hashtables
* Clase que muestra el uso de la estructura de datos Hashtable
*
* Para compilar:
*   javac Hashtables.java
*
* Para ejecutarlo:
*   java Hashtables
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

// Librería necesaria para trabajar con Hashtables
import java.util.*;

/**
* clase Hashtables
* Muestra el uso de la estructura de datos Hashtable
* Los hashtable son estructuras cuyos elementos por un lado tienen una clave
* que sirve como identificador único y por otro el resto de los datos de ese elemento.
* Para agregar un elemento usamos el método put, indicando la clave de ese elemento
* y el objeto que contiene. Para sacar un elemento usamos get, donde debemos indicar
* el campo clave.
* Por tanto las claves de los elementos de una Hashtable no pueden repetirse.
*
* @author Pello Altadill
*/
public class Hashtables {
	
	/**
	* main
	* Función principal
	* Desde la función principal probamos un Hashtable
	*/
	public static void main (String args[])
	{
		Hashtable misClientes = new Hashtable();
		
		Cliente clienteVip = new Cliente("66666666X","Bill Gates",false);
		Cliente otroCliente = new Cliente("00000042X","Asimov",false);
		
		// Agregamos los dos clientes a la hashtable:
		// primero indicamos un valor clave y luego el objeto en si
		misClientes.put("66666666X",clienteVip);
		misClientes.put(otroCliente.dni,otroCliente);

		
		misClientes.put("10100100A",new Cliente("10100100A","Arale",true));
		
		// Podemos comprobar si existe determinado elemento
		// a través de su clave
		if (misClientes.containsKey("00000042X")) {
			((Cliente)misClientes.get("00000042X")).sacarDatos();
		}
		
		// Vamos a recorrer todo a través de las claves
		Enumeration lista = misClientes.keys();
		
		while(lista.hasMoreElements()) {
			String clave = (String)lista.nextElement();
			((Cliente)misClientes.get(clave)).sacarDatos();
		}
		
		// Para quitar elementos usamos también la clave:
		misClientes.remove("66666666X");
		
		// Volcamos todo a ver qué sale
		System.out.println("La Hashtable está así: " + misClientes.toString());
		
	}
}

/**
* Clase Cliente
* la usamos como objeto para manejar con un Hashtable
*/
class Cliente {
	public String dni;
	public String nombre;
	public boolean esMujer;
	
	/**
	* Constructor
	* @param String dni
	* @param String nombre
	* @param boolean esMujer
	*/
	Cliente (String dni, String nombre, boolean esMujer) {
		this.dni = dni;
		this.nombre = nombre;
		this.esMujer = esMujer;
	}
	
	/**
	* sacarDatos
	* Muestra los datos de una jugador
	*/
	public void sacarDatos () {
		String sexo = (esMujer)?"Mujer":"Hombre";
		System.out.println("DNI: " + dni + "nombre: " + nombre+ " Sexo:" + sexo);
	}
	
}