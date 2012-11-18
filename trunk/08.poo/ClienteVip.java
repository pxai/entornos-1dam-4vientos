/**
* ClienteVip
* Clase que muestra la declaración de una clase que extiende a otra:
* es decir muestra la HERENCIA
*
* Para compilar:
*   javac ClienteVip.java
*
* Para ejecutarlo:
*   java ClienteVip
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;
// Libería necesaria para la clase Date
import java.util.Date;

/**
* clase ClienteVip
* Muestra la declaración de ClienteVip, una extensión de la clase Cliente. 
* Es un ejemplo simple de herencia, donde creamos una clase especializada
* que hereda todos los atributos y métodos de la clase padre.
* Para lograrlo debemos añadir la clausula extends en la declaración
* de la clase.
*
* @author Pello Altadill
*/
public class ClienteVip extends Cliente {
	
	// ATRIBUTOS o PROPIEDADES DE LA CLASE extendida:
	public float descuento;
	
	
	// MÉTODOS DE LA CLASE: Constructores, y otras funciones
	/**
	* ClienteVip
	* este es el método constructor, al que se invoca
	* al crear una instancia de la clase
	*/
	ClienteVip ()
	{
		// Lamamos al constructor de la clase padre
		super();
		
		System.out.println("Has creado una instancia de ClienteVip");
	}
	
	/**
	* ClienteVip
	* Otro constructor con parámetros.
	* Nos sirve para crear una instancia
	*/
	ClienteVip (String nombre, String apellidos, Date nacimiento, int codigo, float descuento)
	{
		// Lamamos al constructor de la clase padre
		super(nombre,apellidos,nacimiento,codigo);

		// Establecemos el atributo descuento
		this.descuento = descuento;

		System.out.println("Has creado una instancia de ClienteVip");
	}
	
	/**
	* aplicarDescuento
	* Método que aplica el descuento del cliente a un determinado total
	* @return resultado
	*/
	public float aplicarDescuento (float precioTotal)
	{
		float resultado = precioTotal * (1-descuento);
		
		return resultado;
	}
	
	/**
	* quitarIVA
	* Método que le quita el IVA al cliente de un total
	*
	*/
	public float quitarIVA (float precioTotal)
	{
		float resultado = precioTotal * (0.82F);
		
		return resultado;
	}
	
	/**
	* fichaCliente
	* Método que sobrescribe al de la clase padre Cliente,
	* añadiendo un dato más.
	*
	*/
	public void fichaCliente ()
	{
		// al principio hace los mismo que la clase padre.
		super.fichaCliente();
		
		System.out.println("CLIENTE VIP");
		System.out.println("Descuento: " + descuento);
	}

	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	* Y desde ella vamos a crear una instancia de ClienteVip
	*/
	public static void main (String args[])
	{
		// Creamos un par de instancias
		ClienteVip unClienteVip = new ClienteVip();
		ClienteVip otroClienteVip = new ClienteVip("Frodo","Bolson", new Date(), 19, 0.10F);
		unClienteVip.codigo = 89;
		
		otroClienteVip.fichaCliente();

		System.out.println("Total 109.56 euros, con descuento del " + otroClienteVip.descuento + "%: " + otroClienteVip.aplicarDescuento(109.56F));
				
		unClienteVip.saluda();
	}
}