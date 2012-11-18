/**
* ProbarLog
* Clase que muestra el uso de las clases de log que implementan
* el interfaz Log
*
* Para compilar:
*   javac ProbarLog.java
*
* Para ejecutarlo:
*   java ProbarLog
*/


/**
* clase ProbarLog
* Muestra varios ejemplos de uso de las clases que implementan
* la interfaz Log.
*
* @author Pello Altadill
*/
public class ProbarLog {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		LogConsola logConsola = new LogConsola();
		LogFichero logFichero = new LogFichero("fichero.log");
		LogMemoria logMemoria = new LogMemoria();
		
		int i = 0;
		
		
		logConsola.log("Primer mensaje de log.");
		logFichero.log("Primer mensaje de log.");
		logMemoria.log("Primer mensaje de log.");
		
		logConsola.log("Vamos a probar un bucle:");
		
		for (i=0;i<10;i++)
		{
			logConsola.append(" vuelta: " + i);
		}
		
		logConsola.append("\n");
		
		logConsola.log("Terminado!");
		logMemoria.log("Terminado!");
		
		logFichero.log("Probando log de fichero");
		logFichero.append("A ver si todo va bien.");
		logFichero.log("Terminamos de probar");
		
		logMemoria.verTodo();
		
		logFichero.cerrarFichero();
	}
}