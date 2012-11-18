/**
* Cliente
* Clase que muestra la declaración de una clase
*
* Para compilar:
*   javac Cliente.java
*
* Para ejecutarlo:
*   java Cliente
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;
// Libería necesaria para la clase Date
import java.util.Date;

/**
* clase Cliente
* Muestra la declaración de una clase que representa un cliente. 
* Una clase se compone de atributos (propiedades) y métodos (funciones)
* La clase representa una entidad y cuando definimos una variable de
* de esa clase
*
* @author Pello Altadill
*/
public class Cliente {
	
	// ATRIBUTOS o PROPIEDADES DE LA CLASE
	public String nombre;
	public String apellidos;
	public Date nacimiento;
	public int codigo;
	
	
	// MÉTODOS DE LA CLASE: Constructores, y otras funciones
	/**
	* Cliente
	* este es el método constructor, al que se invoca
	* al crear una instancia de la clase
	*/
	Cliente ()
	{
		System.out.println("Has creado una instancia de Cliente");
	}
	
	/**
	* Cliente
	* Otro constructor con parámetros.
	* Nos sirve para crear una instancia
	*/
	Cliente (String nombre, String apellidos, Date nacimiento, int codigo)
	{
		System.out.println("Has creado una instancia de Cliente");
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacimiento = nacimiento;
		this.codigo = codigo;
	}
	
	/**
	* nombreCompleto
	* Método que une el nombre y el apellido del Cliente
	* @return resultado
	*/
	public String nombreCompleto ()
	{
		String resultado = nombre + " " + apellidos;
		
		return resultado;
	}
	
	/**
	* fichaCliente
	* Método que muestra todos los datos del cliente
	*
	*/
	public void fichaCliente ()
	{
		System.out.println("--Ficha del Cliente--");
		System.out.println("Código: " + codigo);
		System.out.println("Nombre completo: " + nombreCompleto());
		System.out.println("Fecha nacimiento: " + nacimiento);
	}
	
	/**
	* saluda
	* Un método que nos muestra un saludo
	*/
	public void saluda ()
	{
		System.out.println("Hola mundo desde la clase");
	}
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	* Y desde ella vamos a crear una instancia de Cliente
	*/
	public static void main (String args[])
	{
		// Creamos un par de instancias
		Cliente unCliente = new Cliente();
		Cliente otroCliente = new Cliente("Darth","Vader", new Date(), 666);
		unCliente.codigo = 89;
		
		otroCliente.fichaCliente();
		
		unCliente.saluda();
	}
}