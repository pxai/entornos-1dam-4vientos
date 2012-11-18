/**
* LogFichero
* Clase que muestra la implementaci�n de un interfaz
*
* Para compilar:
*   javac LogFichero.java
*
* Para ejecutarlo:
*   java LogFichero
*/

// Librer�a necesaria para trabajar con la entrada/salida
import java.io.*;

// Librer�a necesaria para la clase Date
import java.util.*;

/**
* clase LogFichero
* Esta clase muestra c�mo se interpreta la interfaz Log.
* La clase por tanto debe preocuparse de implementar las dos funciones
* log y append. En este caso lo hace guardando los mensajes en un fichero
*
* Aparte de eso, LogFichero es una clase normal y puede tener m�s funciones,
* atributos, constructores, etc...
*
* @author Pello Altadill
*/
public class LogFichero implements Log {
	
		
	// Esta variable �ndica la fecha del �ltimo log
	private Date fecha;
	
	// Esta variable indica el nombre del fichero de log
	private String nombreFichero;
	
	// Estos atributos los necesitamos para escribir en un fichero
	private File fichero;
	private FileWriter escritorFichero;
	private BufferedWriter bufferEscritura;
	
	/**
	* LogFichero 
	* m�todo constructor
	*/
	LogFichero ()
	{
		nombreFichero = "logs.txt";
		abrirFichero();
	}

	/**
	* LogFichero 
	* m�todo constructor con par�metro para indicar el nombre del fichero
	* @param String fichero
	*/
	LogFichero (String nombreFichero)
	{
		this.nombreFichero = nombreFichero;
		abrirFichero();
	}
	
	/**
	* finalize
	* m�todo que se invoca autom�ticamente al eliminarse el objeto
	* Lo aprovechamos para asegurarnos de que se cierra el fichero
	*/
	public void finalize ()
	{
		cerrarFichero();
	}
	
	/**
	* cerrarFichero
	* m�todo para cerrar el fichero
	*/
	public void cerrarFichero ()
	{
		try {
			bufferEscritura.close();	
			escritorFichero.close();
		} 
		catch (IOException ioe)
		{
			System.err.println("Error al cerrar: " + ioe.getMessage());
		}
		catch (Exception e)
		{
			System.err.println("Ocurri� otro error no controlado: " + e.getMessage());
		}
		// Con esto capturamos cualquier otra cosa, es lo m�s gen�rico
		/*catch (Throwable t)
		{
			throw(t);
		}*
	}
	
	/**
	 * abrirFichero
	 * M�todo privado que abre el fichero
	 */
	private void abrirFichero ()
	{
		try {
			fichero = new File(nombreFichero);
			escritorFichero = new FileWriter(fichero);
			bufferEscritura = new BufferedWriter(escritorFichero);	
		} 
		catch (IOException ioe)
		{
			System.err.println("Error al escribir: " + ioe.getMessage());
		}
	}
	/**
	* log
	* M�todo definido por el interfaz que debemos implementar.
	* En esta implementaci�n, log muestra un mensaje por pantalla
	* Debemos capturar una excepci�n por si casca la escritura en el fichero
	* @param String
	*/
	public void log (String msg)
	{	
		fecha = new Date();

		// Debemos iniciar un bloque try catch por si acaso
		try {
	
			bufferEscritura.write(prefijo + fecha + "> " + msg + "\n");
	
		} 
		catch (IOException ioe)
		{
			System.err.println("Error al escribir: " + ioe.getMessage());
		}
	}
	
	/**
	* append
	* M�todo definido por el interfaz que debemos implementar
	* Se encarga de a�adir un texto a un log
	* @param String
	*/
	public void append (String msg) 
	{
		// Debemos iniciar un bloque try catch por si acaso
		try {

			bufferEscritura.write(msg);

		} 
		catch (IOException ioe)
		{
			System.err.println("Error al escribir: " + ioe.getMessage());
		}
	}
}