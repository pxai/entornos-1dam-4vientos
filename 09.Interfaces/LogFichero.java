/**
* LogFichero
* Clase que muestra la implementación de un interfaz
*
* Para compilar:
*   javac LogFichero.java
*
* Para ejecutarlo:
*   java LogFichero
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

// Librería necesaria para la clase Date
import java.util.*;

/**
* clase LogFichero
* Esta clase muestra cómo se interpreta la interfaz Log.
* La clase por tanto debe preocuparse de implementar las dos funciones
* log y append. En este caso lo hace guardando los mensajes en un fichero
*
* Aparte de eso, LogFichero es una clase normal y puede tener más funciones,
* atributos, constructores, etc...
*
* @author Pello Altadill
*/
public class LogFichero implements Log {
	
		
	// Esta variable índica la fecha del último log
	private Date fecha;
	
	// Esta variable indica el nombre del fichero de log
	private String nombreFichero;
	
	// Estos atributos los necesitamos para escribir en un fichero
	private File fichero;
	private FileWriter escritorFichero;
	private BufferedWriter bufferEscritura;
	
	/**
	* LogFichero 
	* método constructor
	*/
	LogFichero ()
	{
		nombreFichero = "logs.txt";
		abrirFichero();
	}

	/**
	* LogFichero 
	* método constructor con parámetro para indicar el nombre del fichero
	* @param String fichero
	*/
	LogFichero (String nombreFichero)
	{
		this.nombreFichero = nombreFichero;
		abrirFichero();
	}
	
	/**
	* finalize
	* método que se invoca automáticamente al eliminarse el objeto
	* Lo aprovechamos para asegurarnos de que se cierra el fichero
	*/
	public void finalize ()
	{
		cerrarFichero();
	}
	
	/**
	* cerrarFichero
	* método para cerrar el fichero
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
			System.err.println("Ocurrió otro error no controlado: " + e.getMessage());
		}
		// Con esto capturamos cualquier otra cosa, es lo más genérico
		/*catch (Throwable t)
		{
			throw(t);
		}*
	}
	
	/**
	 * abrirFichero
	 * Método privado que abre el fichero
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
	* Método definido por el interfaz que debemos implementar.
	* En esta implementación, log muestra un mensaje por pantalla
	* Debemos capturar una excepción por si casca la escritura en el fichero
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
	* Método definido por el interfaz que debemos implementar
	* Se encarga de añadir un texto a un log
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