/**
* LogMemoria
* Clase que muestra la implementación de un interfaz
*
* Para compilar:
*   javac LogMemoria.java
*
* Para ejecutarlo:
*   java LogMemoria
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

// Librería necesaria para la clase Date y Vector
import java.util.*;

/**
* clase LogMemoria
* Esta clase muestra cómo se interpreta la interfaz Log.
* La clase por tanto debe preocuparse de implementar las dos funciones
* log y append. En este caso lo hace guardando los mensajes en un objeto en memoria
*
* Aparte de eso, LogMemoria es una clase normal y puede tener más funciones,
* atributos, constructores, etc...
*
* @author Pello Altadill
*/
public class LogMemoria implements Log {
	
		
	// Esta variable índica la fecha del último log
	private Date fecha;
	
	// Este objeto será quien contenga los mensajes
	// Vector es una clase que nos sirve como array mejorado
	private Vector mensajes;
	
	// Contador de mensajes. Todas las implementaciones de esta clase
	// van a COMPARTIR esta variable por que es STATIC
	private static int contador = 0;
	
	/**
	* LogMemoria 
	* método constructor
	*/
	LogMemoria ()
	{
		mensajes = new Vector();
	}
	
	/**
	* log
	* Método definido por el interfaz que debemos implementar.
	* En esta implementación, log guarda el mensaje en pantalla
	* @param String
	*/
	public void log (String msg)
	{
		fecha = new Date();
		mensajes.addElement(prefijo + fecha + "> " + msg + "\n");
		contador++;
	}
	
	/**
	* append
	* Método definido por el interfaz que debemos implementar
	* Se encarga de añadir un texto a un log
	* @param String
	*/
	public void append (String msg) 
	{
				mensajes.addElement(msg);
	}
	
	/*
	* verTodo
	* método que vuelca el contenido de los logs
	*/
	public void verTodo ()
	{
		for (int i = 0; i< mensajes.size(); i++)
		{
			// Mostramos por pantalla. 
			// El objeto mensajes es un Vector de objetos y debemos especificar
			// qué es lo que devuelve por eso hacemos (String)
			System.out.println((String)mensajes.elementAt(i));
		}
	}
}