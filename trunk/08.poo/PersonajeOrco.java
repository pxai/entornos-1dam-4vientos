/**
* PersonajeOrco
* Clase que muestra la declaraci�n de una clase que hereda de una abstracta
* ATENCI�N: previamente compilar la clase abstracta padre
*
* Para compilar:
*   javac PersonajeOrco.java
*
* Para ejecutarlo:
*   java PersonajeOrco
*/


/**
* clase PersonajeOrco
* Muestra la declaraci�n de la clase PersonajeOrco, que extiende la clase
* abstracta Personaje. Por tanto reutiliza sus todo contenido y le permite acceder
* a atributos y m�todos P�BLICOS o PROTEGIDOS. 
*
* @author Pello Altadill
*/
public class PersonajeOrco extends Personaje {
	
	// ATRIBUTOS o PROPIEDADES DE LA CLASE.
	// Esta clase puede tener algun propiedad propia
	public float hedor;
	public String tribu;
	
	// M�TODOS DE LA CLASE: Constructores, y otras funciones
	/**
	* PersonajeOrco
	* este es el m�todo constructor, al que se invoca
	*/
	PersonajeOrco ()
	{
		super();
	}
	
	/**
	* PersonajeOrco
	* Otro constructor con par�metros.
	* Nos sirve para crear una instancia especificando el nombre y profesi�n
	* @param String tribu
	* @param float hedor
	*/
	PersonajeOrco (String tribu, float hedor)
	{
		super();
		this.tribu = tribu;
		this.hedor = hedor;
		System.out.println("Has creado una instancia de PersonajeOrco, sin nombres!");
	}

	/**
	* PersonajeOrco
	* Otro constructor con par�metros.
	* Nos sirve para crear una instancia especificando el nombre y profesi�n
    * y otros atributos
	* @param String nombre
	* @param String profesion
	* @param String tribu
	* @param float hedor
	*/
	PersonajeOrco (String nombre, String profesion, String tribu, float hedor)
	{
		super(nombre, profesion);

		this.tribu = tribu;
		this.hedor = hedor;
		System.out.println("Has creado una instancia de PersonajeOrco");	

	}
	

	/**
	* fichaPersonaje
	* M�todo que muestra todos los datos del PersonajeOrco
	*
	*/
	public void fichaPersonaje ()
	{
		super.fichaPersonaje();
		
		System.out.println("\tRaza: ORCO");
		System.out.println("\tTribu: " + nombre);
		System.out.println("\tHedor: " + hedor + " olfs");
	}
	
	/**
	* main
	* Funci�n principal
	* esta funci�n es la que se inicia directamente al ejecutar el programa
	* Y desde ella vamos a crear una instancia de PersonajeOrco, que es una clase
	* hija de la clase abstracta Personaje
	*/
	public static void main (String args[])
	{
		// Creamos un par de instancias
		PersonajeOrco orcoMalo = new PersonajeOrco();
		
		
		// Le establecemos el nombre y profesi�n
		orcoMalo.nombre = "Thrall";
		orcoMalo.profesion = "Maestro de armas";
		
		orcoMalo.fichaPersonaje();

	}
	
}