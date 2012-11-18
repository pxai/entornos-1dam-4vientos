/**
* LogMemoria
* Clase que muestra la implementaci�n de un interfaz
*
* Para compilar:
*   javac LogMemoria.java
*
* Para ejecutarlo:
*   java LogMemoria
*/

// Librer�a necesaria para trabajar con la entrada/salida
import java.io.*;

// Librer�a necesaria para la clase Date y Vector
import java.util.*;

/**
* clase LogMemoria
* Esta clase muestra c�mo se interpreta la interfaz Log.
* La clase por tanto debe preocuparse de implementar las dos funciones
* log y append. En este caso lo hace guardando los mensajes en un objeto en memoria
*
* Aparte de eso, LogMemoria es una clase normal y puede tener m�s funciones,
* atributos, constructores, etc...
*
* @author Pello Altadill
*/
public class LogMemoria implements Log {
	
		
	// Esta variable �ndica la fecha del �ltimo log
	private Date fecha;
	
	// Este objeto ser� quien contenga los mensajes
	// Vector es una clase que nos sirve como array mejorado
	private Vector mensajes;
	
	// Contador de mensajes. Todas las implementaciones de esta clase
	// van a COMPARTIR esta variable por que es STATIC
	private static int contador = 0;
	
	/**
	* LogMemoria 
	* m�todo constructor
	*/
	LogMemoria ()
	{
		mensajes = new Vector();
	}
	
	/**
	* log
	* M�todo definido por el interfaz que debemos implementar.
	* En esta implementaci�n, log guarda el mensaje en pantalla
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
	* M�todo definido por el interfaz que debemos implementar
	* Se encarga de a�adir un texto a un log
	* @param String
	*/
	public void append (String msg) 
	{
				mensajes.addElement(msg);
	}
	
	/*
	* verTodo
	* m�todo que vuelca el contenido de los logs
	*/
	public void verTodo ()
	{
		for (int i = 0; i< mensajes.size(); i++)
		{
			// Mostramos por pantalla. 
			// El objeto mensajes es un Vector de objetos y debemos especificar
			// qu� es lo que devuelve por eso hacemos (String)
			System.out.println((String)mensajes.elementAt(i));
		}
	}
}