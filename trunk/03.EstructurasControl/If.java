/**
* If
* Clase que muestra el uso de un bloque condicional if
*
* Para compilar:
*   javac If.java
*
* Para ejecutarlo:
*   java If
*/

// Librer�a necesaria para trabajar con la entrada/salida
import java.io.*;

/**
* clase If
* Muestra el uso de un bloque condicional if, cuyo interior solo
* se ejecuta si la condici�n del if es verdadera
*  if (condici�n)
*  {
*    sentecias_bloque_if;
*  }
*
* @author Pello Altadill
*/
public class If {
	
	/**
	* main
	* Funci�n principal
	* esta funci�n es la que se inicia directamente al ejecutar el programa
	*/
	public static void main (String args[])
	{
		// Declaramos una variable.
		int x = 666;
		int y = 0;
		
		
		if (x == 666)
		{
			System.out.println("x lleva la marca de la bestia");
		}
		
		// La condic�n del If puede ser cualquier expresi�n compleja siempre que devuelva un
		// valor booleano
		if (x > 0 && y < 0)
		{
			System.out.println("x es positivo e y negativo");
		}
		
		// Atenci�n: JAVA NO considera los enteros como booleanos!!
		// Tradicionalmente en c y otros lenguajes similares cualquier valor que sea distinto de 0 se considera como un true booleano
		// mientras que el 0 se considera como false.
		/*
		if (x) // En JAVA NO HACER ESTO
		{
			System.out.println("x es distinto de 0");
		}

		if (y) // En JAVA NO HACER ESTO
		{
			System.out.println("y es distinto de 0");
		}

		// por tanto !y es como preguntar si y es igual a 0
		// esta forma de escribir es muy kewl pero se considera poco clara
		if (!y) // En JAVA NO HACER ESTO
		{
			System.out.println("y es 0!!");
		}*/

	}
}