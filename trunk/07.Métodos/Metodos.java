/**
* Metodos
* Clase que muestra la declaración de todo tipo de métodos
*
* Para compilar:
*   javac Metodos.java
*
* Para ejecutarlo:
*   java Metodos
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase Metodos
* Muestra la declaración dedistintos tipos de métodos: constructores,
* métodos con distintos tipos de retorno, métodos que lanzan excepciones,
* métodos estáticos, métodos privados, protegidos y públicos
*
* La clase es un poco absurda pero simplemente trata de mostrar distintos
* tipos de métodos
*
* @author Pello Altadill
*/
public class Metodos {
	
	/**
	* Metodos
	* Constructor sin parámetros
	* estos métodos son los únicos que no devuelven algo explicitamente
	*/
	Metodos () {
		System.out.println("Has creado instancia");
	}
	
	/**
	* Metodos
	* Constructor con parámetros
	* estos métodos son los únicos que no devuelven algo explicitamente
	*/
	Metodos (String opcion) {
		super();
		System.out.println("Opción pasada: " + opcion);
	}
	
	/**
	* estatico
	* Aquellos que tienen la palabra static se consideran Método de clase, 
	* puede ser invocado sin que se cree una instancia
	* de la clase. ver main.
	* De estos métodos solo se crea una copia en memoria, al igual que pasa
	* con los atributos que se declaran static.
	*/
	public static void estatico (int veces) {
		for (int i = 0; i < veces;i++) {
			System.out.println("Estático> " + i);
		}
	}
	
	/**
	* saludar
	* Método publico que devuelve un String
	* Si no ponemos nada, se considera público
	* @return String
	*/
	String saludar () {
		saludoPrivado();
		return "Hola yo te saludo.";
	}
	
	/**
	* saludoPrivado
	* Método que saca un mensaje por consola.
	* Solo se puede invocar desde dentro de la clase
	*/
	private void saludoPrivado () {
		System.out.println("Java rulez");
	}
	
	/**
	* tomarDato
	* Método publico lee un valor por consola y devuelve un entero
	* Puede lanzar dos excepciones
	* @return String
	* @throws IOException, NumberFormatException
	*/
	public int tomarDato () throws IOException, NumberFormatException {
		    Console c = System.console();

        String linea = c.readLine("Dame un número: ");
        
        return Integer.parseInt(linea);

	}
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	* @throw IOException
	*/
	public static void main (String args[]) throws IOException
	{
		// Probamos el método estático. No necesitamos crear instancia!!!
		Metodos.estatico(5);
		
		Metodos pruebaMetodos = new Metodos("hola");
		
		pruebaMetodos.saludar();
		int entero = pruebaMetodos.tomarDato();
		
		
	}
}