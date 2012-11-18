/**
* ValoresReales
* Clase que muestra la declaraci�n de variables num�ricas <b>de coma flotante</b>
*
* Para compilar:
*   javac ValoresReales.java
*
* Para ejecutarlo:
*   java ValoresReales
*/

// Librer�a necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase ValoresReales
* Muestra la declaraci�n de tipos num�ricos reales o de coma flotante:
*  float   : real precisi�n simple, 4 bytes
*  double  : real precisi�n doble, 4 bytes
*
* @author Pello Altadill
*/
public class ValoresReales {
	
	/**
	* main
	* Funci�n principal
	* esta funci�n es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// En los tipos reales debemo usar un . en lugar de , para las decimales
		float temperatura;
		// Al asginar valor le ponemos la F para distinguir del tipo double
		float peso = 78.9F;

		double saldoCuentaCorriente = 3423343.43D;
		// Los valores altos se pueden abreviar:
		// esto ser�a 4.6 multiplicado por 10 elevado a 9.
		double masaJupiter = 4.6E+9D;
		
		
		// Vamos a probar a mostrarlos por pantalla: concatenamos con +
		System.out.println("Tu peso es : " + peso + ", y tu saldo: " + saldoCuentaCorriente);

		System.out.println("La masa de Jupiter: " + masaJupiter);
	}
}