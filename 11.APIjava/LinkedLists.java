/**
* LinkedLists
* Clase que muestra el uso de la estructura de datos LinkedList
*
* Para compilar:
*   javac LinkedLists.java
*
* Para ejecutarlo:
*   java LinkedLists
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

// Librería necesaria para trabajar con LinkedList
import java.util.*;

/**
* clase LinkedLists
* Muestra el uso de la estructura de datos LinkedList
* que consisten en listas de datos en las que
* SE PUEDEN REPETIR datos: además es una estructura
* de lista con doble enlace y puede recorrerse en ambos sentidos.
* También puede comportarse como pila, como cola, etc... ver API.
*
* @author Pello Altadill
*/
public class LinkedLists {
	
	/**
	* main
	* Función principal
	* Desde la función principal probamos un LinkedList
	*/
	public static void main (String args[])
	{
		LinkedList misProductos = new LinkedList();
		
		// Creamos unos productos
		Producto producto1, producto2, producto3, producto4;
		
		producto1 = new Producto("Mayonesa Hellmans","Kraft",2.56);
		producto2 = new Producto("Donuts Bombón","Panrico",2.98);
		producto3 = new Producto("Chopped","El pozo",0.28);
		producto4 = new Producto("Preservativos XL","Fantasmex",15.5);
		
		misProductos.add(producto1);
		misProductos.add(producto2);
		misProductos.add(producto2);
		misProductos.add(producto2);
		misProductos.add(producto4);
		misProductos.add(producto3);
		misProductos.addFirst(producto2);
		
		// incluso podemos añadir a lo bruto la propia lista a sí misma
		//misProductos.addAll(misProductos);
		

		((Producto)misProductos.getLast()).cambiarPrecio(66.6);			

			
		// Vamos a recorrer a ver cómo están.
		ListIterator lista = misProductos.listIterator(0);
		
		while (lista.hasNext()) {
			((Producto)lista.next()).mostrarProducto();			
		}		
		
	}
}

/**
* Producto
* Clase que utilizaremos para probar la LinkedList
* Representa un producto de una tienda
*/
class Producto {
	String nombre;
	String marca;
	private double precio;
	
	/**
	* Producto
	* Constructor parametrizado
	* @param String nombre
	* @param String marca
	* @param double precio
	*/
	Producto (String nombre, String marca, double precio) {
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}
	
	/**
	* cambiarPrecio
	* Asigna un nuevo precio al producto
	* @param double nuevoPrecio
	*/
	public void cambiarPrecio (double nuevoPrecio) {
		precio = nuevoPrecio;
	}
	
	/**
	* mostrarProducto
	* Muestra por consola el detalle del producto
	*/
	public void mostrarProducto () {
		System.out.println(nombre + " de " + marca + ". Precio: " + precio);
	}
}