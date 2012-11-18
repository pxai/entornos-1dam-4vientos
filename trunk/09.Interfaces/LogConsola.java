/**
* LogConsola
* Clase que muestra la implementaci�n de un interfaz
*
* Para compilar:
*   javac LogConsola.java
*
* Para ejecutarlo:
*   java LogConsola
*/

// Librer�a necesaria para trabajar con la entrada/salida
import java.io.*;

// Librer�a necesaria para la clase Date
import java.util.Date;

/**
* clase LogConsola
* Esta clase muestra c�mo se interpreta la interfaz Log.
* La clase por tanto debe preocuparse de implementar las dos funciones
* log y append.
*
* Aparte de eso, LogConsola es una clase normal y puede tener m�s funciones,
* atributos, constructores, etc...
*
* @author Pello Altadill
*/
public class LogConsola implements Log {
	
		
	// Esta variable �ndica la fecha del �ltimo log
	private Date fecha;
	
	/**
	* LogConsola 
	* m�todo constructor
	*/
	LogConsola ()
	{
	}

	
	/**
	* log
	* M�todo definido por el interfaz que debemos implementar.
	* En esta implementaci�n, log muestra un mensaje por pantalla
	* @param String
	*/
	public void log (String msg)
	{
		fecha = new Date();
		System.out.println(prefijo + fecha + "> " + msg);
	}
	
	/**
	* append
	* M�todo definido por el interfaz que debemos implementar
	* Se encarga de a�adir un texto a un log
	* @param String
	*/
	public void append (String msg) 
	{
		System.out.print(msg);
	}
}