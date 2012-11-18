/**
* LogConsola
* Clase que muestra la implementación de un interfaz
*
* Para compilar:
*   javac LogConsola.java
*
* Para ejecutarlo:
*   java LogConsola
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

// Librería necesaria para la clase Date
import java.util.Date;

/**
* clase LogConsola
* Esta clase muestra cómo se interpreta la interfaz Log.
* La clase por tanto debe preocuparse de implementar las dos funciones
* log y append.
*
* Aparte de eso, LogConsola es una clase normal y puede tener más funciones,
* atributos, constructores, etc...
*
* @author Pello Altadill
*/
public class LogConsola implements Log {
	
		
	// Esta variable índica la fecha del último log
	private Date fecha;
	
	/**
	* LogConsola 
	* método constructor
	*/
	LogConsola ()
	{
	}

	
	/**
	* log
	* Método definido por el interfaz que debemos implementar.
	* En esta implementación, log muestra un mensaje por pantalla
	* @param String
	*/
	public void log (String msg)
	{
		fecha = new Date();
		System.out.println(prefijo + fecha + "> " + msg);
	}
	
	/**
	* append
	* Método definido por el interfaz que debemos implementar
	* Se encarga de añadir un texto a un log
	* @param String
	*/
	public void append (String msg) 
	{
		System.out.print(msg);
	}
}