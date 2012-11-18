/**
* ExcepcionOperadorInvalido
* Clase que muestra como crear una excepci�n personalizada
*
* Para compilar:
*   javac ExcepcionOperadorInvalido.java
*
* Para ejecutarlo:
*   java ExcepcionOperadorInvalido
*/

// Librer�a necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase ExcepcionOperadorInvalido
* La clase extiende la clase Exception y nos sirve para crear excepciones
* personalizadas propias.
*
* Tambi�n es posible definir nuestras propias excepciones.
*
* @author Pello Altadill
*/
public class ExcepcionOperadorInvalido extends Exception {
		
	/**
	* ExcepcionOperadorInvalido
	* M�todo constructor
	*/
	ExcepcionOperadorInvalido ()
	{
		super();
	}
	
	/**
	* ExcepcionOperadorInvalido
	* M�todo constructor
	* @param String msg
	*/
	ExcepcionOperadorInvalido (String msg)
	{
		super(msg);
	}
	
	/**
	* getMessage
	* mensaje personalizado de la excepci�n
	* @return String
	*/
	public String getMessage()
	{
		return "Operador no v�lido. Debe ser +, -, * o /";
	}

}