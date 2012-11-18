/**
* ExcepcionOperadorInvalido
* Clase que muestra como crear una excepción personalizada
*
* Para compilar:
*   javac ExcepcionOperadorInvalido.java
*
* Para ejecutarlo:
*   java ExcepcionOperadorInvalido
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase ExcepcionOperadorInvalido
* La clase extiende la clase Exception y nos sirve para crear excepciones
* personalizadas propias.
*
* También es posible definir nuestras propias excepciones.
*
* @author Pello Altadill
*/
public class ExcepcionOperadorInvalido extends Exception {
		
	/**
	* ExcepcionOperadorInvalido
	* Método constructor
	*/
	ExcepcionOperadorInvalido ()
	{
		super();
	}
	
	/**
	* ExcepcionOperadorInvalido
	* Método constructor
	* @param String msg
	*/
	ExcepcionOperadorInvalido (String msg)
	{
		super(msg);
	}
	
	/**
	* getMessage
	* mensaje personalizado de la excepción
	* @return String
	*/
	public String getMessage()
	{
		return "Operador no válido. Debe ser +, -, * o /";
	}

}