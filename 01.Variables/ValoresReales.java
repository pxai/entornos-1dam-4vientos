/**
* ValoresReales
* Clase que muestra la declaración de variables numéricas <b>de coma flotante</b>
*
* Para compilar:
*   javac ValoresReales.java
*
* Para ejecutarlo:
*   java ValoresReales
*/

// Librería necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase ValoresReales
* Muestra la declaración de tipos numéricos reales o de coma flotante:
*  float   : real precisión simple, 4 bytes
*  double  : real precisión doble, 4 bytes
*
* @author Pello Altadill
*/
public class ValoresReales {
	
	/**
	* main
	* Función principal
	* esta función es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// En los tipos reales debemo usar un . en lugar de , para las decimales
		float temperatura;
		// Al asginar valor le ponemos la F para distinguir del tipo double
		float peso = 78.9F;

		double saldoCuentaCorriente = 3423343.43D;
		// Los valores altos se pueden abreviar:
		// esto sería 4.6 multiplicado por 10 elevado a 9.
		double masaJupiter = 4.6E+9D;
		
		
		// Vamos a probar a mostrarlos por pantalla: concatenamos con +
		System.out.println("Tu peso es : " + peso + ", y tu saldo: " + saldoCuentaCorriente);

		System.out.println("La masa de Jupiter: " + masaJupiter);
	}
}