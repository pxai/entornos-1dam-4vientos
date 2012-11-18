/**
* Calculadora
* Clase que muestra como se controlan las excepciones
*
* Para compilar:
*   javac Calculadora.java
*
* Para ejecutarlo:
*   java Calculadora
*/

// Librer�a necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase Calculadora
* La clase tiene funciones para solicitar datos al usuario
* y ejecutar operaciones. Si el usuario mete un dato que no debe
* el programa falla. El programa no puede coger de los huevos al usuario
* pero s� puede preveer sus errores, capturarlos y reconducir la ejecuci�n
* para llevarla a buen puerto. Las excepciones sirven para mantener el control
* del programa ante situaciones que se escapan a nuestro control: datos de entrada,
* fallos de la red, bases de datos inconsistentes, etc...
*
* Tambi�n es posible definir nuestras propias excepciones.
*
* @author Pello Altadill
*/
public class Calculadora {
	
	public float operando1;
	public float operando2;
	public char operador;
	public float resultado;
	
	/**
	* Calculadora
	* M�todo constructor
	*/
	Calculadora ()
	{
		resultado = 0;
		iniciar();
	}
	
	/**
	* iniciar
	* Bucle infinito para las operaciones
	*/
	private void iniciar ()
	{
		do
		{
			System.out.println("Nueva operaci�n: ");
			leerOperandos();
			leerOperador();
			realizarOperacion();
			mostrarResultado();
		} while (true);
	}
	
	/**
	* leerOperandos
	* Solicita al usuario los dos operandos para la operaci�n
	*/
	public void leerOperandos ()
	{
		// Para leero por consola hay que crear
		// dos instancias de clases especiales de E/S
		InputStreamReader lectorFlujoEntrada;
		BufferedReader lectorBuffer;
		
		String lectura = "";
		
		try 
		{
			lectorFlujoEntrada = new InputStreamReader(System.in);
			lectorBuffer = new BufferedReader(lectorFlujoEntrada);
		
			System.out.println("POr favor, introduzca el primer operando: ");
			lectura = lectorBuffer.readLine(); 

			// Atenci�n a la CONVERSI�N. Utilizamos la clase Float,
			// y s� metodo para convertir de String al tipo simple float
			operando1 = Float.parseFloat(lectura);
		
			System.out.println("POr favor, introduzca el segundo operando: ");
			lectura = lectorBuffer.readLine(); 

			// Atenci�n a la CONVERSI�N. Utilizamos la clase Float,
			// y s� metodo para convertir de String al tipo simple float
			operando2 = Float.parseFloat(lectura);
		}
		catch (IOException ioe)
		{
			System.err.println("Error al manejar entrada/salida: " + ioe.getMessage());
		}
		catch (NumberFormatException nfe)
		{
			System.err.println("Los datos no parecen num�ricos: " + nfe.getMessage());
			// Reconducimos e iniciamos.
			iniciar();
		}
	}
	
	/**
	* leerOperador
	* Solicita al usuario el operador para la operaci�n
	*/
	public void leerOperador ()
	{
		// Para leero por consola hay que crear
		// dos instancias de clases especiales de E/S
		InputStreamReader lectorFlujoEntrada;
		BufferedReader lectorBuffer;
		
		String lectura = "";
		
		try 
		{
			lectorFlujoEntrada = new InputStreamReader(System.in);
			lectorBuffer = new BufferedReader(lectorFlujoEntrada);
		
			System.out.println("POr favor, introduzca la operaci�n a realizar: ");
			lectura = lectorBuffer.readLine(); 

			// La conversi�n es simple: del String que hemos leido sacamos el primer caracter
			operador = lectura.charAt(0);
		
			// No es el operador que esperabamos?
			if (operador != '+' && operador !='-' && operador != '*' && operador != '/')
			{
				throw new ExcepcionOperadorInvalido();
			}
		}
		catch (IOException ioe)
		{
			System.err.println("Error en los datos de entrada: " + ioe.getMessage());
			operador = '+';
		}
		catch (ExcepcionOperadorInvalido eoi) 
		{
			System.err.println("Problemas en el operador: " + eoi.getMessage());
		}
		catch (Exception e)
		{
			System.err.println("Ocurri� una excepci�n no prevista: " + e.getMessage());
		}
		finally 
		{
			// En la clausula finally entrar�a en cualquier caso, haya excepci�n o no

		}
		
	}
	
	/**
	* realizarOperacion
	* Lleva a cabo la operaci�n
	*/
	public void realizarOperacion ()
	{
		switch (operador)
		{
			case '+':
						resultado = operando1 + operando2;
						break;
			case '-':
						resultado = operando1 - operando2;
						break;
			case '*':
						resultado = operando1 * operando2;
						break;
			case '/':
						resultado = operando1 / operando2;
						break;			
		}
		
	}
	
	/**
	* mostrarResultado
	* Muestra el resultado de la operaci�n
	*/
	private void mostrarResultado ()
	{
		System.out.println("\n\tEl resultado es: " + resultado +"\n\n");
	}
	
	/**
	* main
	* Funci�n principal
	* esta funci�n es la que se inicia directamente al ejecutar el programa
	* ATENCI�N: debemos incluir una sentencia en la declaraci�n de la funci�n
	* para "avisar" de que puede ocurrir un error. Lo exige el compilador
	*/
	public static void main (String args[]) throws IOException
	{
		// Basta con crear la instancia
		// desde el constructor se lanza el resto
		Calculadora calculadora = new Calculadora();		

	}
}