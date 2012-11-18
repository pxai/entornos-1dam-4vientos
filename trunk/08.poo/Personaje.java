/**
* Personaje
* Clase que muestra la declaración de una clase abstracta
*
* Para compilar:
*   javac Personaje.java
*
* Para ejecutarlo:
*   ¡¡NO SE PUEDE EJECUTAR!! esta clase la debe extender (heredar) otra clase hija.
*/

// Librería necesaria para sacar datos por pantalla
import java.io.*;
// Librería necesaria para los números aleatorios
import java.util.Random;

/**
* clase Personaje
* Muestra la declaración de una clase ABSTRACTA que representa un Personaje. 
* De una clase abstracta no se pueden crear instancias. Sirve únicamente como
* una clase genérica de la que otras deben especializarse.
* Puede tener átributos y métodos implementados, que podrán ser heredados.
*
* @author Pello Altadill
*/
public abstract class Personaje {
	
	// ATRIBUTOS o PROPIEDADES DE LA CLASE.
	// ¿public, protected o private?
	// Haciendo un chiste malo, ¿cómo considerarías
	// tus propios atributos?
	//  - Si son públicos, es que eres un exhibicionista
	//  - Si son protegidos es que a alguien de confianza los enseñas
	//  - Si son privados, es que NUNCA los enseñarás.
	
	// Atributos públicos, accesibles desde cualquier clase
	public String nombre;
	public String profesion;
	
	// Atributos protegidos, solo accesibles desde clases HIJAS
	// que extiendan esta
	protected int fuerza;
	protected int inteligencia;
	protected int agilidad;
	
	// Atributos privados, inaccesibles.
	private int edad;
	private Random aleatorio;
	private int monedas;
	
	// MÉTODOS DE LA CLASE: Constructores, y otras funciones
	/**
	* Personaje
	* este es el método constructor, al que se invoca
	*/
	Personaje ()
	{
		System.out.println("Has creado una instancia de Personaje sin nombre.");
		
		// Variable para generar números aleatorios
        aleatorio = new Random();		

        // Llamamos a la función privada para establecer
        // los atributos de fuerza, inteligencia, agilidad y edad
        establecerAtributos();
        
        // Y ahora establecemos la edad
        establecerEdad();
	}
	
	/**
	* Personaje
	* Otro constructor con parámetros.
	* Nos sirve para crear una instancia especificando el nombre y profesión
	* @param String nombre
	* @param String profesion
	*/
	Personaje (String nombre, String profesion)
	{
		System.out.println("Has creado una instancia de Personaje");
		this.nombre = nombre;
		this.nombre = profesion;
		
		// Variable para generar números aleatorios
        aleatorio = new Random();		

        // Llamamos a la función privada para establecer
        // los atributos de fuerza, inteligencia, agilidad y edad
        establecerAtributos();
	}

	/**
	* Personaje
	* Otro constructor con parámetros.
	* Nos sirve para crear una instancia especificando el nombre y profesión
    * y otros atributos
	* @param String nombre
	* @param String profesion
	* @param int fuerza
	* @param int inteligencia
	* @param int agilidad
	*/
	Personaje (String nombre, String profesion, int fuerza, int inteligencia, int agilidad)
	{
		System.out.println("Has creado una instancia de Personaje");
		this.nombre = nombre;
		this.nombre = profesion;
		this.fuerza = fuerza;
		this.inteligencia = inteligencia;
		this.agilidad = agilidad;
		
		// Variable para generar números aleatorios
       	aleatorio = new Random();
        
        // Y ahora establecemos la edad
        establecerEdad();
	}
	
	/**
	* getEdad
	* Método que muestra la edad del personaje
	* Sirve para poder ver la edad SIN dar acceso al atributo privado
	* @return int
	*/
	public int getEdad ()
	{		
		return edad;
	}
	
	/**
	* establecerAtributos
	* Método privado para establecer los atributos iniciales.
	*/
	private void establecerAtributos ()
	{
        // Y ahora establecemos los atributos con números aleatorios
        fuerza = aleatorio.nextInt(10);
	 	inteligencia = aleatorio.nextInt(10);
   		agilidad = aleatorio.nextInt(10);
   		
   		edad = aleatorio.nextInt(200);
	} 
	
	/**
	* establecerEdad
	* Método privado para establecer la edad.
	*/
	private void establecerEdad ()
	{
   		
   		edad = aleatorio.nextInt(200);
	}
	
	/**
	* fichaPersonaje
	* Método que muestra todos los datos del Personaje
	*
	*/
	public void fichaPersonaje ()
	{
		System.out.println("--Ficha del Personaje--");
		System.out.println("\tNombre: " + nombre);
		System.out.println("\tProfesión: " + profesion);
		System.out.println("\tEdad: " + edad);
		System.out.println("--Atributos--");
		System.out.println("\tFUE: " + fuerza);
		System.out.println("\tINT: " + inteligencia);
		System.out.println("\tAGI: " + agilidad);
	}
	
	
}