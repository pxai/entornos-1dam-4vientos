/**
* Log
* Clase que muestra la declaración de un interfaz
*
* Para compilar:
*   javac Log.java
*
* Para ejecutarlo:
*   NO SE PUEDE EJECUTAR!!! debe implementarlo alguna clase.
*/


/**
* clase Log
* Clase que muestra la declaración de un interfaz.
* Los interfaces son una especie de plantilla o contrato
* que define una serie de métodos pero NO los implementa.
* Otras clases deben ser quienes implementen el interfaz y
* definir el código de esos métodos.
*
* Un interfaz no puede ejecutarse, debe implementarse por otra clase.
* Los interfaces permiten imitar en cierto modo el mecanismo de la HERENCIa MÚLTIPLE
* cosa que en java NO existe.
*
* En este ejemplo definimos un interfaz llamado Log que va a servirnos para definir
* una función que permita guardar registros o eventos a modo de mensaje de texto.
* A partir de este interfaz se pueden crear distintas implementaciones: una que muestre
* los logs en pantalla, otra que los almacene en memoria, otra implementación que guarde
* los logs en un fichero.
*
* NOTA: No se necesitan los modificadores public, protected o private, SOLO se acepta public.
* Si no se pone nada se asume por tanto que es public.
* NOTA2: NINGÚN método puede estar definido.
*
* @author Pello Altadill
*/
public interface Log {
	
	/**
	* Los interfaces pueden definir atributos  
	* pero DEBE asignársele un valor!
	*/
	// Este será un prefijo que mostrarán todos los mensajes
	public String prefijo = "Log> ";
	
	// Este será un contador de los mensajes mostrados
	public static int totalMensajes = 0;
	
	// Este es el método que deberán definir las clases
	// que implmenten este interfaz
	public void log (String msg);
	
	// Este añade el mensaje al log.
	public void append (String msg);
}